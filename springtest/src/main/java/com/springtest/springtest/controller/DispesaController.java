package com.springtest.springtest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springtest.springtest.model.Dispesa;
import com.springtest.springtest.repository.DispesaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class DispesaController {
    
    private DispesaRepository repository;
    public DispesaController(DispesaRepository repository){
        this.repository = repository;
    }


    @GetMapping("/dispesas")
    public List<Dispesa> listarDispesas() {
        return repository.findAll(); 
    }
    

    @PostMapping("/dispesas")
    public void cadastrarDispesa(@RequestBody Dispesa dispesa){
        dispesa.setDataHorario(LocalDateTime.now());
        repository.save(dispesa);
    }

    
}
