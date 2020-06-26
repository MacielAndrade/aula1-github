package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;

public class Vertores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite quando Funcionarios deseja Cadastrar:");
		int n = sc.nextInt();
		Funcionario vect[] = new Funcionario[n];
		List <Integer> list = new ArrayList<>();
		
		for(int i =0 ; i< n ; i++){
			System.out.println("Funcionario "+ (i+1));
			System.out.print("Digite o ID do Funcionario:");
			int id = sc.nextInt();
			System.out.print("Digite o Nome do Funcionario:");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Digite o Salario do Funcionario:");
			double salario = sc.nextDouble();
			vect [i] = new Funcionario(id, nome, salario);
			list.add(id);
		}
		
		for(int i = 0; i <n; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("Qual id deseja alterar o salario:");
		int alter = sc.nextInt();
		
		System.out.println("Qual porcentagem");
		double porcentagem = sc.nextDouble();
		vect [list.indexOf(alter)].porcentagemSalario(porcentagem);
		
		for(int i = 0; i <n; i++) {
			System.out.println(vect[i]);
		}
		
	
	
	
			
		
		
		sc.close();

	}

}
