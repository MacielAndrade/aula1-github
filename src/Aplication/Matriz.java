package Aplication;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] mat = new int [n] [n];
		
		for(int i = 0; i <mat.length; i++) {
			System.out.println("Digite 3 numero:");
			for(int j = 0; j <mat[i].length; j++) {
				mat[i][j]= sc.nextInt();
				
			}
			
		}
		
		System.out.println("Na diagonal");
		for(int i = 0; i <mat.length; i++) {
			System.out.println(mat[i][i]);
		}
		
		int negativo = 0;
		System.out.println("Numeros Negativos:");
		for(int i = 0; i <mat.length; i++) {
			for(int j = 0; j <mat[i].length; j++) {
				if(mat[i][j] < 0) {
					negativo = negativo + 1;
					}
				}
				
			}
		System.out.println(negativo);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
