package aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidade.Cliente;
import entidade.ItensPedidos;
import entidade.Pedidos;
import entidade.Produtos;
import entidade.enums.StatusPedido;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Email: ");
		String emailCliente = sc.nextLine();
		
		System.out.print("Data de nascimento (dd/MM/yyyy): ");
		String dataNascimentoCaptura = sc.nextLine();
		
		System.out.print("\nEntre com outro dado: ");
		String statusProcesso = sc.nextLine();
		
		StatusPedido statusPedido = StatusPedido.valueOf(statusProcesso);
		
		DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNascimentoCliente = LocalDate.parse(dataNascimentoCaptura, formatacaoData);

		Cliente cliente = new Cliente(nomeCliente, emailCliente, dataNascimentoCliente);
		
		System.out.print("\nQuantos itens o cliente " + cliente.getNome() + " irá pedir? ");
		Integer quantidadePedidos = sc.nextInt();
		sc.nextLine();
		
		Pedidos pedidos = new Pedidos(LocalDateTime.now(), statusPedido, cliente);
		
		for(int i = 0; i < quantidadePedidos; i++) {
			System.out.println("\nEntre com o pedido #" + (i + 1));
			
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			Double precoProduto = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Quantidade: ");
			Integer quantidadeProduto = sc.nextInt();
			sc.nextLine();

			Produtos produto = new Produtos(nomeProduto, precoProduto);
			ItensPedidos itensPedido= new ItensPedidos(quantidadeProduto, produto);
			pedidos.addProdutosList(itensPedido);
		}
		
		System.out.println("\nSumário de Pedido\n");
		System.out.println(pedidos);
		sc.close();
	}
}
