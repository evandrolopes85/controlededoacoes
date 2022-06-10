package io.github.evandrolopes85.doacoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_evento_item")
public class ItensDoEvento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento_item")
	private Integer idItensDoEvento;
	
	@NotNull
	@Column(name = "produto", length = 100)
	private String produto;
	
	@NotNull
	@Column(name = "qtd_necessaria")
	private Integer qtdNecessaria;
	
	@Column(name = "qtd_obtida")
	private Integer qtdObtida;
	
	@ManyToOne()
	@JsonIgnoreProperties("itensDoEvento")
	@JoinColumn(name = "id_evento")
	private Evento evento;

	public Integer getIdItensDoEvento() {
		return idItensDoEvento;
	}

	public void setIdItensDoEvento(Integer idItensDoEvento) {
		this.idItensDoEvento = idItensDoEvento;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Integer getQtdNecessaria() {
		return qtdNecessaria;
	}

	public void setQtdNecessaria(Integer qtdNecessaria) {
		this.qtdNecessaria = qtdNecessaria;
	}

	public Integer getQtdObtida() {
		return qtdObtida;
	}

	public void setQtdObtida(Integer qtdObtida) {
		this.qtdObtida = qtdObtida;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
}
