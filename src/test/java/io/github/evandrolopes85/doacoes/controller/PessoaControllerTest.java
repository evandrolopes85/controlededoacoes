package io.github.evandrolopes85.doacoes.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.evandrolopes85.doacoes.factory.Factory;
import io.github.evandrolopes85.doacoes.model.Pessoa;

@SpringBootTest
@AutoConfigureMockMvc
public class PessoaControllerTest{ // extends DoacoesApplicationTests{
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objecMapper;

	@Autowired
	private PessoaController pessoaController;
	
	@Test
	public void adicionarPessoa_RetornarStatusCode201() throws Exception {
		
		Pessoa pessoa = Factory.createPessoa();
		
		String json = this.objecMapper.writeValueAsString(pessoa);

		mockMvc.perform(MockMvcRequestBuilders.post("/pessoa")
						.contentType(MediaType.APPLICATION_JSON)
						.content(json)
				)
		.andExpect(MockMvcResultMatchers.status().isCreated());
	}
	
	@Test
	public void erroAdicionarPessoa_RetornarStatusCode400() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.post("/pessoa")
						.contentType(MediaType.APPLICATION_JSON)
				)
		.andExpect(MockMvcResultMatchers.status().isBadRequest());
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
