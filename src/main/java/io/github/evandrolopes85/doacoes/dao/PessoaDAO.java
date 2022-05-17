package io.github.evandrolopes85.doacoes.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.github.evandrolopes85.doacoes.model.Pessoa;

public interface PessoaDAO extends CrudRepository<Pessoa, Integer>{

//	@Query("SELECT pessoa.nome FROM Pessoa pessoa INNER JOIN Evento evento ON pessoa.id = evento.pessoa.id")
//	public ArrayList<Pessoa> recuperarPessoasEEventos();
	
	public Pessoa findByIdPessoa(int id);
	public Pessoa findByEmailAndSenha(String email, String senha);
}
