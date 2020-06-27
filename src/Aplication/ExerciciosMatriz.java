package Aplication;

import java.util.Scanner;

public class ExerciciosMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a Quantidade de Linha:");
		int l = sc.nextInt();
		System.out.print("Digite a Quantidade de Colunas:");
		int c = sc.nextInt();
		int[][] mat = new int [l][c];
		
		for(int i = 0; i < mat.length; i++) {
			System.out.print("Digite os elementos da Linha "+ i + ":");
			for(int j= 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um numero pra localizar a posição: ");
		int pos = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j= 0; j < mat[i].length; j++) {
				if(mat[i][j] == pos) {
					System.out.printf("Posição: %d , %d \n", i , j);
					if(j > 0) {
						System.out.printf("Esquerda: %d\n", mat[i][j-1]);
					}
					if (i > 0 ) {
						System.out.printf("Abaixo: %d\n", mat[i][j]);
					}
					if (j < mat[i].length-1) {
						System.out.printf("Direita: %d\n", mat[i][j+1]);
					}
				
					if(i< mat.length -1 ) {
						System.out.printf("Direita: %d\n", mat[i+1][j]);
					}
					System.out.print("--------------------\n");
				}
			}
		}
		
		
		
		
		
		
		
		
		System.out.println("Teste");
		
		
		sc.close();
	}

}
