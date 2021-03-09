package cursojava.exercicios.oo.aula02;

public class Conta {
	
	int numero;
	double saldo;
	String status;
	double limite;
	
	double realizarSaque(double saque) {
		
		if(saldo > 0) {
			System.out.println("Saque realizado com sucesso");
			saldo -= saque;
		} else {
			System.out.println("Não possui saldo na conta");
		}
		
		return saque;
	}
	
	double depositarDinheiro(double deposito) {
		System.out.println("Deposito realizado com sucesso");
		saldo += deposito;
		
		return deposito;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo: " + saldo);
	}
	
	void verificarCheque() {
		if(saldo < 0) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
	}

}
