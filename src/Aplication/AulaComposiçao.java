package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.ContratoHora;
import Entidades.Departamento;
import Entidades.Trabalhador;
import Entidades.enums.NiveldoTrabalhador;

public class AulaComposiçao {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Digite o nome do departamento:");
		String departamento =sc.nextLine();
		
		System.out.println("Entre com os dados dos trabalhador");
		System.out.print("Nome do Trabalhador:");
		String nome =sc.nextLine();
		
		System.out.print("Digite o level:");
		String nivel =sc.nextLine();
		
		System.out.print("Digite o Salario Base:");
		double salariobase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nome, NiveldoTrabalhador.valueOf(nivel), salariobase,
				new Departamento(departamento));
		
		System.out.println();	
		System.out.println("Quantos contratos o trabalhador vai ter : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Contrato "+ i);
			System.out.print("Digite a DATA no formato DD/MM/AAAA: ");
			Date datacontrato= sdf.parse(sc.next());
			System.out.print("Valor por Hora de serviço: ");
			double valorhora = sc.nextDouble();
			System.out.print("Quantidade de Horas trabalhada: ");
			int horas = sc.nextInt();
			
			ContratoHora contrato = new ContratoHora(datacontrato, valorhora, horas);
			trabalhador.adicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Digite MM/AAAA para calcular o salario: ");
		String mesEano = sc.next();
		int month = Integer.parseInt(mesEano.substring(0, 2));
		int year = Integer.parseInt(mesEano.substring(3,7));
		
		System.out.println();
		System.out.println("Nome: "+ trabalhador.getNome());
		System.out.println("Departamento: "+ trabalhador.getDepartamento().getNomeDep());
		System.out.println("Salario de  "+ mesEano + ": "+
				String.format("%.2f",trabalhador.rendaMensal(year, month)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
