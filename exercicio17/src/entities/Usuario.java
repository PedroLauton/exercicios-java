package entities;

public abstract class Usuario {
	
	private Integer numeroIdentificador;

	public Usuario(Integer numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}

	public Integer getNumeroIdentificador() {
		return numeroIdentificador;
	}

	public void setNumeroIdentificador(Integer numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	} 	
}
