package com.pthiago.leilaoapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.OffsetDateTime;

import java.io.Serializable;

@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {

    @Column(name = "created_at")
    @NotNull
    private OffsetDateTime createdAt;

    @Column(name = "updated_at")
    @NotNull
    private OffsetDateTime updatedAt;
}
