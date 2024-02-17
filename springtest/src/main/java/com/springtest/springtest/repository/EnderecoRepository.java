package com.springtest.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springtest.springtest.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
        
}
