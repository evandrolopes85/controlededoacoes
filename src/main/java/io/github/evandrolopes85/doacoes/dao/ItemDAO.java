package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.repository.CrudRepository;

import io.github.evandrolopes85.doacoes.model.Item;

public interface ItemDAO extends CrudRepository<Item, Integer>{
	
	public Item findByIdItem(Integer id);

}
