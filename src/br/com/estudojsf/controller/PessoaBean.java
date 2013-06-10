package br.com.estudojsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import br.com.estudojsf.model.Pessoa;
import br.com.estudojsf.service.PessoaService;

@ManagedBean
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();

	@ManagedProperty("#{pessoaService}")
	private PessoaService pessoaService;
	
	public void salvar() {
		pessoaService.salvar(pessoa);
	}
	
	public void setPessoaService(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
