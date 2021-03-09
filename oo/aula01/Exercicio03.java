package cursojava.exercicios.oo.aula01;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.numero = 1234;
		conta.saldo = 1000;
		conta.status = "Especial";
		conta.limite = 50000;
		
		System.out.println(conta.numero);
		System.out.println(conta.saldo);
		System.out.println(conta.status);
		System.out.println(conta.limite);

	}

}
