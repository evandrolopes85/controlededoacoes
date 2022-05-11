package io.github.evandrolopes85.rueirosdobem.dao;

import org.springframework.data.repository.CrudRepository;

import io.github.evandrolopes85.rueirosdobem.model.Pessoa;

public interface PessoaDAO extends CrudRepository<Pessoa, Integer>{

	public Pessoa findByIdPessoa(int id);
	public Pessoa findByEmailAndSenha(String email, String senha);
}
