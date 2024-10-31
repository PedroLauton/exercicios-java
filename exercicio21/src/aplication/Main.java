package aplication;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import services.ProdutoServices;

public class Main {

	public static void main(String[] args) {
		
		List<Produto> listaProdutos = new ArrayList<>();
		listaProdutos.add(new Produto("Banana", 90.0));
		listaProdutos.add(new Produto("Maçã", 40.0));
		listaProdutos.add(new Produto("Abacaxi", 10.0));
		listaProdutos.add(new Produto("Mamão", 200.0));
		listaProdutos.add(new Produto("Morango", 130.0));
		listaProdutos.add(new Produto("Laranja", 20.0));
		listaProdutos.add(new Produto("Abacate", 400.0));
		listaProdutos.add(new Produto("Uva", 500.0));
		listaProdutos.add(new Produto("Melão", 2.0));
		listaProdutos.add(new Produto("Telancia", 60.0));
		
		listaProdutos.forEach(System.out::println);
		
		ProdutoServices ps = new ProdutoServices();
		
		double sum = ps.ListaFiltrada(listaProdutos, x -> x.getNome().charAt(0) == 'T');
		
		System.out.println(sum);
		
	}

}
