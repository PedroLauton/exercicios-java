package util;

import java.util.function.Predicate;

import entities.Produto;

public class ProdutoPredicado implements Predicate<Produto>{

	@Override
	public boolean test(Produto t) {
		return t.getPreco() >= 120.0;
	}
	
	
}
