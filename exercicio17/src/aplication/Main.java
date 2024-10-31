package aplication;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Curso;
import entities.Estudante;
import entities.Instrutor;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Curso> listaCursos = new ArrayList<>();
		Set<Estudante> setEstudantes = new LinkedHashSet<>();
		
		System.out.print("Olá!\nDigite o nome do novo instrutor: ");
		String nomeInstrutor = sc.nextLine();
		System.out.print("Digite a idade do Instrutor: ");
		Integer idadeInstrutor = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o número identificar: ");
		Integer numeroInstrutor = sc.nextInt();
		sc.nextLine();
		
		Instrutor instrutor = new Instrutor(numeroInstrutor, nomeInstrutor, idadeInstrutor);
		
		System.out.println("\nÓtimo, agora chegou a hora de criamos os cursos do instrutor " + instrutor.getNomeInstrutor() + "!");
		System.out.println("Quantos cursos ele terá? ");
		Integer quantidadeCursos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < quantidadeCursos; i++) {
			System.out.println((i+1) + "º Curso");
			System.out.print("Nome do curso: ");
			String nomeCurso = sc.nextLine();
			System.out.print("Descrição do curso: ");
			String descricaoCurso = sc.nextLine();
			
			listaCursos.add(new Curso(nomeCurso, descricaoCurso));
		}
		
		System.out.print("Perfeito, agora vamos criar os estudantes! quantos você deseja? ");
		Integer quantidadeEstudantes = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < quantidadeEstudantes; i++) {
			System.out.println((i+1) + "º Estudante");
			System.out.print("Nome do estudante: ");
			String nomeEstudante = sc.nextLine();
			System.out.print("Idade do estudante: ");
			Integer idadeEstudante = sc.nextInt();
			sc.nextLine();
			System.out.println("Número identificador: ");
			Integer numeroIdentificador = sc.nextInt();
			sc.nextLine();
			
			setEstudantes.add(new Estudante(numeroIdentificador, nomeEstudante, idadeEstudante));
		}
		
		System.out.println("Agora, atribua os alunos aos respectivos cursos!");
		for (Curso curso : listaCursos) {
			System.out.print("Quantos alunos terão no curso " + curso.getNomeCurso() + "? ");
			Integer quantidadeAlunos = sc.nextInt();
			sc.nextLine();
			
			for(int i = 0; i < quantidadeAlunos; i++) {
				listaCursos.
			}
		}
		
		sc.close();
	}
}
