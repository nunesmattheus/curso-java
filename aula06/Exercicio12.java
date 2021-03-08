package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro:");
		int num = scan.nextInt();
		
		int aux = 1;
		for(int i = 1; i <= num; i++) {			
			aux = aux * i;
		}
		
		System.out.println(aux);

	}

}
