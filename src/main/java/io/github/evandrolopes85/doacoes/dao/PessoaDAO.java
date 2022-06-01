package io.github.evandrolopes85.doacoes.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import io.github.evandrolopes85.doacoes.dto.PessoaDTO;
import io.github.evandrolopes85.doacoes.model.Pessoa;


public interface PessoaDAO extends CrudRepository<Pessoa, Integer>{
	public Pessoa findByIdPessoa(Integer id);
	
//<<<<<<< HEAD
//	public Pessoa findByIdPessoa(int id);
//	public Pessoa findByEmailAndSenha(String email, String senha);
//
//	@Query("SELECT new io.github.evandrolopes85.doacoes.dto.PessoaDTO("
//			+ "p.idPessoa, p.nome, p.senha)"
//			+ " FROM Pessoa p"
//			+ " WHERE p.idPessoa = :id")
//	public PessoaDTO recuperarPessoaPorId(@Param("id") Integer id);
//=======
	@Query("SELECT "
			+ "new io.github.evandrolopes85.doacoes.dto.PessoaDTO("
			+ " pessoa.id, pessoa.nome, pessoa.email)"
			+ " FROM Pessoa pessoa"
			+ " WHERE pessoa.email = :email AND pessoa.senha = :senha")
	public PessoaDTO login(@Param("email")String email, @Param("senha") String senha);
	
	public Pessoa findByEmail(String email);
//>>>>>>> 5509e18dc26fbd0c1816117ee50f30d1b277d332
}
