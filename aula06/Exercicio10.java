package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos termos quer na sequencia:");
		int n = scan.nextInt();
		
		int n1 = 1;	
		int n2 = 1;
		
		System.out.println("1 ");
		System.out.println("1 ");
		
		n = n - 2;
		while(n > 0) {
			int fibo = n1 + n2;
			System.out.println(fibo);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			n--;
		}

	}

}
