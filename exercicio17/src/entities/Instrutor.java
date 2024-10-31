package entities;

import java.util.List;

public class Instrutor extends Usuario {

	private String nomeInstrutor;
	private Integer idadeInstrutor;
	
	private List<Curso> listaCursos; 
	
	public Instrutor(Integer numeroIdentificador, String nomeInstrutor, Integer idadeInstrutor) {
		super(numeroIdentificador);
		this.nomeInstrutor = nomeInstrutor;
		this.idadeInstrutor = idadeInstrutor;
	}

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

	public void setNomeInstrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}

	public Integer getIdadeInstrutor() {
		return idadeInstrutor;
	}

	public void setIdadeInstrutor(Integer idadeInstrutor) {
		this.idadeInstrutor = idadeInstrutor;
	} 
	
	public List<Curso> getListaCurso(){
		return listaCursos;
	}
	
	public void addListaCurso(Curso curso) {
		listaCursos.add(curso);
	}
	
	public void addListaCurso(List<Curso> curso) {
		listaCursos = curso;
	}
	
	public void removeListaCurso(Curso curso) {
		listaCursos.remove(curso);
	}
}
	