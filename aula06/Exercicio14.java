package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantas temperaturas quer comparar:");
		int num = scan.nextInt();
		
		double maior = 0;
		double menor = 100;
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.println("Digite a temperatura:");
			double t = scan.nextDouble();
			
			soma = soma + t;
			
			if(menor >= t) {
				menor = t;
			} 
			else if(maior <= t) {
				maior = t;
			}
		}
		
		media = soma / num;
		
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("media: " + media);

	}

}
