package com.pthiago.leilaoapi.service;

import org.springframework.web.bind.annotation.RestController;

import com.pthiago.leilaoapi.business.UnidadeBO;
import com.pthiago.leilaoapi.entity.Unidade;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Validated
@RestController
@RequestMapping(value = "/unidades")
@AllArgsConstructor
public class UnidadeService {

    private final UnidadeBO unidadeBO;

    @GetMapping
    public ResponseEntity<Object> buscarTodos() {
        return new ResponseEntity<>(unidadeBO.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Unidade> buscarPorId(@PathVariable @NotNull @Positive Long id) {
        return unidadeBO.buscarPorId(id)
            .map(unidade -> ResponseEntity.ok().body(unidade))
            .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ResponseEntity<Unidade> salvar(@RequestBody @Valid Unidade unidade) {
        return ResponseEntity.status(HttpStatus.CREATED).body(unidadeBO.salvar(unidade));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Unidade> atualizar(@PathVariable @NotNull @Positive Long id, @RequestBody @Valid Unidade unidadeAtualizada) {
        return unidadeBO.buscarPorId(id)
            .map(unidadeSalva -> {
                Unidade unidade = unidadeBO.atualizar(unidadeSalva, unidadeAtualizada);
                return ResponseEntity.ok().body(unidade);
            })
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable @NotNull @Positive Long id) {

        return unidadeBO.buscarPorId(id)
            .map(unidade -> {
                unidadeBO.deletar(unidade);
                return ResponseEntity.noContent().<Void>build();
            })
            .orElse(ResponseEntity.notFound().build());
    }
}
