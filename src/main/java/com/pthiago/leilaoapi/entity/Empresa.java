package com.pthiago.leilaoapi.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "empresa")
@SequenceGenerator(name = "seq_empresa", sequenceName = "seq_empresa", allocationSize = 1)
public class Empresa extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_empresa")
    private Long id;

    @Column(name = "razao_social")
    @Length(max = 64)
    @NotBlank(message = "Razão Social é obrigatória.")
    private String razaoSocial;

    @Column(name = "cnpj")
    @CNPJ
    @NotBlank(message = "CNPJ é obrigatório.")
    private String cnpj;

    @Embedded
    private Endereco endereco;

    @Length(max = 32)
    private String telefone;

    @NotBlank(message = "E-mail é obrigatório.")
    @Email(message = "E-mail inválido.")
    @Length(max = 254)
    private String email;

    @Length(max = 254)
    private String site;

    @NotBlank(message = "Usuário é obrigatório.")
    @Length(max = 20)
    private String usuario;

    @Length(max = 128)
    private String senha;
    
}
