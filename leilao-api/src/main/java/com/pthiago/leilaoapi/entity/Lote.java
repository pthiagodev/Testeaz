package com.pthiago.leilaoapi.entity;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
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
@Table(name = "lote")
@SequenceGenerator(name = "seq_lote", sequenceName = "seq_lote", allocationSize = 1)
public class Lote extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_lote")
    private Long id;

    private Integer numeroLote;

    @NotBlank(message = "Descrição é obrigatória.")
    @Length(max = 60)
    private String descricao;

    @NotBlank(message = "Quantidade é obrigatória.")
    private BigDecimal quantidade;

    private BigDecimal valorInicial;

    @Length(max = 128)
    private String unidade;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "leilao", nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Leilao leilao;

}
