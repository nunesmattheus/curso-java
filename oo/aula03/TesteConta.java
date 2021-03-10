package cursojava.exercicios.oo.aula03;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		System.out.println("Entre com o numero:");
		conta.setNumero(scan.nextInt());
		
		System.out.println("Entre com o saldo:");
		conta.setSaldo(scan.nextDouble());
		
		System.out.println("Entre com o status:");
		conta.setStatus(scan.next());
		
		System.out.println("Entre com o limite:");
		conta.setLimite(scan.nextDouble());
		
		conta.exibirInfo();
		
		double saque = conta.realizarSaque(200);
		
		System.out.println(saque);
		conta.consultarSaldo();
		
		double deposito = conta.depositarDinheiro(1000);
		
		System.out.println(deposito);
		conta.consultarSaldo();
		conta.verificarCheque();		

	}

}
