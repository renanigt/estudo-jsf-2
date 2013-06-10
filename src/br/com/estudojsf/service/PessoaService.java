package br.com.estudojsf.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.estudojsf.model.Pessoa;

@Service("pessoaService")
@Transactional
public class PessoaService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void salvar(Pessoa pessoa) {
		entityManager.persist(pessoa);
	}
	
}
