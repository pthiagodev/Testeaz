package com.pthiago.leilaoapi.service;

import org.springframework.web.bind.annotation.RestController;

import com.pthiago.leilaoapi.business.UnidadeBO;
import com.pthiago.leilaoapi.entity.Unidade;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
    public ResponseEntity<Unidade> buscarPorId(@PathVariable Long id) {
        return unidadeBO.buscarPorId(id)
            .map(unidade -> ResponseEntity.ok().body(unidade))
            .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ResponseEntity<Unidade> salvar(@RequestBody Unidade unidade) {
        return ResponseEntity.status(HttpStatus.CREATED).body(unidadeBO.salvar(unidade));
    }
    
}
