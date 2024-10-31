package services;

import java.util.ArrayList;
import java.util.List;

public class Merge {
	
	public static <T> List<T> mergeListas(List<T> lista1, List<T> lista2){
		List<T> listaMerge = new ArrayList<>();
		
		int max = Math.max(lista1.size(), lista2.size());
		for(int i = 0; i < max; i++) {
			if(i < lista1.size()) {
				listaMerge.add(lista1.get(i));
			}
			if(i < lista2.size()) {
				listaMerge.add(lista2.get(i));
			}
		}
		
		return listaMerge;
	}
}
