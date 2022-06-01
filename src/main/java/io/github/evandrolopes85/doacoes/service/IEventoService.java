package io.github.evandrolopes85.doacoes.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import io.github.evandrolopes85.doacoes.dto.EventoDTO;
import io.github.evandrolopes85.doacoes.model.Evento;

@Service
public interface IEventoService {
	public ArrayList<Evento> recuperarTodosEventos();
	public EventoDTO recuperarEventoDTOPorID(Integer id);
	public Evento recuperaEventoPorID(Integer id);
	public Evento adicionarEvento(Evento evento);
	public Evento atualizarEvento(Evento evento);
	
//	public EventoDTO recuperaEventoEPessoaPorId(Integer id);
	
//	public ArrayList<Evento> recuperarEventosPorIdDaPessoa(int idPessoa);
}
