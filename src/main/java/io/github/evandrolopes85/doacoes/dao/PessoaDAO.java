package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import io.github.evandrolopes85.doacoes.dto.PessoaDTO;
import io.github.evandrolopes85.doacoes.model.Pessoa;

public interface PessoaDAO extends CrudRepository<Pessoa, Integer>{

//	@Query("SELECT pessoa.nome FROM Pessoa pessoa INNER JOIN Evento evento ON pessoa.id = evento.pessoa.id")
//	public ArrayList<Pessoa> recuperarPessoasEEventos();
	
	public Pessoa findByIdPessoa(int id);
	public Pessoa findByEmailAndSenha(String email, String senha);
	
	@Query("SELECT new io.github.eventolopes85.doacoes.dto.PessoaDTO("
			+ "p.id, p.nome, p.senha)"
			+ "FROM Pessoa p"
			+ "WHERE p.id = :id")
	public PessoaDTO recuperarPessoaPorId(@Param("id") Integer id);
}
