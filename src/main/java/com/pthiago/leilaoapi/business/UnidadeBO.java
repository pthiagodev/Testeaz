package com.pthiago.leilaoapi.business;

import java.util.List;
import java.time.OffsetDateTime;

import org.springframework.stereotype.Service;

import com.pthiago.leilaoapi.entity.Unidade;
import com.pthiago.leilaoapi.exception.RecordNotFoundException;
import com.pthiago.leilaoapi.repository.UnidadeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UnidadeBO {

    private final UnidadeRepository unidadeRepository;

    public List<Unidade> buscarTodos() {
        return unidadeRepository.findAll();
    }

    public Unidade buscarPorId(Long id) {
        return unidadeRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public Unidade salvar(Unidade unidade) {
        unidade.setCreatedAt(OffsetDateTime.now());
        unidade.setUpdatedAt(OffsetDateTime.now());
        return unidadeRepository.save(unidade);
    }

    public Unidade atualizar(Long id, Unidade unidadeAtualizada) {
        return unidadeRepository.findById(id)
            .map(unidadeSalva -> {
                unidadeSalva.setName(unidadeAtualizada.getName());
                unidadeSalva.setUpdatedAt(OffsetDateTime.now());
                return unidadeRepository.save(unidadeSalva);
            }).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public void deletar(Long id) {
        unidadeRepository.delete(unidadeRepository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException(id)));
    }

}
