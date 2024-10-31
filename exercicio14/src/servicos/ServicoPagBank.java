package servicos;

public class ServicoPagBank implements ServicoPagamentoOnline{
	
	private static final double TAXA_PAGAMENTO = 0.20;
	private static final double JUROS_MENSAIS = 0.10;

	@Override
	public Double parcelas(Double quantia, Integer mes) {
		return quantia * JUROS_MENSAIS * mes;
	}

	@Override
	public Double taxaPagamento(Double quantia) {
		return quantia * TAXA_PAGAMENTO;
	}
}
