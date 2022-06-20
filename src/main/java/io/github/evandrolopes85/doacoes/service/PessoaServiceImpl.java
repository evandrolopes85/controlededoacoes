package io.github.evandrolopes85.doacoes.service;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import io.github.evandrolopes85.doacoes.dao.PessoaDAO;
import io.github.evandrolopes85.doacoes.dto.PessoaDTO;
import io.github.evandrolopes85.doacoes.model.Pessoa;

@Service
public class PessoaServiceImpl implements IPessoaService{

	@Autowired
	private PessoaDAO dao;
	
	@Override
	public ArrayList<Pessoa> recuperarTodasPessoas() {
		// TODO Auto-generated method stub
		ArrayList<Pessoa> lista = (ArrayList<Pessoa>)dao.findAll();
		if(lista == null)
			return null;
		
		return lista;
	}

	@Override
	public Pessoa recuperaPorID(Integer id) {
		// TODO Auto-generated method stub
		if(id == null)
			return null;
		
		Pessoa p = dao.findByIdPessoa(id);
		if(p != null)
			return p;
		
		return null;
	}

	@Override
	public Pessoa adicionarPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		Pessoa novaPessoa = p;
		
		if(novaPessoa != null) {
			dao.save(novaPessoa);
			return novaPessoa;
		}
		
		return null;
	}

	@Override
	public Pessoa atualizarPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		if(p.getIdPessoa() == null)
			return null;
		
		Pessoa pessoaParaAtualizar = dao.findByIdPessoa(p.getIdPessoa());
		
		if(pessoaParaAtualizar != null) {
			pessoaParaAtualizar.setNome(p.getNome());
			pessoaParaAtualizar.setEmail(p.getEmail());
			pessoaParaAtualizar.setTelefone(p.getTelefone());
			pessoaParaAtualizar.setSenha(p.getSenha());
			pessoaParaAtualizar.setAdministrador(p.getAdministrador());
			pessoaParaAtualizar.setCep(p.getCep());
			pessoaParaAtualizar.setLogradouro(p.getLogradouro());
			pessoaParaAtualizar.setNumero(p.getNumero());
			pessoaParaAtualizar.setComplemento(p.getComplemento());
			pessoaParaAtualizar.setBairro(p.getBairro());
			pessoaParaAtualizar.setCidade(p.getCidade());
			pessoaParaAtualizar.setUf(p.getUf());
			
			return dao.save(pessoaParaAtualizar);
			
		}
		
		return null;
	}

	@Override
	public PessoaDTO login(Pessoa pessoa) {
		// TODO Auto-generated method stub
		PessoaDTO login = dao.login(pessoa.getEmail(), pessoa.getSenha());
		
		if(login != null) {
			return login;
		}
		
		return null;
	}

	@Override
	public Pessoa recuperarPessoaPorEmail(String email) {
		if(!email.isBlank()) {
			Pessoa p = dao.findByEmail(email);
			if(p != null) {
				return p;
			}
			return null;
		}
			
		return null;
	}
}
