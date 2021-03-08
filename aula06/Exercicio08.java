package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int soma = 0;
		
		if(num1 < num2) {
			int cont = num1;
			while(cont < (num2 - 1)) {
				cont++;
				soma = soma + cont;
				System.out.println(cont);
				
			}
			System.out.println(soma);
		} else {
			int cont2 = num2;
			while(cont2 < (num1 - 1)) {
				cont2++;
				soma = soma + cont2;
				System.out.println(cont2);							
			}
			System.out.println(soma);	
		}				

	}

}
