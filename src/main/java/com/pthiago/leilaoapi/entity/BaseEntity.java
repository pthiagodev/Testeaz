package com.pthiago.leilaoapi.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "created_at")
    @NotNull
    private OffsetDateTime createdAt;

    @Column(name = "updated_at")
    @NotNull
    private OffsetDateTime updatedAt;
}
