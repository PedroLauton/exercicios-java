package entities;

public class Estudante extends Usuario{

	private String nomeEstudante; 
	private Integer idadeEstudante;
	
	public Estudante(Integer numeroIdentificador, String nomeEstudante, Integer idadeEstudante) {
		super(numeroIdentificador);
		this.nomeEstudante = nomeEstudante;
		this.idadeEstudante = idadeEstudante;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}

	public Integer getIdadeEstudante() {
		return idadeEstudante;
	}

	public void setIdadeEstudante(Integer idadeEstudante) {
		this.idadeEstudante = idadeEstudante;
	}
}
