package com.produto.faturamento.service;

import java.util.UUID;

import com.produto.faturamento.model.Aluno;

public interface AlunoService {
	
	Iterable<Aluno> buscarTodos();
	
	Aluno buscarPorId(UUID id);
	
	Aluno buscarPorCpf(String cpf);
	
	void cadastrar(Aluno aluno);
	
	void atualizar(Aluno aluno);
	
	void deletar(String cpf);
	
	Iterable<Aluno> buscarPorNome(String nome);
}
