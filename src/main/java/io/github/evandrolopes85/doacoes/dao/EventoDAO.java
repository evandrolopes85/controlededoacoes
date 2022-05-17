package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.repository.CrudRepository;

import io.github.evandrolopes85.doacoes.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer>{
	
//	@Query("select e from Evento e JOIN FETCH e.pessoa p where e.pessoa.idPessoa = :idPessoa")
//	public ArrayList<Evento> recuperaEventosPorIdDaPessoa(@Param("idPessoa") int pessoa);
	
//	@Query("select evento.idEvento, evento.nome, evento.dataInicio, evento.dataFim, evento.dataCriacao, evento.urlFoto, evento.ativo, evento.descricao, evento.pessoa.idPessoa from Evento evento")
//	public ArrayList<Evento> recuperarTodosEventos();
	
	public Evento findByIdEvento(int id);
}
