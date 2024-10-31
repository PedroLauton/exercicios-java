package servicos;

public interface ServicoPagamentoOnline {
	
	Double parcelas(Double quantia, Integer mes);
	Double taxaPagamento(Double quantia);
}
