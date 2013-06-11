package br.com.estudojsf.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import br.com.estudojsf.model.Pessoa;
import br.com.estudojsf.service.PessoaService;

@ManagedBean
public class PessoaBean implements Serializable {

	private static final long serialVersionUID = -6770382406668605867L;

	private Pessoa pessoa = new Pessoa();

	private List<Pessoa> pessoas;
	
	@ManagedProperty("#{pessoaService}")
	private PessoaService pessoaService;
	
	public void salvar() {
		pessoaService.salvar(pessoa);
		listar();
	}
	
	public String listar() {
		pessoas = pessoaService.lista();
		return "lista";
	}
	
	public void remover() {
		pessoaService.deletar(pessoa);
		listar();
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
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
