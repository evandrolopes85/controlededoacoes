package io.github.evandrolopes85.rueirosdobem.service;

import java.util.ArrayList;

import io.github.evandrolopes85.rueirosdobem.model.Pessoa;

public interface IPessoaService {

	public ArrayList<Pessoa> recuperarTodasPessoas();
	public Pessoa recuperaPorID(int id);
	public Pessoa adicionarPessoa(Pessoa p);
	public Pessoa atualizarPessoa(Pessoa p);
	public Pessoa login(Pessoa pessoa);
}
