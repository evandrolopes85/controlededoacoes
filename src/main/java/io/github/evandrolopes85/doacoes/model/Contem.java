package io.github.evandrolopes85.doacoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_contem")
public class Contem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contem")
	private Integer idContem;
	
	@Column(name = "qtd_necessario", nullable = false)
	private int qtdNecessaria;
	
	@Column(name = "qtd_obtida", nullable = false)
	private int qtdObtida;

	public Integer getIdContem() {
		return idContem;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_tem")
	private Item item;

	@ManyToOne
	@JoinColumn(name = "id_evento")
	private Evento evento;
	
	public void setIdContem(Integer idContem) {
		this.idContem = idContem;
	}

	public int getQtdNecessaria() {
		return qtdNecessaria;
	}

	public void setQtdNecessaria(int qtdNecessaria) {
		this.qtdNecessaria = qtdNecessaria;
	}

	public int getQtdObtida() {
		return qtdObtida;
	}

	public void setQtdObtida(int qtdObtida) {
		this.qtdObtida = qtdObtida;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
}
