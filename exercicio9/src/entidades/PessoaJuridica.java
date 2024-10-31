package entidades;

public class PessoaJuridica extends Pessoa {

	private Integer quantidadeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer quantidadeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}


	public Integer getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	@Override
	public Double impostoPago() {
		if(quantidadeFuncionarios < 10) {
			return this.getRendaAnual() * 0.16;
		}else {
			return this.getRendaAnual() * 0.14;
		}
	}

}
