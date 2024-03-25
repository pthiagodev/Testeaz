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

import com.pthiago.leilaoapi.business.EmpresaBO;
import com.pthiago.leilaoapi.entity.Empresa;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;


@Validated
@RestController
@RequestMapping("/empresa")
@AllArgsConstructor
public class EmpresaService {

    private final EmpresaBO empresaBO;

    @GetMapping
    public ResponseEntity<Object> buscarTodos() {
        return new ResponseEntity<>(empresaBO.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Empresa buscarPorId(@PathVariable @NotNull @Positive Long id) {
        return empresaBO.buscarPorId(id);
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Empresa salvar(@RequestBody @Valid Empresa empresa) {
        return empresaBO.salvar(empresa);
    }

    @PutMapping("/{id}")
    public Empresa atualizar(@PathVariable @Positive Long id, @RequestBody @Valid Empresa empresaAtualizada) {
        return empresaBO.atualizar(id, empresaAtualizada);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable @NotNull @Positive Long id) {
        empresaBO.deletar(id);
    }
}
