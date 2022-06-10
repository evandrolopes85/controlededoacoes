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
		
		ItensDoEvento novosItens = itensDoEvento;
		if(novosItens != null) {
			return dao.save(novosItens);
		}
		return null;
	}

	@Override
	public ItensDoEvento atualizarItensDoEvento(ItensDoEvento itensDoEvento) {
		if(itensDoEvento != null) {
			return dao.save(itensDoEvento);
		}
		return null;
	}

	@Override
	public ItensDoEvento recuperarItensDoEventoPorId(Integer id) {
		// TODO Auto-generated method stub
		if(id != null) {
			return dao.findByIdItensDoEvento(id);
		}
		return null;
	}

	@Override
	public ItensDoEvento doacao(ItensDoEvento item) {
		// TODO Auto-generated method stub
		ItensDoEvento upgrade = dao.findByIdItensDoEvento(item.getIdItensDoEvento());
		upgrade.setIdItensDoEvento(item.getIdItensDoEvento());
		upgrade.setProduto(item.getProduto());
		upgrade.setQtdNecessaria(upgrade.getQtdNecessaria());
		upgrade.setQtdObtida(upgrade.getQtdObtida() + item.getQtdObtida());
		upgrade.setEvento(upgrade.getEvento());
		
		return dao.save(upgrade);
	}
}
