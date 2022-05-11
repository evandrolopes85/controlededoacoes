package io.github.evandrolopes85.rueirosdobem.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import io.github.evandrolopes85.rueirosdobem.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer>{
	
//	@Query("select e from Evento e JOIN FETCH e.pessoa p where e.pessoa.idPessoa = :idPessoa")
//	public ArrayList<Evento> recuperaEventosPorIdDaPessoa(@Param("idPessoa") int pessoa);
	
	public Evento findByIdEvento(int id);
}
