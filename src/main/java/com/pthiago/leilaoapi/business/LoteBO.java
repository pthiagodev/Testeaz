package com.pthiago.leilaoapi.business;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pthiago.leilaoapi.entity.Lote;
import com.pthiago.leilaoapi.exception.RecordNotFoundException;
import com.pthiago.leilaoapi.repository.LeilaoRepository;
import com.pthiago.leilaoapi.repository.LoteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoteBO {
    private final LoteRepository loteRepository;
    private final LeilaoRepository leilaoRepository;

    public List<Lote> buscarTodos() {
        return loteRepository.findAll();
    }

    public Lote buscarPorId(Long id) {
        return loteRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public Lote salvar(Lote lote) {
        return leilaoRepository.findById(lote.getLeilao().getId())
            .map(leilao -> {
                lote.setLeilao(leilao);
                lote.setCreatedAt(OffsetDateTime.now());
                lote.setUpdatedAt(OffsetDateTime.now());

                return loteRepository.save(lote);
            }).orElseThrow(() -> new RecordNotFoundException(lote.getLeilao().getId()));
    }

    public Lote atualizar(Long id, Lote loteAtualizada) {
        return loteRepository.findById(id)
            .map(loteSalvo -> {
                loteSalvo.setNumeroLote(loteAtualizada.getNumeroLote());
                loteSalvo.setDescricao(loteAtualizada.getDescricao());
                loteSalvo.setQuantidade(loteAtualizada.getQuantidade());
                loteSalvo.setValorInicial(loteAtualizada.getValorInicial());
                loteSalvo.setUnidade(loteAtualizada.getUnidade());
                loteSalvo.setUpdatedAt(OffsetDateTime.now());
                
                return loteRepository.save(loteSalvo);
            }).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public void deletar(Long id) {
        loteRepository.delete(loteRepository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException(id)));
    }
}
