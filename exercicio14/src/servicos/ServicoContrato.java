package servicos;

import java.time.LocalDate;

import entidades.Contrato;
import entidades.Parcelas;

public class ServicoContrato {
	
	private ServicoPagamentoOnline servicoPagOnline;
	
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagOnline = servicoPagamentoOnline;
	}
	
	public void processamentoContrato(Contrato contrato, Integer meses) {
		Double parcelaBase = contrato.getValorTotalContrato() / meses;
		
		for(int i = 1; i <= meses; i++) {
			LocalDate dataParcela = contrato.getDataContrato().plusMonths(i);
			Double taxaParcela = servicoPagOnline.parcelas(parcelaBase, i);
			Double taxaPagamento = servicoPagOnline.taxaPagamento(taxaParcela + parcelaBase);
			Double parcelaFinal = parcelaBase + taxaPagamento + taxaParcela;
			contrato.addParcelasList(new Parcelas(dataParcela, parcelaFinal));
		}
	}
}
