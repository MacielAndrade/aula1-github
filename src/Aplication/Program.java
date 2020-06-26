package Aplication;

import java.util.Scanner;

import Entidades.Conta;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite um numero para conta:");
		int numeroconta = sc.nextInt();
		System.out.print("Digite nome do proprietario:");
		String nome = sc.next();
		
		System.out.print("Deseja fazer um deposito? s/n");
		char resp = sc.next().charAt(0);
		
		if(resp == 's') {
			System.out.println("Digite o valor do deposito:");
			double depositoincial = sc.nextDouble();
			conta = new Conta(numeroconta, nome, depositoincial);
		}
		else {
			conta = new Conta(numeroconta, nome);
		}
		
		System.out.println(conta);
		
		System.out.print("Digite o valor Para deposito:");
		double deposito = sc.nextDouble();
		conta.deposita(deposito);
		
		System.out.println("Atualizado:");
		System.out.println(conta);
		
		System.out.print("Digite o valor Para Saque:");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println("Atualizado:");
		System.out.println(conta);
		
		
		
		
		
		sc.close();
	}



}
