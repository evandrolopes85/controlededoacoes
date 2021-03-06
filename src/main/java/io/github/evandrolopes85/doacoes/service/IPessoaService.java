package io.github.evandrolopes85.doacoes.service;

import java.util.ArrayList;

import io.github.evandrolopes85.doacoes.dto.PessoaDTO;
import io.github.evandrolopes85.doacoes.model.Pessoa;

public interface IPessoaService {

	public ArrayList<Pessoa> recuperarTodasPessoas();
	public Pessoa recuperaPorID(Integer id);
	public Pessoa recuperarPessoaPorEmail(String email);
	public Pessoa adicionarPessoa(Pessoa p);
	public Pessoa atualizarPessoa(Pessoa p);
	public PessoaDTO login(Pessoa pessoa);
}
