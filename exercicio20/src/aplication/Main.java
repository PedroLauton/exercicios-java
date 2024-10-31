package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Produto;
import util.ProdutoFunction;

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
		listaProdutos.add(new Produto("Melancia", 60.0));

		listaProdutos.sort((produto1, produto2) -> produto1.getPreco().compareTo(produto2.getPreco()) * -1);
		/*listaProdutos.removeIf(new ProdutoPredicado());
		listaProdutos.removeIf(x -> x.getPreco() < 10.0);
		listaProdutos.removeIf(Produto::staticProdutoPredicate);*/
		
		/*listaProdutos.forEach(new ProdutoUpdate());
		listaProdutos.forEach(Produto::staticPercent);
		listaProdutos.forEach(Produto::noStaticPercent);
		listaProdutos.forEach(x -> x.setPreco(x.getPreco() * 1.1));*/
		
		
		List<String> novaLista = listaProdutos.stream().map(x -> x.getNome().toUpperCase()).collect(Collectors.toList());
		
		novaLista.forEach(System.out::println);
		listaProdutos.forEach(System.out::println);

	}

}
