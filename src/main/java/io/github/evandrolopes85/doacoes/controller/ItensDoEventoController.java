package io.github.evandrolopes85.doacoes.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.evandrolopes85.doacoes.model.ItensDoEvento;
import io.github.evandrolopes85.doacoes.service.IItensDoEventoService;

@RestController
public class ItensDoEventoController {

	@Autowired
	private IItensDoEventoService service;
	
	@GetMapping("/itens")
	public ResponseEntity<ArrayList<ItensDoEvento>> recuperarTodosItensDoEvento(){
		ArrayList<ItensDoEvento> itens = service.recuperarTodosItensDoEvento();
		if(itens != null)
			return ResponseEntity.ok(itens);
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/itens")
	public ResponseEntity<ItensDoEvento> adicionaItensDoEvento(@RequestBody ItensDoEvento itensDoEvento){
		return null;
	}
	
	@PutMapping("/itens")
	public ResponseEntity<ItensDoEvento> atualizarItensDoEvento(@RequestBody ItensDoEvento itensDoEvento){
		return null;
	}
}
