package com.pthiago.leilaoapi.business;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pthiago.leilaoapi.entity.Empresa;
import com.pthiago.leilaoapi.exception.RecordNotFoundException;
import com.pthiago.leilaoapi.repository.EmpresaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmpresaBO {

    private final EmpresaRepository empresaRepository;

    public List<Empresa> buscarTodos() {
        return empresaRepository.findAll();
    }

    public Empresa buscarPorId(Long id) {
        return empresaRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public Empresa salvar(Empresa Empresa) {
        Empresa.setCreatedAt(OffsetDateTime.now());
        Empresa.setUpdatedAt(OffsetDateTime.now());
        return empresaRepository.save(Empresa);
    }

    public Empresa atualizar(Long id, Empresa empresaAtualizada) {
        return empresaRepository.findById(id)
            .map(empresaSalva -> {
                empresaSalva.setRazaoSocial(empresaAtualizada.getRazaoSocial());
                empresaSalva.setCnpj(empresaAtualizada.getCnpj());
                empresaSalva.setEndereco(empresaAtualizada.getEndereco());
                empresaSalva.setTelefone(empresaAtualizada.getTelefone());
                empresaSalva.setEmail(empresaAtualizada.getEmail());
                empresaSalva.setSite(empresaAtualizada.getSite());
                empresaSalva.setUsuario(empresaAtualizada.getUsuario());
                empresaSalva.setSenha(empresaAtualizada.getSenha());
                empresaSalva.setUpdatedAt(OffsetDateTime.now());
                
                return empresaRepository.save(empresaSalva);
            }).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public void deletar(Long id) {
        empresaRepository.delete(empresaRepository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException(id)));
    }
}
