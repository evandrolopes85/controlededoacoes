package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.repository.CrudRepository;

import io.github.evandrolopes85.doacoes.model.Pessoa;

public interface PessoaDAO extends CrudRepository<Pessoa, Integer>{

//	@Query("SELECT pessoa.nome FROM Pessoa pessoa INNER JOIN Evento evento ON pessoa.id = evento.pessoa.id")
//	public ArrayList<Pessoa> recuperarPessoasEEventos();
	
	public Pessoa findByIdPessoa(Integer id);
	public Pessoa findByEmailAndSenha(String email, String senha);
	
//	@Query("SELECT new io.github.evandrolopes85.doacoes.dto.PessoaDTO("
//			+ "p.idPessoa, p.nome, p.senha)"
//			+ " FROM Pessoa p"
//			+ " WHERE p.idPessoa = :id")
//	public PessoaDTO recuperarPessoaPorId(@Param("id") Integer id);
}
