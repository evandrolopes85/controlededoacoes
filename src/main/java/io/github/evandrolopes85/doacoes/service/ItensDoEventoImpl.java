package io.github.evandrolopes85.doacoes.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.evandrolopes85.doacoes.dao.ItensDoEventoDAO;
import io.github.evandrolopes85.doacoes.model.ItensDoEvento;

@Component
public class ItensDoEventoImpl implements IItensDoEventoService{

	@Autowired
	private ItensDoEventoDAO dao;
	
	@Override
	public ArrayList<ItensDoEvento> recuperarTodosItensDoEvento() {
		// TODO Auto-generated method stub
		return (ArrayList<ItensDoEvento>)dao.findAll();
	}

	@Override
	public ItensDoEvento adicionaItensDoEvento(ItensDoEvento itensDoEvento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItensDoEvento atualizarItensDoEvento(ItensDoEvento itensDoEvento) {
		// TODO Auto-generated method stub
		return null;
	}
}
