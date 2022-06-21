package io.github.evandrolopes85.doacoes.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import io.github.evandrolopes85.doacoes.DoacoesApplicationTests;

//@AutoConfigureMockMvc
public class PessoaControllerTest extends DoacoesApplicationTests{
	
	private MockMvc mockMvc;

	@Autowired
	private PessoaController pessoaController;
	
	@BeforeEach
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(pessoaController).build();
	}
	
	@Test
	public void recuperarTodasPessoas_RetornarStatusCode200() throws Exception{
		mockMvc.perform(
				MockMvcRequestBuilders.get("/pessoa")
				.contentType(MediaType.APPLICATION_JSON)
				)
		.andExpect(MockMvcResultMatchers.status().isOk())
		;
	}
}
