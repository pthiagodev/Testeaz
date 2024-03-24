package com.pthiago.leilaoapi.business;

import java.util.List;
import java.util.Optional;
import java.time.OffsetDateTime;

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

    public Unidade atualizar(Unidade unidadeSalva, Unidade unidadeAtualizada) {
        unidadeSalva.setName(unidadeAtualizada.getName());
        unidadeSalva.setUpdatedAt(OffsetDateTime.now());

        return unidadeRepository.save(unidadeSalva);
    }

    public void deletar(Unidade unidade) {
        unidadeRepository.delete(unidade);
    }

}
