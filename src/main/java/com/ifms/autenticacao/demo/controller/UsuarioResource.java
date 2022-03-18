package com.ifms.autenticacao.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioRepository repository;
	
	
	@PostMapping(value="/insert")
	public Usuario inserir(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	
	@GetMapping(value="/list")
	public List<Usuario> listAll(){
		return repository.findAll();
	}
}
