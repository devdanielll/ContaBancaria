package br.estacio.banco.com;

public class Atlos {

	public static void main(String[] args) {
		Conta contaA = new Conta();
		
		contaA.setTitular("Daniel Lucas");
		contaA.setNumerodaConta("8765");
		contaA.setSaldo(100.0);
		contaA.setContaPoupanca(125.0);
		contaA.setContaCorrente(25.0);
		
		contaA.deposito(200);
		
		contaA.getResumo();
		

	}

}
