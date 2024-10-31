package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Conta;
import excecoes.SaldoException;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre com os dados da conta bancária: ");

			System.out.print("Número: ");
			Integer numeroConta = sc.nextInt();
			sc.nextLine();

			System.out.print("Titular: ");
			String titularConta = sc.nextLine();

			System.out.print("Saldo inicial: ");
			Double saldoConta = sc.nextDouble();
			sc.nextLine();

			System.out.print("Limite de saque: ");
			Double limiteSaqueConta = sc.nextDouble();
			sc.nextLine();

			Conta conta = new Conta(numeroConta, titularConta, saldoConta, limiteSaqueConta);

			System.out.print("Entre com um valor par saque: ");
			Double saqueConta = sc.nextDouble();
			sc.nextLine();

			conta.saque(saqueConta);
			
			System.out.println("Novo saldo: " + conta.getSaldo());
			sc.close();
		} catch (SaldoException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("Entrada de dados inconsistentes.");
		} finally {
			System.out.println("Encerrando...");
		}
	}
}
