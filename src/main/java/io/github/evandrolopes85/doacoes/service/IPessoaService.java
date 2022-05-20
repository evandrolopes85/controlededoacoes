package io.github.evandrolopes85.doacoes.service;

import java.util.ArrayList;

import io.github.evandrolopes85.doacoes.dto.PessoaDTO;
import io.github.evandrolopes85.doacoes.model.Pessoa;

public interface IPessoaService {

	public ArrayList<Pessoa> recuperarTodasPessoas();
	public PessoaDTO recuperaPorID(Integer id);
	public Pessoa adicionarPessoa(Pessoa p);
	public Pessoa atualizarPessoa(Pessoa p);
	//public Pessoa login(Pessoa pessoa);
}
