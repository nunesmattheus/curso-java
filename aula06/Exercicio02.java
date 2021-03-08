package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean senhaValida = false;
		
		do {
			System.out.println("Digite um nome de usuario:");
			String nome = scan.next();
			
			System.out.println("Digite uma senha:");
			String senha = scan.next();
			
			if(!nome.equalsIgnoreCase(senha)) {
				senhaValida = true;
				System.out.println("OK, dados validos");				
			} else {
				System.out.println("Dados invalidos");
			}
		} while(!senhaValida);

	}

}


