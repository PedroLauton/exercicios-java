package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> produtosList = new ArrayList<>();
		
		System.out.print("Quantidade de produtos: ");
		int quantidadeProdutos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < quantidadeProdutos; i++) {
			System.out.println("\nProduto #" + (i+1) + ":");
			
			System.out.print("Comum, Importado ou Usados (c/u/i)? ");
			char tipoProduto = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nomeProduto = sc.nextLine(); 
			
			System.out.print("Preço: ");
			Double precoProduto = sc.nextDouble();
			sc.nextLine();
						
			if(tipoProduto == 'i') {
				System.out.print("Imposto de importação: ");
				Double impostoImportacao = sc.nextDouble();
				
				produtosList.add(new ImportedProduct(nomeProduto, precoProduto, impostoImportacao));
			} else if(tipoProduto == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				String data = sc.nextLine();
				
				DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dataFabricacao = LocalDate.parse(data, form);
				
				produtosList.add(new UsedProduct(nomeProduto, precoProduto, dataFabricacao));
			}else {
				produtosList.add(new Product(nomeProduto, precoProduto));
			}
		}
		
		System.out.println("\nEtiquetas de preco: \n");
		for (Product product : produtosList) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}
}
