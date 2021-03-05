package cursojava.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qual carne deseja comprar(1-file duplo, 2-alcatra, 3-picanha):");
		int res1 = scan.nextInt();
		System.out.println("Digite quantos kg de carne deseja:");
		double res2 = scan.nextDouble();
		System.out.println("Possui cartao tabajara?(1-sim, 2-nao):");
		int res3 = scan.nextInt();
		
		double precoTotal = 0;
		double desc = 0;		
		double valorPagar = 0;
		String tipoPagamento = "";
		String tipoCarne = "";
		
		switch(res1) {
		case 1: tipoCarne = "file duplo";
				if(res2 <= 5) {
					precoTotal = res2 * 4.9;
				}else {
					precoTotal = res2 * 5.8;
				}				
				break;
		case 2: tipoCarne = "alcatra";
				if(res2 <= 5) {
					precoTotal = res2 * 5.9;
				} else {
					precoTotal = res2 * 6.8;
				}
				break;
		case 3: tipoCarne = "picanha";
				if(res2 <= 5) {
					precoTotal = res2 * 6.9;
				} else {
					precoTotal = res2 * 7.8;
				}
				break;
		}		
		
		if(res3 == 1) {
			valorPagar = precoTotal*(1 - 0.05);
			desc = precoTotal - valorPagar;
			tipoPagamento = "cartao tabajara";
		} else {
			valorPagar = precoTotal;
			desc = 0;
			tipoPagamento = "sem cartao tabajara";
		}
		
		System.out.println("Tipo de carne: " + tipoCarne);
		System.out.println("Quantidade: " + res2 + "kg");
		System.out.println("Preço total: " + precoTotal);
		System.out.println("Tipo de pagamento: " + tipoPagamento);
		System.out.println("Desconto: " + desc);
		System.out.println("Valor a pagar: " + valorPagar);		

	}

}