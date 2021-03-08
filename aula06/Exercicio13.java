package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantas pessoas quer calcular:");
		int num = scan.nextInt();
		
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.println("Digite uma idade: ");
			int idade = scan.nextInt();
			 soma = soma + idade;			
		}
		
		media = soma / num;
		
		if(media > 0 && media <=25) {
			System.out.println("Turma jovem");
		} else if(media > 25 && media <= 60) {
			System.out.println("Turma adulto");
		} else {
			System.out.println("Turma idoso");
		}		
		
		System.out.println(media);

	}

}
