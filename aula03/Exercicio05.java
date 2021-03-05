package cursojava.exercicios.aula03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor em metros:");
		double metro = scan.nextDouble();
		
		double cent = metro * 100;
		
		System.out.println("O valor em centimetros é: " + cent);
		

	}

}

