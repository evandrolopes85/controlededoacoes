package io.github.evandrolopes85.doacoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer idPessoa;

	@Column(name = "nome", length = 64, nullable = false)
	private String nome;

	@Column(name = "email", length = 32, nullable = false)
	private String email;

	@Column(name = "telefone", length = 16, nullable = false)
	private String telefone;

	@Column(name = "senha", length = 16, nullable = false)
	private String senha;

	@Column(name = "administrador", nullable = false)
	private boolean administrador;

	@Column(name = "cep", length = 9, nullable = false)
	private String cep;

	@Column(name = "logradouro", length = 9, nullable = false)
	private String logradouro;

	@Column(name = "numero", length = 8, nullable = false)
	private String numero;

	@Column(name = "complemento", length = 16, nullable = false)
	private String complemento;

	@Column(name = "bairro", length = 32, nullable = false)
	private String bairro;

	@Column(name = "cidade", length = 32, nullable = false)
	private String cidade;

	@Column(name = "uf", length = 2, nullable = false)
	private String uf;

//	@OneToMany(mappedBy = "pessoa")
//	@JsonIgnoreProperties("pessoa")
//	private List<Evento> eventos;

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public void setId(Integer id) {
		this.idPessoa = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

//	public List<Evento> getEventos() {
//		return eventos;
//	}
//
//	public void setEventos(List<Evento> eventos) {
//		this.eventos = eventos;
//	}
}
