package com.pthiago.leilaoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pthiago.leilaoapi.entity.Lote;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Long> {

}
