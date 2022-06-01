package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.repository.CrudRepository;

import io.github.evandrolopes85.doacoes.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer>{

	public Evento findByIdEvento(Integer id);
}
