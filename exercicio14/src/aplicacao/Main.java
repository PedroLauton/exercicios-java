package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcelas;
import servicos.ServicoContrato;
import servicos.ServicoPayPal;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Número: ");
		int numeroContrato = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Data (dd/mm/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.print("Valor do contrato: ");
		Double valorContrato = sc.nextDouble();
		sc.nextLine();

		System.out.print("Entre com o número de parcelas: ");
		int numeroParcelas = sc.nextInt();
				
		Contrato contrato = new Contrato(numeroContrato, date, valorContrato);
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPayPal());
		servicoContrato.processamentoContrato(contrato, numeroParcelas);
		
		System.out.println("\nParcelas: ");		
		for (Parcelas parcelas : contrato.getParcelasList()) {
			System.out.println(parcelas);
		}
		sc.close();
	}
}
