package cursojava.exercicios.oo.aula05;

public class Conta {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public Conta() { }

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public String toString() {
		return "Conta [nomeCliente = " + nomeCliente + ", numConta = " + numConta + ", saldo = " + saldo + "]";
	}

	public boolean sacar(double saque) {		
		if((this.saldo - saque) >= 0) {
			this.saldo -= saque;
			return true;
		} else {
			return false;
		}		
	}
	
	public void depositar(double deposito) {		
		this.saldo += deposito;
		
	}
	
		
	

}
