package entidades;

import excecoes.SaldoException;

public class Conta {
	
	private Integer numeroConta;
	private String titularConta;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
	}
	
	public Conta(Integer numeroConta, String titularConta, Double saldo, Double limiteSaque) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	} 
	
	public void deposito(Double valor) {
		saldo += valor;
	}
	
	public void saque(Double valor) throws SaldoException {
			saqueException(valor);
			saldo -= valor; 
	}

	public void saqueException(Double valor) throws SaldoException{
		if(valor > saldo) {
			throw new SaldoException("Valor de saque superior ao valor do saldo bancário.");
		}
		if(valor > limiteSaque) {
			throw new SaldoException("Valor de saque superior ao limite de saque.");
		}
	}
}
