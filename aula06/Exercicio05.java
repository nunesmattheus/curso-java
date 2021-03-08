package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a população A:");
		double popA = scan.nextDouble();
		
		System.out.println("Entre com a taxa de crescimento A:");
		double cresA = scan.nextDouble();
		
		System.out.println("Entre com a população B:");
		double popB = scan.nextDouble();
		
		System.out.println("Entre com a taxa de crescimento B:");
		double cresB = scan.nextDouble();
		
		int ano = 0;
		
		if((popA < popB && cresA < cresB) || (popB < popA && cresB < cresA)) {
			System.out.println("A população menor não ultrapassara a maior");		
		} else {
			if(popA < popB) {
				while(popA <= popB) {
					popA = popA * (1 + cresA/100);
					popB = popB * (1 + cresB/100);
					ano++;
				}
				
			} else if(popB < popA) {
				while(popB <= popA) {
					popA = popA * (1 + cresA/100);
					popB = popB * (1 + cresB/100);
					ano++;
				}
				
			} else if(popA == popB) {
				System.out.println("Populacoes iguais, entre novamente");
			}			
			System.out.println("A população menor passara a maior em " + ano + " anos");
			
		}		

	}

}
