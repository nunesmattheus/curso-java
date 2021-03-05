package cursojava.exercicios.aula05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")|| letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("A letra é uma volgal");
		} else {
			System.out.println("A letra é uma consoante");
		}		

	}

}