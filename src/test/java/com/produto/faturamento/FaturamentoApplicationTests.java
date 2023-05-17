package com.produto.faturamento;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.produto.faturamento.model.Usuario;
import com.produto.faturamento.repository.UsuarioRepository;

@SpringBootTest
class FaturamentoApplicationTests {
	@Autowired
	 private UsuarioRepository repository;
	@Test
	void contextLoads() {
	}
	 
	@Test
	void teste() {	
		Usuario u = new Usuario();
		u.setLogin("qwer");
		u.setNome("ddddsds");
		u.setSenha("eeeee");
		u.setRole("USER");
		repository.save(u);
	}

}
