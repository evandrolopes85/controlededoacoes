package io.github.evandrolopes85.rueirosdobem.service;

import java.util.ArrayList;
import java.util.List;

import io.github.evandrolopes85.rueirosdobem.model.Evento;

public interface IEventoService {
	public ArrayList<Evento> recuperarTodosEventos();
	public Evento recuperaEventoPorID(int id);
	public Evento adicionarEvento(Evento evento);
	public Evento atualizarPessoa(Evento evento);
	
//	public ArrayList<Evento> recuperarEventosPorIdDaPessoa(int idPessoa);
}
