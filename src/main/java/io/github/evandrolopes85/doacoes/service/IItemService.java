package io.github.evandrolopes85.doacoes.service;

import java.util.ArrayList;

import io.github.evandrolopes85.doacoes.model.Item;

public interface IItemService {
	public ArrayList<Item> recuperarTodosItensDoEvento();
	public Item            recuperarItensDoEventoPorId(Integer id);
	public Item 			adicionaItensDoEvento(Item itensDoEvento);
	public Item			atualizarItensDoEvento(Item itensDoEvento);
	public Item			doacao(Item item);
}
