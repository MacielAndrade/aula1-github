package Entidades;

public class Conta {
	
	private int numeroconta;
	private String nome;
	private double saldo;
	

	public int getNumeroconta() {
		return numeroconta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}


	public Conta(int numeroconta, String nome) {
		super();
		this.numeroconta = numeroconta;
		this.nome = nome;
	}

	public Conta(int numeroconta, String nome, double depositoincial) {
		super();
		this.numeroconta = numeroconta;
		this.nome = nome;
		deposita(depositoincial);
	}
	
	public void deposita(double deposito) {
		saldo = saldo + deposito;
	}
	
	public void saque (double saque) {
		saldo = saldo - (saque + 5);
	}
	
	
	public String toString () {
		return "Numero da conta: "+ 
				numeroconta +
				"\nNome do Proprietario"+
				nome + 
				"\nsaldo : "+
				saldo;			
		
	}
	
	
}

