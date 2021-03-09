package cursojava.exercicios.oo.aula02;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.numero = 1234;
		conta.saldo = 1500;
		conta.status = "Especial";
		conta.limite = 60000;
		
		System.out.println("Numero: " + conta.numero);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Status: " + conta.status);
		System.out.println("Limite: " + conta.limite);
		
		double saque = conta.realizarSaque(200);
		
		System.out.println(saque);
		conta.consultarSaldo();
		
		double deposito = conta.depositarDinheiro(1000);
		
		System.out.println(deposito);
		conta.consultarSaldo();
		conta.verificarCheque();		

	}

}
