package io.github.evandrolopes85.rueirosdobem.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.evandrolopes85.rueirosdobem.dao.EventoDAO;
import io.github.evandrolopes85.rueirosdobem.model.Evento;

@Component
public class EventoServiceimpl implements IEventoService{
	
	@Autowired
	private EventoDAO dao;

	@Override
	public ArrayList<Evento> recuperarTodosEventos() {
		// TODO Auto-generated method stub
		ArrayList<Evento> lista = (ArrayList<Evento>)dao.findAll();
		if(lista != null)
			return lista;
		
		return null;
	}

	@Override
	public Evento recuperaEventoPorID(int id) {
		// TODO Auto-generated method stub
		Evento evento = (Evento)dao.findByIdEvento(id);
		
		if(evento != null)
			return evento;
		
		return null;
	}

	@Override
	public Evento adicionarEvento(Evento evento) {
		// TODO Auto-generated method stub
		if(evento != null) {
			dao.save(evento);
			return evento;
		}
			
		return null;
	}

	@Override
	public Evento atualizarPessoa(Evento p) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public ArrayList<Evento> recuperarEventosPorIdDaPessoa(int idPessoa) {
//		// TODO Auto-generated method stub
//		return dao.recuperaEventosPorIdDaPessoa(idPessoa);
//	}

}
