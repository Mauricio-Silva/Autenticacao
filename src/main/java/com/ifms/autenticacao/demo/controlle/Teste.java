package com.ifms.autenticacao.demo.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {
	
	@GetMapping(value="/mensagem")
	public String mensagem() {
		return "Hello World!";
	}
}

// https://start.spring.io/