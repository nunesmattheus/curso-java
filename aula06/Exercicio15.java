package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos termos vai ter a soma:");
		int num = scan.nextInt();
		
		double soma = 0;		
		
		for(int i = 1; i <= num; i++) {
			
			soma = soma + 1/i;					
			
		}		
				
		System.out.println(soma);

	}

}
