package io.github.evandrolopes85.doacoes.factory;

import io.github.evandrolopes85.doacoes.model.Pessoa;

public class Factory {
	
	public static Pessoa createPessoa() {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(null);
		pessoa.setNome("Tiago");
		pessoa.setEmail("tiago@email.com");
		pessoa.setTelefone("11912345678");
		pessoa.setSenha("1234");
		pessoa.setAdministrador(1);
		pessoa.setCep("0800000");
		pessoa.setLogradouro("rua");
		pessoa.setNumero("0");
		pessoa.setComplemento("a");
		pessoa.setBairro("bairro");
		pessoa.setCidade("cidade");
		pessoa.setUf("uf");
		
		return pessoa;
	}
}
