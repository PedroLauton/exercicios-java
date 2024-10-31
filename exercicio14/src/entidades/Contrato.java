package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	
	private Integer numeroContrato; 
	private LocalDate dataContrato;
	private Double valorTotalContrato;
	
	private List<Parcelas> parcelasList = new ArrayList<>();
	
	public Contrato(Integer numeroContrato, LocalDate dataContrato, Double valorTotalContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}

	public List<Parcelas> getParcelasList() {
		return parcelasList;
	}

	public void addParcelasList(Parcelas parcela) {
		this.parcelasList.add(parcela);
	}
	
	public void removeParcelasList(Parcelas parcela) {
		this.parcelasList.remove(parcela);
	}
}
