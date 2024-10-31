package aplicação;

import java.util.Scanner;

import entidade.Funcionario;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		Boolean encontrarId = false;
		
		System.out.print("Quantos funcionáios você deseja cadastrar?: ");
		Integer quantidadeFuncionarios = sc.nextInt();
		
		externo:
		for(int i = 0; i < quantidadeFuncionarios; i++) {
			System.out.printf("\nFuncionario #" + (i + 1));
			System.out.println();
			
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			
			for(Funcionario func : listaFuncionarios) {
				if(func.getId().equals(id)) {
					System.out.printf("\nEsse ID já existe.");
					break externo;
				}
			}
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
						
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			listaFuncionarios.add(func);
			
		}
		
		System.out.printf("\nDigite o ID do funcionário que receberá aumento: ");
		Integer id = sc.nextInt();
		
		for(Funcionario func : listaFuncionarios) {
			if(func.getId().equals(id)) {
				System.out.printf("Digite a porcentagem de aumento: ");
				Double porcentagem = sc.nextDouble();
				
				func.aumentoSalario(porcentagem);
				
				encontrarId = true;
			}
		}
		
		if(!encontrarId) {
			System.out.println("Esse ID não existe.");
		}
		
		
		System.out.println("\nLista de funcionários: ");
		
		for(Funcionario func : listaFuncionarios) {
			System.out.println(func);
		}
		
		
		sc.close();
	}

}
