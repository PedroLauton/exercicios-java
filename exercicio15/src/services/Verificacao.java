package services;

import java.util.List;

public class Verificacao {
	
	public static <T> int buscarElemento(List<T> lista, T alvo) {
		for (int i = 0; i < lista.size(); i++) {
			T objeto = lista.get(i);
			if(objeto.equals(alvo)){
				return i;
			}
		}
		return -1;
	}
}
