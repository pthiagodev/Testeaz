package com.pthiago.leilaoapi.entity;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "leilao")
@SequenceGenerator(name = "seq_leilao", sequenceName = "seq_leilao", allocationSize = 1)
public class Leilao extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_leilao")
    private Long id;

    private Integer codigo;

    @NotBlank(message = "Descrição é obrigatória.")
    @Length(max = 60)
    private String descricao;

    @NotBlank(message = "Vendedor é obrigatório.")
    private Integer vendedor;

    @NotNull
    private OffsetDateTime inicioPrevisto;


    @OneToMany(mappedBy = "leilao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lote> lotes = new ArrayList<>();

}
