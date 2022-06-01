package io.github.evandrolopes85.doacoes.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_evento")
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer idEvento;

	@Column(name = "nome", length = 64, nullable = false)
	private String nome;

	@Column(name = "data_inicio", nullable = false)
	private LocalDate dataInicio;

	@Column(name = "data_fim", nullable = false)
	private LocalDate dataFim;

	@Column(name = "data_criacao", nullable = false)
	private LocalDate dataCriacao;

	@Column(name = "url_foto", length = 255, nullable = false)
	private String urlFoto;

	@Column(name = "ativo")
	private boolean ativo;

	@Column(name = "descricao", length = 255)
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "id_nome")
	//@JsonIgnoreProperties("eventos")
	private Pessoa pessoa;
	
	@OneToMany(mappedBy = "evento")
	@JsonIgnoreProperties("evento")
	private List<ItensDoEvento> itensDoEvento;

	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<ItensDoEvento> getItensDoEvento() {
		return itensDoEvento;
	}

	public void setItensDoEvento(List<ItensDoEvento> itensDoEvento) {
		this.itensDoEvento = itensDoEvento;
	}
	
	
}
