package com.example.demo.config.dtos;

import java.io.Serializable;

import com.example.demo.domain.Disciplina;

public class DisciplinaDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String semestre;
	
	public DisciplinaDto(Disciplina c) {
		id = c.getId();
		nome = c.getNome();
		semestre = c.getSemestre();
	}

	public DisciplinaDto() {

	}

	public DisciplinaDto(Integer id, String nome,String semestre) {
		this.id = id;
		this.nome = nome;
		this.semestre = semestre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisciplinaDto other = (DisciplinaDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
