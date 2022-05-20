package io.github.evandrolopes85.doacoes.dto;

public class EventoDTO {
	private Integer id;
	private String nome;
	private Integer idPessoa;
	private String nomePessoa;
	private String emailPessoa;
	
	public EventoDTO(Integer id, String nome, Integer idPessoa, String nomePessoa, String emailPessoa) {
		super();
		this.id = id;
		this.nome = nome;
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.emailPessoa = emailPessoa;
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
	public String getEmailPessoa() {
		return emailPessoa;
	}
	public void setEmailPessoa(String emailPessoa) {
		this.emailPessoa = emailPessoa;
	}
	
	
}
