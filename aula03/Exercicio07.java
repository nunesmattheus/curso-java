package cursojava.exercicios.aula03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("O seu peso ideal é: " + pesoIdeal); 		

	}

}