package cursojava.exercicios.aula05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com as duas notas:");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		String conceito = "";
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 9 && media <= 10) {
			conceito = "A";
		} else if(media >= 7.5 && media < 9) {
			conceito = "B";
		} else if(media >= 6 && media < 7.5) {
			conceito = "C";
		} else if(media >= 4 && media < 6) {
			conceito = "D";
		} else if(media >= 0 && media < 4) {
			conceito = "E";
		}	
		
		switch(conceito) {
		case "A":
		case "B":
		case "C": System.out.println("APROVADO"); break;
		case "D":
		case "E": System.out.println("REPROVADO"); break;
		
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);		
	}

}
