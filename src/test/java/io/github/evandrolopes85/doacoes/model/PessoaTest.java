package io.github.evandrolopes85.doacoes.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PessoaTest {

	private static Pessoa pessoa;
	
	@BeforeAll
	static void setUp() {
		pessoa = new Pessoa();
		pessoa.setNome("Evandro");
		pessoa.setEmail("evandrocwd@gmail.com");
		pessoa.setSenha("1234");
		
	}
	
	
	@Test
	@DisplayName("Testando se a Pessoa é nula")
	void testPessoaIsNotNull() {
		assertNotNull(pessoa);
	}
	
	@Test
	void testPessoaDadosObrigatorios() {
		assertAll("Pessoa",
				() -> assertTrue(!pessoa.getNome().isBlank() || pessoa.getNome().isEmpty()),
				() -> assertTrue(!pessoa.getEmail().isBlank()),
				() -> assertTrue(pessoa.getSenha().length() > 0 && !pessoa.getSenha().isBlank() || pessoa.getSenha().isEmpty())
				);
	}


}
