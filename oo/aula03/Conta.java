package cursojava.exercicios.oo.aula03;

public class Conta {
	
	private int numero;
	private double saldo;
	private String status;
	private double limite;
	
	public Conta() { }	

	public Conta(int numero, double saldo, String status, double limite) {		
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double realizarSaque(double saque) {
		
		if(this.saldo > 0) {
			System.out.println("Saque realizado com sucesso");
			this.saldo -= saque;
		} else {
			System.out.println("Não possui saldo na conta");
		}
		
		return saque;
	}
	
	public double depositarDinheiro(double deposito) {
		System.out.println("Deposito realizado com sucesso");
		this.saldo += deposito;
		
		return deposito;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void verificarCheque() {
		if(this.saldo < 0) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
	}
	
	public void exibirInfo() {
		System.out.println("Numero: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Status: " + status);
		System.out.println("Limite: " + limite);
		
	}

}
