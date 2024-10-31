package aplicação;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas: ");
		Integer linhas = sc.nextInt();
		
		System.out.print("Digite a quantidade de colunas: ");
		Integer colunas = sc.nextInt();
		
		Integer[][] matrizInt = new Integer[linhas][colunas];

		System.out.println("\nDigite a sua matriz:");
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				matrizInt[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nDigite o número a ser procurado na matrix: ");
		Integer valorEncontrado = sc.nextInt();

		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				if(valorEncontrado == matrizInt[i][j]) {
					System.out.printf("\nPosição %d,%d:", i,j);
					if(i - 1 >= 0) {
						System.out.printf("\nCima: %d", matrizInt[i-1][j]);
					}
					if(i + 1 < linhas) {
						System.out.printf("\nBaixo: %d", matrizInt[i+1][j]);
					}
					if(j - 1 >= 0) {
						System.out.printf("\nEsquerda: %d", matrizInt[i][j-1]);
					}
					if(j + 1 < colunas) {
						System.out.printf("\nDireita: %d", matrizInt[i][j+1]);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("\nImpressão da matriz:\n");
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				System.out.printf("%d ", matrizInt[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
