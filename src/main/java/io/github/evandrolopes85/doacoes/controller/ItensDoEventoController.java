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
		if(itensDoEvento != null) {
			ItensDoEvento itens = service.adicionaItensDoEvento(itensDoEvento);
			return ResponseEntity.status(201).body(itens);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/itens")
	public ResponseEntity<ItensDoEvento> atualizarItensDoEvento(@RequestBody ItensDoEvento itensDoEvento){
		ItensDoEvento updateItens;
		
		if(itensDoEvento != null && itensDoEvento.getIdItensDoEvento() != null) {
			updateItens = service.recuperarItensDoEventoPorId(itensDoEvento.getIdItensDoEvento());
			
			updateItens.setProduto(itensDoEvento.getProduto());
			updateItens.setQtdNecessaria(itensDoEvento.getQtdNecessaria());
			updateItens.setQtdObtida(itensDoEvento.getQtdObtida());
//			updateItens.setEvento(itensDoEvento.getEvento());
			
			return ResponseEntity.ok(service.atualizarItensDoEvento(updateItens) );
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/itens/doacao")
	public ResponseEntity<ItensDoEvento> doacao(@RequestBody ItensDoEvento item){
		
		ItensDoEvento upgrade = service.doacao(item);
		if(upgrade != null)
			return ResponseEntity.ok(upgrade);
		
		return ResponseEntity.notFound().build();
	}
}
