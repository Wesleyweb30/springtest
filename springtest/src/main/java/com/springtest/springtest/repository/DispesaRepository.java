package com.springtest.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.springtest.model.Dispesa;

public interface DispesaRepository extends JpaRepository<Dispesa, Long>{
    
}
