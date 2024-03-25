package com.pthiago.leilaoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pthiago.leilaoapi.entity.Unidade;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {

}
