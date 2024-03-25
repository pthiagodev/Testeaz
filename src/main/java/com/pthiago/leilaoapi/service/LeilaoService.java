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

import com.pthiago.leilaoapi.business.LeilaoBO;
import com.pthiago.leilaoapi.entity.Leilao;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;

@Validated
@RestController
@RequestMapping("/leilao")
@AllArgsConstructor
public class LeilaoService {
    private final LeilaoBO leilaoBO;

    @GetMapping
    public ResponseEntity<Object> buscarTodos() {
        return new ResponseEntity<>(leilaoBO.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Leilao buscarPorId(@PathVariable @NotNull @Positive Long id) {
        return leilaoBO.buscarPorId(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Leilao salvar(@RequestBody @Valid Leilao leilao) {
        return leilaoBO.salvar(leilao);
    }

    @PutMapping("/{id}")
    public Leilao atualizar(@PathVariable @Positive Long id, @RequestBody @Valid Leilao leilaoAtualizada) {
        return leilaoBO.atualizar(id, leilaoAtualizada);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable @NotNull @Positive Long id) {
        leilaoBO.deletar(id);
    }
}
