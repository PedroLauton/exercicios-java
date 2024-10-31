package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class ProdutoServices {
	
	
	public double ListaFiltrada(List<Produto> listaProduto, Predicate<Produto> criterio) {
		double precoTotal = 0;
		for (Produto produto : listaProduto) {
			if(criterio.test(produto)) {
				precoTotal += produto.getPreco();
			}
		}
		return precoTotal;
	}
}
