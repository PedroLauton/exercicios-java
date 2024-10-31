package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelTrabalho;

public class Funcionario {
	
	private String nome;
	private NivelTrabalho nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Funcionario(){
	}
	
	public Funcionario(String nome, NivelTrabalho nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}
	
	public void adicionarContrato(ContratoHora contrato) {
		this.contratos.add(contrato);
	}
	
	public void removerContrato(ContratoHora contrato) {
		this.contratos.remove(contrato);
	}
	
	public Double ganhos(Integer mes, Integer ano) {
		Double sum = salarioBase; 
		Calendar cal = Calendar.getInstance();
		
		for (ContratoHora contratoHora : contratos) {
			cal.setTime(contratoHora.getData());
			Integer contratoAno = cal.get(Calendar.YEAR);
			Integer contratoMes = 1 + cal.get(Calendar.MONTH);
			
			if(contratoMes.equals(mes) && contratoAno.equals(ano)) {
				sum += contratoHora.valorTotal();
			}
		}
		
		return sum;
	}
}
