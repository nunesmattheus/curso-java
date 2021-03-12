package cursojava.exercicios.oo.aula05;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Teste ContaBancaria ***");
		
		Conta contaSimples = new Conta();		
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("12345");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);		
		
		System.out.println("*** Teste ContaPoupança ***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();		
		contaPoupanca.setNomeCliente("Cliente conta poupança");
		contaPoupanca.setNumConta("12345");
		contaPoupanca.setDiaRendimento(13);
		
		contaPoupanca.depositar(100);
		
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		
		System.out.println(contaPoupanca);	
		
		System.out.println("*** Teste ContaEspecial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial();		
		contaEspecial.setNomeCliente("Cliente conta especial");
		contaEspecial.setNumConta("12345");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);

	}
	
	private static void realizarSaque(Conta conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
		}
	}
}
