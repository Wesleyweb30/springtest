package com.springtest.springtest.controller;

import org.springframework.web.bind.annotation.RestController;
import com.springtest.springtest.model.Endereco;
import com.springtest.springtest.repository.EnderecoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class EnderecoController {

    
    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping("/enderecos")
    public Endereco cadastrarEndereco(@RequestBody Endereco endereco) {
        enderecoRepository.save(endereco);
        return endereco;
    }

    @GetMapping("/enderecos")
    public List<Endereco> listarEnderecos() {
        return enderecoRepository.findAll();
    }

}
