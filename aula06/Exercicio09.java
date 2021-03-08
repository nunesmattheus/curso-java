package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um inteiro entre 1 e 10:");
		int num = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

}
