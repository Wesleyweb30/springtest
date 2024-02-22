package com.springtest.springtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.springtest.model.Endereco;
import com.springtest.springtest.model.Usuario;
import com.springtest.springtest.repository.EnderecoRepository;
import com.springtest.springtest.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UsuarioController {
    private UsuarioRepository usuarioRepository;
    private EnderecoRepository enderecoRepository;

    public UsuarioController(UsuarioRepository usuarioRepository, EnderecoRepository enderecoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.enderecoRepository = enderecoRepository;
    }

    @GetMapping("usuarios")
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping("usuarios")
    public List<Usuario> cadastrarUsuario(@RequestBody Usuario usuario, Endereco endereco) {
        // TODO: process POST request
        usuario.setEndereco(endereco);
        usuarioRepository.save(usuario);
        return usuarioRepository.findAll();
    }

}
