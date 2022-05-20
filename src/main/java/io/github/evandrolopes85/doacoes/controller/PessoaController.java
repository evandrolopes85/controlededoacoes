package io.github.evandrolopes85.doacoes.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.evandrolopes85.doacoes.dto.PessoaDTO;
import io.github.evandrolopes85.doacoes.model.Pessoa;
import io.github.evandrolopes85.doacoes.service.IPessoaService;

@RestController
public class PessoaController {

	@Autowired
	private IPessoaService service;

	@GetMapping("/pessoa")
	public ResponseEntity<ArrayList<Pessoa>> recuperarTodasPessoas() {
		
		return ResponseEntity.ok(service.recuperarTodasPessoas());
	}

	@GetMapping("/pessoa/{id}")
	public ResponseEntity<PessoaDTO> recuperaPessoaPorId(@PathVariable int id) {
		PessoaDTO p = service.recuperaPorID(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}

//	@GetMapping("/login")
//	public ResponseEntity<Pessoa> login(@RequestBody Pessoa pessoa) {
//		if (pessoa != null) {
//			Pessoa login = service.login(pessoa);
//			if (login != null) {
//				return ResponseEntity.ok(login);
//			}
//			return ResponseEntity.status(401).build();
//
//		}
//		return ResponseEntity.badRequest().build();
//	}

	@PostMapping("/pessoa")
	public ResponseEntity<Pessoa> adicionarPessoa(@RequestBody Pessoa pessoa) {
		if (pessoa != null) {
			Pessoa novaPessoa = service.adicionarPessoa(pessoa);
			return ResponseEntity.status(201).body(novaPessoa);
		}

		return ResponseEntity.badRequest().build();
	}

	@PutMapping("/pessoa")
	public ResponseEntity<Pessoa> atualizarPessoa(@RequestBody Pessoa pessoa) {
		Pessoa pessoaParaAtualizar = pessoa;
		if (pessoaParaAtualizar != null) {
			return ResponseEntity.status(200).body(service.atualizarPessoa(pessoaParaAtualizar));
		}

		return ResponseEntity.badRequest().build();
	}
}
