package com.pthiago.leilaoapi.business;

import java.util.List;
import java.util.Optional;

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
        return unidadeRepository.save(unidade);
    }

}
