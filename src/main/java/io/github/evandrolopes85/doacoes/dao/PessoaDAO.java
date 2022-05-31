package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import io.github.evandrolopes85.doacoes.dto.PessoaDTO;
import io.github.evandrolopes85.doacoes.model.Pessoa;

public interface PessoaDAO extends CrudRepository<Pessoa, Integer>{
	public Pessoa findByIdPessoa(Integer id);
	
	@Query("SELECT "
			+ "new io.github.evandrolopes85.doacoes.dto.PessoaDTO("
			+ " pessoa.id, pessoa.nome, pessoa.email)"
			+ " FROM Pessoa pessoa"
			+ " WHERE pessoa.email = :email AND pessoa.senha = :senha")
	public PessoaDTO login(@Param("email")String email, @Param("senha") String senha);
	
	public Pessoa findByEmail(String email);
}
