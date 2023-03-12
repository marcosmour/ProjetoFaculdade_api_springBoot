package com.projetoeniac.projetofaculdade.model;

import java.time.LocalDateTime;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistroPonto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String setor;
	private LocalDateTime dataRegistroPonto;
	private String gestor;
	
	
	
	public RegistroPonto(String nome, String setor, LocalDateTime dataRegistroPonto, String gestor) {
		super();
		this.nome = nome;
		this.setor = setor;
		this.dataRegistroPonto = dataRegistroPonto;
		this.gestor = gestor;
	}



	public RegistroPonto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSetor() {
		return setor;
	}



	public void setSetor(String setor) {
		this.setor = setor;
	}



	public LocalDateTime getDataRegistroPonto() {
		return dataRegistroPonto;
	}



	public void setDataRegistroPonto(LocalDateTime dataRegistroPonto) {
		this.dataRegistroPonto = dataRegistroPonto;
	}



	public String getGestor() {
		return gestor;
	}



	public void setGestor(String gestor) {
		this.gestor = gestor;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroPonto other = (RegistroPonto) obj;
		return Objects.equals(id, other.id);
	}



	@Override
	public String toString() {
		return "RegistroPonto [id=" + id + ", nome=" + nome + ", setor=" + setor + ", dataRegistroPonto="
				+ dataRegistroPonto + ", gestor=" + gestor + "]";
	}
	
	
}
