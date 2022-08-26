package br.estacio.banco.com;

public class Conta {
	
	private String titular;
	private String numerodaConta;
	private double saldo;
	private double contaPoupanca;
	private double contaCorrente;
	
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	public void saque(double valor) {
		saldo = saldo - valor;
	}

	public String getTitular() {
		return titular;
	}

	public double getContaPoupanca() {
		return contaPoupanca;
	}

	public void setContaPoupanca(double contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}

	public double getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(double contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumerodaConta() {
		return numerodaConta;
	}

	public void setNumerodaConta(String numerodaConta) {
		this.numerodaConta = numerodaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void getResumo() {
		
		System.out.println("O saldo da conta de " + getTitular() + " é de " + getSaldo() + "!");
		System.out.println("O rendimento da conta de " + getTitular() + " é de " + getContaPoupanca()+ " Por mes!");
		System.out.println("A tarifa mensal de " + getTitular() + " é de " + getContaCorrente() + "!");
	}

}
