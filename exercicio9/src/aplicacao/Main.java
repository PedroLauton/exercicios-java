package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Double totalImpostos = 0.0;
		List<Pessoa> pessoasList = new ArrayList<>();

		System.out.print("Entre com o número de Pessoas: ");
		int numeroPessoas = sc.nextInt();
		
		
		for(int i = 0; i < numeroPessoas; i++) {
			System.out.println("\nContribuinte #" +(i+1) + ": ");
			
			System.out.print("Tipo de contribuinte (f/j): ");
			char tipoContribuinte = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Nome: ");
			String nomeContribuinte = sc.nextLine();
			
			System.out.print("Ganhos anuais: ");
			Double ganhosAnuaisContribuinte = sc.nextDouble();
			sc.nextLine();

			if(tipoContribuinte == 'f') {
				System.out.print("Gastos médicos: ");
				Double gastosMedicosContribuinte = sc.nextDouble();
				
				pessoasList.add(new PessoaFisica(nomeContribuinte, ganhosAnuaisContribuinte, gastosMedicosContribuinte));
				
			}else {
				System.out.print("Número de Funcionários: ");
				Integer quantidadeFuncionariosContribuinteJuridico = sc.nextInt();
				sc.nextLine();
				
				pessoasList.add(new PessoaJuridica(nomeContribuinte, ganhosAnuaisContribuinte, quantidadeFuncionariosContribuinteJuridico));
			}
		}
		
		System.out.println("\nValores pagos por contribuinte: ");
		for (Pessoa pessoa : pessoasList) {
			totalImpostos += pessoa.impostoPago();
			System.out.println(pessoa.getNome() + ": $" +  pessoa.impostoPago());
		}
		System.out.println("\nTotal de impostos: $" + totalImpostos);
	}
}
