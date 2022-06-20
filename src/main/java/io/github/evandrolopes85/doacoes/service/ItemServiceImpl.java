package io.github.evandrolopes85.doacoes.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.evandrolopes85.doacoes.dao.ItemDAO;
import io.github.evandrolopes85.doacoes.model.Item;

@Component
public class ItemServiceImpl implements IItemService{

	@Autowired
	private ItemDAO dao;
	
	@Override
	public ArrayList<Item> recuperarTodosItensDoEvento() {
		// TODO Auto-generated method stub
		return (ArrayList<Item>)dao.findAll();
	}

	@Override
	public Item adicionaItensDoEvento(Item itensDoEvento) {
		
		Item novosItens = itensDoEvento;
		if(novosItens != null) {
			return dao.save(novosItens);
		}
		return null;
	}

	@Override
	public Item atualizarItensDoEvento(Item itensDoEvento) {
		if(itensDoEvento != null) {
			return dao.save(itensDoEvento);
		}
		return null;
	}

	@Override
	public Item recuperarItensDoEventoPorId(Integer id) {
		// TODO Auto-generated method stub
		if(id != null) {
			return dao.findByIdItem(id);
		}
		return null;
	}

	@Override
	public Item doacao(Item item) {
		// TODO Auto-generated method stub
		Item upgrade = dao.findByIdItem(item.getIdItem());
		upgrade.setIdItem(item.getIdItem());
		upgrade.setProduto(item.getProduto());
		
		if(upgrade != null)
			return dao.save(upgrade);
		
		return null;
	}
}
