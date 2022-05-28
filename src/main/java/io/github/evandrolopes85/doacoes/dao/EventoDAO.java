package io.github.evandrolopes85.doacoes.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.github.evandrolopes85.doacoes.dto.EventoDTO;
import io.github.evandrolopes85.doacoes.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer>{
	
//	@Query("select e from Evento e JOIN FETCH e.pessoa p where e.pessoa.idPessoa = :idPessoa")
//	public ArrayList<Evento> recuperaEventosPorIdDaPessoa(@Param("idPessoa") int pessoa);
	
//	@Query("select evento.idEvento, evento.nome, evento.dataInicio, evento.dataFim, evento.dataCriacao, evento.urlFoto, evento.ativo, evento.descricao, evento.pessoa.idPessoa from Evento evento")
//	public ArrayList<Evento> recuperarTodosEventos();
	
	@Query("SELECT "
			+ " new io.github.evandrolopes85.doacoes.dto.EventoDTO("
			+ " evento.idEvento, evento.nome, evento.dataInicio, evento.dataFim, evento.dataCriacao,"
			+ " evento.urlFoto, evento.ativo, evento.descricao, itens.idItensDoEvento) " 
			+ " FROM Evento evento INNER JOIN ItensDoEvento itens ON evento.idEvento = itens.idItensDoEvento")
	public List<EventoDTO> recuperaEventosEItens(); 
//	
//	private LocalDate dataInicio;
//	private LocalDate dataFim;
//	private LocalDate dataCriacao;
//	private String urlFoto;
//	private boolean ativo;
//	private String descricao;
	
	public Evento findByIdEvento(Integer id);
}
