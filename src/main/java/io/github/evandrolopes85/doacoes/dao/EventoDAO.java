package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import io.github.evandrolopes85.doacoes.dto.EventoDTO;
import io.github.evandrolopes85.doacoes.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer>{

	public Evento findByIdEvento(Integer id);
	
	@Query("SELECT "
			+ "new io.github.evandrolopes85.doacoes.dto.EventoDTO("
			+ "evento.idEvento, evento.nome, evento.dataInicio, "
			+ "evento.dataFim, evento.dataCriacao, evento.urlFoto, "
			+ "evento.ativo, evento.descricao, pessoa.idPessoa, "
			+ "pessoa.nome) "
			+ "FROM Evento evento "
			+ "INNER JOIN Pessoa pessoa ON evento.pessoa.idPessoa = pessoa.idPessoa "
			+ "WHERE evento.idEvento = :id")
	public EventoDTO recuperarEventoDTOPorID(@Param("id") Integer id); 
}
