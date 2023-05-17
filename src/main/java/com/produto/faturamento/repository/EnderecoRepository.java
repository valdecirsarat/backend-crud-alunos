package com.produto.faturamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.faturamento.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, String>{
	
	/* caso utilize endereco para cada aluno tem que inserir na classe endereço um id 
	 * tipo Long(comum) e mudar aqui <T,ID> 
	 */

}
