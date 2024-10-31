package entidades;

public class PessoaFisica extends Pessoa {
	
	private Double gastosMedicos;

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosMedicos) {
		super(nome, rendaAnual);
		this.gastosMedicos = gastosMedicos;
	}

	public Double getGastosMedicos() {
		return gastosMedicos;
	}

	public void setGastosMedicos(Double gastosMedicos) {
		this.gastosMedicos = gastosMedicos;
	}

	@Override
	public Double impostoPago() {
		if(this.getRendaAnual() < 20000) {
			return this.getRendaAnual() * 0.15 - (gastosMedicos * 0.5);
		}else {
			return this.getRendaAnual() * 0.25 - (gastosMedicos * 0.5);
		}
	}
}
