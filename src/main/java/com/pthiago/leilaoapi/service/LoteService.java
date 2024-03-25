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

import com.pthiago.leilaoapi.business.LoteBO;
import com.pthiago.leilaoapi.entity.Lote;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;

@Validated
@RestController
@RequestMapping("/lote")
@AllArgsConstructor
public class LoteService {
    private final LoteBO loteBO;

    @GetMapping
    public ResponseEntity<Object> buscarTodos() {
        return new ResponseEntity<>(loteBO.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Lote buscarPorId(@PathVariable @NotNull @Positive Long id) {
        return loteBO.buscarPorId(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Lote salvar(@RequestBody @Valid Lote lote) {
        return loteBO.salvar(lote);
    }

    @PutMapping("/{id}")
    public Lote atualizar(@PathVariable @Positive Long id, @RequestBody @Valid Lote loteAtualizado) {
        return loteBO.atualizar(id, loteAtualizado);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable @NotNull @Positive Long id) {
        loteBO.deletar(id);
    }
}
