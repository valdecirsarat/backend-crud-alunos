package com.produto.faturamento.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluno {
	/*Colocar os validaddores apos as realizações de teste*/	
	
	
	@Id
	@GeneratedValue
	private UUID id;
	private String nome;
	@ManyToOne
	private Endereco edereco;
	private String contato;
	//@CPF(message =" CPF '${validatedValue}' é Invalido")
	private String cpf;
	

}
