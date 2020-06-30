package Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entidades.enums.NiveldoTrabalhador;

public class Trabalhador {
	private String nome;
	private NiveldoTrabalhador nivel;
	private double salarioBase;
	
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, NiveldoTrabalhador nivel, double salarioBase, 
			Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NiveldoTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NiveldoTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}
		
	public void adicionarContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public double rendaMensal (int year, int month) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for(ContratoHora cadacont : contratos) {
			cal.setTime(cadacont.getData());
			int cadacont_year = cal.get(Calendar.YEAR);
			int cadacont_month = 1 + cal.get(Calendar.MONTH);
			if (year == cadacont_year && month == cadacont_month) {
				soma += cadacont.valorTotal();
			}
		}
		return soma;
	}
	
	
	
}
