package com.pthiago.leilaoapi.entity;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Length(max = 64)
    private String logradouro;

    @Length(max = 64)
    private String municipio;

    @Length(max = 10)
    private String numero;

    @Length(max = 64)
    private String complemento;

    @Length(max = 64)
    private String bairro;

    @Length(max = 16)
    private String cep;

}
