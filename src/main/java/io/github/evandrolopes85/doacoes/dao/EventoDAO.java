package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.repository.CrudRepository;

import io.github.evandrolopes85.doacoes.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer>{
	
//	@Query("select e from Evento e JOIN FETCH e.pessoa p where e.pessoa.idPessoa = :idPessoa")
//	public ArrayList<Evento> recuperaEventosPorIdDaPessoa(@Param("idPessoa") int pessoa);
	
//	@Query("select evento.idEvento, evento.nome, evento.dataInicio, evento.dataFim, evento.dataCriacao, evento.urlFoto, evento.ativo, evento.descricao, evento.pessoa.idPessoa from Evento evento")
//	public ArrayList<Evento> recuperarTodosEventos();
	
//	@Query("SELECT "
//			+ "new io.github.evandrolopes85.doacoes.dto.EventoDTO(e.idEvento, e.nome, p.idPessoa, p.nome, p.email) FROM Evento e"
//			+ "INNER JOIN Pessoa p"
//			+ "ON e.pessoa.idPessoa = p.idPessoa"
//			+ "WHERE e.idEvento = :id")
//	public EventoDTO recuperaEventoEPessoaPorId(@Param("id") Integer id);
	
	public Evento findByIdEvento(Integer id);
}
