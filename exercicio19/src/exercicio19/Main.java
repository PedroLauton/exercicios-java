package exercicio19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String caminho = "..\\..\\..\\teste.txt";
		Map<String, Integer> mapEleicao = new LinkedHashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine();
			while(linha != null) {
				String[] dados = linha.split(",");
				
				String nomeCandidato = dados[0];
				Integer votosCandidato = Integer.parseInt(dados[1]);
				
				if(mapEleicao.containsKey(nomeCandidato)) {
					Integer votosArmazenados = mapEleicao.get(nomeCandidato);
					mapEleicao.put(nomeCandidato, votosArmazenados + votosCandidato);
				} else {
					mapEleicao.put(nomeCandidato, votosCandidato);
				}
				
				linha = br.readLine();
			}
			
			for (String chave : mapEleicao.keySet()) {
				System.out.println(chave + ": " + mapEleicao.get(chave));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
