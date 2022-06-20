package io.github.evandrolopes85.doacoes.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.evandrolopes85.doacoes.model.Item;
import io.github.evandrolopes85.doacoes.service.IItemService;

@RestController
public class ItemController {

	@Autowired
	private IItemService service;
	
	@GetMapping("/itens")
	public ResponseEntity<ArrayList<Item>> recuperarTodosItensDoEvento(){
		ArrayList<Item> itens = service.recuperarTodosItensDoEvento();
		if(itens != null)
			return ResponseEntity.ok(itens);
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/itens")
	public ResponseEntity<Item> adicionaItensDoEvento(@RequestBody Item itensDoEvento){
		if(itensDoEvento != null) {
			Item itens = service.adicionaItensDoEvento(itensDoEvento);
			return ResponseEntity.status(201).body(itens);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/itens")
	public ResponseEntity<Item> atualizarItensDoEvento(@RequestBody Item itensDoEvento){
		Item updateItens;
		
		if(itensDoEvento != null && itensDoEvento.getIdItem() != null) {
			updateItens = service.recuperarItensDoEventoPorId(itensDoEvento.getIdItem());
			
			updateItens.setProduto(itensDoEvento.getProduto());
			
			return ResponseEntity.ok(service.atualizarItensDoEvento(updateItens) );
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/itens/doacao")
	public ResponseEntity<Item> doacao(@RequestBody Item item){
		
		Item upgrade = service.doacao(item);
		if(upgrade != null)
			return ResponseEntity.ok(upgrade);
		
		return ResponseEntity.notFound().build();
	}
}
