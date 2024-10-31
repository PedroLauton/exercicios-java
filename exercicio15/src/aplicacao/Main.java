package aplicacao;

import java.util.List;

import services.Inverter;
import services.Merge;
import services.Verificacao;

public class Main {

	/*public static void main(String[] args) {
		List<Integer> intLista = List.of(1,2,3,4,5,6,7,8,9,0);
		List<Double> intDouble = List.of(1.4,5.7,5.6,8.0,3.4,2.5,7.8);
		
		Comparacao.comparacaoListas(intLista);
		Comparacao.comparacaoListas(intDouble);
	}*/
	
	public static void main(String[] args) {
		List<Integer> intLista1 = List.of(1,3,5,7,9);
		List<Integer> intLista2 = List.of(2,4,6,8,9,0);
		List<Double> intDouble = List.of(1.4,5.7,5.6,8.0,3.4,2.5,7.8);
		List<String> intString1 = List.of("oi", "Como vai");
		List<String> intString2 = List.of("tcgau", "Passar bem");

		
		//List<?> listaInvertida = Inverter.inverterLista(intString);
		Main.imprimirLista(Merge.mergeListas(intLista1, intLista2));

		
	}
	
	public static void imprimirLista(List<?> lista) {
		for (Object t : lista) {
			System.out.print(t + ", ");
		}
	}
}
