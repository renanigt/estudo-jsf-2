package br.com.estudojsf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String rua;
	private Long numero;
	private String complemento;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public Long getNumero() {
		return numero;
	}
	
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
