package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Funcionario;
import entidades.enums.NivelTrabalho;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		Departamento departamento = new Departamento(nomeDepartamento);
		
		System.out.println("\nEntre com os dados do funcionário!");
		
		System.out.print("Nome: ");
		String nomeFunc = sc.nextLine();
		System.out.print("Nível: ");
		String nivelFunc = sc.nextLine();
		System.out.print("Salário Base: ");
		Double salarioFunc = sc.nextDouble();
		
		NivelTrabalho nivel = NivelTrabalho.valueOf(nivelFunc);
		
		Funcionario funcionario = new Funcionario(nomeFunc, nivel, salarioFunc, departamento);
		
		System.out.print("\nQuantos contratos o funcionário " + funcionario.getNome() + " tem? ");
		Integer qtdContratos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < qtdContratos; i++) {
			System.out.println("\nEntre com o contrato #" + (i + 1));
			
			System.out.print("Data (dd/MM/yyyy): ");
			String dataContrato = sc.nextLine();
			
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			
			System.out.print("Duração: ");
			Integer duracao = sc.nextInt();
			sc.nextLine();
			
	        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        Date data = formato.parse(dataContrato);
			
			ContratoHora contrato = new ContratoHora(data, valorPorHora, duracao);
			funcionario.adicionarContrato(contrato);
		}
		
		System.out.print("\nEntre com o mês e ano para calcular os ganhos: ");
		String dataPesquisa = sc.nextLine();
		
        SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy");
        Date data = formato.parse(dataPesquisa);
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        
        Integer mes = 1 + calendario.get(Calendar.MONTH);
        Integer ano = calendario.get(Calendar.YEAR);
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getName());
        System.out.println("Ganhos de " + mes + "/" + ano + ": " + funcionario.ganhos(mes, ano));
        sc.close();
	}
}
