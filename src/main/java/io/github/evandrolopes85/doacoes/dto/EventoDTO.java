package io.github.evandrolopes85.doacoes.dto;

import java.time.LocalDate;
import java.util.List;

import io.github.evandrolopes85.doacoes.model.Item;

public class EventoDTO {
	private Integer id;
	private String nome;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private LocalDate dataCriacao;
	private String urlFoto;
	private boolean ativo;
	private String descricao;
	//private Integer itens;
	private Integer idPessoa;
	private String nomePessoa;
	
	public EventoDTO(Integer id, String nome, LocalDate dataInicio, LocalDate dataFim, LocalDate dataCriacao,
			String urlFoto, boolean ativo, String descricao, Integer idPessoa, String nomePessoa) {
		super();
		this.id          = id;
		this.nome        = nome;
		this.dataInicio  = dataInicio;
		this.dataFim     = dataFim;
		this.dataCriacao = dataCriacao;
		this.urlFoto     = urlFoto;
		this.ativo       = ativo;
		this.descricao   = descricao;
//		this.itens       = itens;
		this.idPessoa    = idPessoa;
		this.nomePessoa  = nomePessoa;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getUrlFoto() {
		return urlFoto;
	}
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
//	public Integer getItens() {
//		return itens;
//	}
//	public void setItens(Integer itens) {
//		this.itens = itens;
//	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
}
