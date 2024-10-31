package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*String file = "C:..\\..\\teste.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String linha = br.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}*/
		
		/*String[] linhas = new String[] {"Bom dia", "boa Tarde", "Boa noite"};
		String caminho = "C:..\\..\\teste01.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
			for (String string : linhas) {
				bw.write(string);
				bw.newLine();
			}
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a Pasta: ");
		String caminhoPasta = sc.nextLine();
		
		File path = new File(caminhoPasta);
		File[] listaCaminhosDiretorios = path.listFiles(File::isDirectory);
		
		System.out.println("Pastas: ");
		for (File file : listaCaminhosDiretorios) {
			System.out.println(file);
		}
		
		File arquivos = new File(caminhoPasta);
		File[] listaCaminhosArquivos = path.listFiles(File::isFile);
		
		System.out.println("Arquivos: ");
		for (File file : listaCaminhosArquivos) {
			System.out.println(file);
			System.out.println("getName: " + file.getName());
			System.out.println("getParent: " + file.getParent());
		}
		
		boolean sucesso = new File(caminhoPasta + "\\subdir").mkdir();
		System.out.println("Diretorio criado: " + sucesso);
	}
}
