package Entidades;

import java.util.Date;

public class ContratoHora {
	private Date data;
	private double valorhora;
	private int horas;
	
	public ContratoHora() {
		
	}

	public ContratoHora(Date data, double valorhora, int horas) {
		this.data = data;
		this.valorhora = valorhora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorhora() {
		return valorhora;
	}

	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public double valorTotal() {
		return valorhora * horas;
	}

}
