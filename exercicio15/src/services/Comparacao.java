package services;

import java.util.List;

public class Comparacao {
	
	public static <T extends Number> void comparacaoListas(List<T> lista1) {
		
		double somaPares = 0;
		double somaImpares = 0;
		
		for (T t : lista1) {
			if(t.doubleValue() % 2 == 0) {
				somaPares += t.doubleValue();
			} else {
				somaImpares += t.doubleValue();
			}
		}
		
		System.out.println("Números ímpares: " + somaImpares);
		System.out.println("Números Pares: " + somaPares);
	}
}
