package entidade;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entidade.enums.StatusPedido;

public class Pedidos {
	
	private LocalDateTime momento; 
	private StatusPedido status;
	
	private List<ItensPedidos> ItensPedidoList = new ArrayList<ItensPedidos>();
	private Cliente cliente;
	
	
	public Pedidos() {
	}
	
	public Pedidos(LocalDateTime momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public LocalDateTime getMomento() {
		return momento;
	}
	
	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}
	
	public StatusPedido getStatus() {
		return status;
	}
	
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public List<ItensPedidos> getProdutosList() {
		return ItensPedidoList;
	}
	
	public void addProdutosList(ItensPedidos pedidos) {
		this.ItensPedidoList.add(pedidos);
	}
	
	public void removeProdutosList(ItensPedidos pedidos) {
		this.ItensPedidoList.remove(pedidos);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double totalPedido() {
		Double valorTotal = 0.0;
		
		for (ItensPedidos itensPedidos : ItensPedidoList) {
			valorTotal += itensPedidos.getPreco();
		}
		
		return valorTotal;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatacaoDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: " + momento.format(formatacaoDateTime));
		sb.append("\nProcessamento do Pedido: " + status);
		sb.append("\n" + cliente);
		sb.append("\nItens Pedidos: \n");
		
		for (ItensPedidos itensPedidos : ItensPedidoList) {
			sb.append(itensPedidos);
		}
		
		sb.append("Preço total: " + this.totalPedido());
		return sb.toString();
	}
}
