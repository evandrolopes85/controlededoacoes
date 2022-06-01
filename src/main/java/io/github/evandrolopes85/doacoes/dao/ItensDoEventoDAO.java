package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.repository.CrudRepository;

import io.github.evandrolopes85.doacoes.model.ItensDoEvento;

public interface ItensDoEventoDAO extends CrudRepository<ItensDoEvento, Integer>{
	
	public ItensDoEvento findByIdItensDoEvento(Integer id);

}
