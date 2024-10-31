package entities;

import java.util.Set;

public class Curso {
	
	private String nomeCurso; 
	private String descricao;
	
	private Set<Estudante> setEstudantes;

	public Curso(String nomeCurso, String descricao) {
		this.nomeCurso = nomeCurso;
		this.descricao = descricao;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Estudante> getSetEstudantes() {
		return setEstudantes;
	}

	public void addSetEstudantes(Estudante setEstudantes) {
		this.setEstudantes.add(setEstudantes);
	}
	
	public void removeSetEstudantes(Estudante setEstudantes) {
		this.setEstudantes.remove(setEstudantes);
	}
}
