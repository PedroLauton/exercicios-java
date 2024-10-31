package services;

import java.util.List;

public class Inverter {
	
	public static <T> List<T> inverterLista(List<T> lista) {
		List<T> listaInvertida = lista.reversed();
		return listaInvertida;
	}
}
