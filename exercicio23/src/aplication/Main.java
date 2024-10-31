package aplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;
import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String caminho = sc.nextLine(); 
		
		System.out.print("Digite o salário disruptivo: ");
		Integer salario = sc.nextInt();
		sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine(); 
			
			List<Funcionario> listaFuncionarios = new ArrayList<>();
			
			while(linha != null) {
				String[] dados = linha.split(",");
				listaFuncionarios.add(new Funcionario(dados[0], dados[1], Double.parseDouble(dados[2])));
				linha = br.readLine();
			}
				
			System.out.println("Emails dos funcionarios com salario superior a " + salario);
			
			List<String> emailsFuncionarios = listaFuncionarios.stream()
					.filter(x -> x.getSalario() >= salario)
					.map(x -> x.getEmail())
					.sorted((x1,x2) -> x1.toUpperCase().compareTo(x2.toUpperCase()))
					.collect(Collectors.toList());
			
			emailsFuncionarios.forEach(System.out::println);
			
			double somaSalarios = listaFuncionarios.stream()
					.filter(x -> x.getNome().charAt(0) == 'M')
					.map(x -> x.getSalario())
					.reduce(0.0, (x1, x2) -> x1 + x2);
			
			System.out.println("Salario total dos funcionarios com comecam com M: " + somaSalarios);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
