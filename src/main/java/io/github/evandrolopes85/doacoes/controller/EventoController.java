package io.github.evandrolopes85.doacoes.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.evandrolopes85.doacoes.dto.EventoDTO;
import io.github.evandrolopes85.doacoes.model.Evento;
import io.github.evandrolopes85.doacoes.service.IEventoService;

@RestController
@CrossOrigin("*")
public class EventoController {
	
	@Autowired
	private IEventoService service;

	@GetMapping("/evento")
	public ResponseEntity<ArrayList<Evento>> recuperarTodosEventos(){
		ArrayList<Evento> eventos = service.recuperarTodosEventos();
		if(eventos != null)
			return ResponseEntity.status(200).body(eventos);
		
		return ResponseEntity.status(404).build();
	}
	
	@GetMapping("/evento/{id}")
	public ResponseEntity<Evento> recuperarEventoPorID(@PathVariable int id){
		Evento evento = service.recuperaEventoPorID(id);
		
		if(evento != null) {
			return ResponseEntity.ok(evento);
		}
		
		return ResponseEntity.status(404).build();
	}
	
	@PostMapping("/evento")
	public ResponseEntity<Evento> adicionarEvento(@RequestBody Evento evento){
		if(evento != null) {
			service.adicionarEvento(evento);
			
			return ResponseEntity.ok(evento);
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/evento")
	public ResponseEntity<Evento> atualizarEvento(@RequestBody Evento evento){
		if(evento != null) {
			Evento e = service.atualizarEvento(evento);
			return ResponseEntity.status(200).body(e);
		}
		return ResponseEntity.badRequest().build();
	}
}
