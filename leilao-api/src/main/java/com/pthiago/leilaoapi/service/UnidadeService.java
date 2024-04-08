package com.pthiago.leilaoapi.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pthiago.leilaoapi.business.UnidadeBO;
import com.pthiago.leilaoapi.entity.Unidade;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;

@Validated
@RestController
@RequestMapping(value = "/api/unidade")
@AllArgsConstructor
public class UnidadeService {

    private final UnidadeBO unidadeBO;

    @GetMapping
    public ResponseEntity<Object> buscarTodos() {
        return new ResponseEntity<>(unidadeBO.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Unidade buscarPorId(@PathVariable @NotNull @Positive Long id) {
        return unidadeBO.buscarPorId(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Unidade salvar(@RequestBody @Valid Unidade unidade) {
        return unidadeBO.salvar(unidade);
    }

    @PutMapping("/{id}")
    public Unidade atualizar(@PathVariable @NotNull @Positive Long id, @RequestBody @Valid Unidade unidadeAtualizada) {
        return unidadeBO.atualizar(id, unidadeAtualizada);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable @NotNull @Positive Long id) {
        unidadeBO.deletar(id);
    }
}
