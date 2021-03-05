package cursojava.exercicios.aula03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro inteiro: ");
		int num2 = scan.nextInt();
		
		int resultado = num1 + num2;
		
		System.out.println("O resultado é: " + resultado);
		

	}

}