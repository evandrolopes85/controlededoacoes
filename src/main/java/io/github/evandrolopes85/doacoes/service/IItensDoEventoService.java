package io.github.evandrolopes85.doacoes.service;

import java.util.ArrayList;

import io.github.evandrolopes85.doacoes.model.ItensDoEvento;

public interface IItensDoEventoService {
	public ArrayList<ItensDoEvento> recuperarTodosItensDoEvento();
	public ItensDoEvento            recuperaEventoPorId(Integer id);
	public ItensDoEvento 			adicionaItensDoEvento(ItensDoEvento itensDoEvento);
	public ItensDoEvento			atualizarItensDoEvento(ItensDoEvento itensDoEvento);
}
