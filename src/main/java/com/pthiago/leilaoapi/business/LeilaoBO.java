package com.pthiago.leilaoapi.business;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pthiago.leilaoapi.entity.Leilao;
import com.pthiago.leilaoapi.exception.RecordNotFoundException;
import com.pthiago.leilaoapi.repository.LeilaoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LeilaoBO {

    private final LeilaoRepository leilaoRepository;

    public List<Leilao> buscarTodos() {
        return leilaoRepository.findAll();
    }

    public Leilao buscarPorId(Long id) {
        return leilaoRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public Leilao salvar(Leilao leilao) {
        leilao.setCreatedAt(OffsetDateTime.now());
        leilao.setUpdatedAt(OffsetDateTime.now());
        return leilaoRepository.save(leilao);
    }

    public Leilao atualizar(Long id, Leilao leilaoAtualizada) {
        return leilaoRepository.findById(id)
            .map(leilaoSalvo -> {
                leilaoSalvo.setCodigo(leilaoAtualizada.getCodigo());
                leilaoSalvo.setDescricao(leilaoAtualizada.getDescricao());
                leilaoSalvo.setVendedor(leilaoAtualizada.getVendedor());
                leilaoSalvo.setInicioPrevisto(leilaoAtualizada.getInicioPrevisto());
                leilaoSalvo.setUpdatedAt(OffsetDateTime.now());
                
                return leilaoRepository.save(leilaoSalvo);
            }).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public void deletar(Long id) {
        leilaoRepository.delete(leilaoRepository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException(id)));
    }
}
