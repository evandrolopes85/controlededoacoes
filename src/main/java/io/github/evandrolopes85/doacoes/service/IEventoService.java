package io.github.evandrolopes85.doacoes.service;

import java.util.ArrayList;
import java.util.List;

import io.github.evandrolopes85.doacoes.model.Evento;

public interface IEventoService {
	public ArrayList<Evento> recuperarTodosEventos();
	public Evento recuperaEventoPorID(int id);
	public Evento adicionarEvento(Evento evento);
	public Evento atualizarPessoa(Evento evento);
	
//	public ArrayList<Evento> recuperarEventosPorIdDaPessoa(int idPessoa);
}
