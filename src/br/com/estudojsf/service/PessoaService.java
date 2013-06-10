package br.com.estudojsf.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
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
	
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Pessoa> lista() {
		return entityManager.createQuery("from Pessoa", Pessoa.class)
							 .getResultList();
	}
	
}
