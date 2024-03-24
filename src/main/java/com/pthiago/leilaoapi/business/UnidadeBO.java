package com.pthiago.leilaoapi.business;

import java.util.List;
import java.util.Optional;
import java.time.OffsetDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pthiago.leilaoapi.entity.Unidade;
import com.pthiago.leilaoapi.repository.UnidadeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UnidadeBO {

    private final UnidadeRepository unidadeRepository;

    public List<Unidade> buscarTodos() {
        return unidadeRepository.findAll();
    }

    public Optional<Unidade> buscarPorId(Long id) {
        return unidadeRepository.findById(id);
    }

    public Unidade salvar(Unidade unidade) {
        unidade.setCreatedAt(OffsetDateTime.now());
        return unidadeRepository.save(unidade);
    }

    public Optional<Unidade> atualizar(Long id, Unidade unidadeAtualizada) {
        return unidadeRepository.findById(id)
            .map(unidadeSalva -> {
                unidadeSalva.setName(unidadeAtualizada.getName());
                unidadeSalva.setUpdatedAt(OffsetDateTime.now());
                return unidadeRepository.save(unidadeSalva);
            });
    }

    public boolean deletar(Long id) {

        return unidadeRepository.findById(id)
            .map(unidade -> {
                unidadeRepository.delete(unidade);
                return true;
            })
            .orElse(false);
    }

}
