package io.github.evandrolopes85.doacoes.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class PessoaControllerTest{ // extends DoacoesApplicationTests{
	
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private PessoaController pessoaController;
	
	
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
