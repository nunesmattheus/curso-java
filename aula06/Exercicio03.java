package cursojava.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		
		do {
			System.out.println("Entre com seu nome:");
			String nome = scan.next();			
			
			if(nome.length() > 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de mais de 3 caracteres");
			}
		} while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com sua idade:");
			int idade = scan.nextInt();		
			
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade invalida");
			}
		} while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com seu salario:");
			double salario = scan.nextDouble();	
			
			if(salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salario invalido");
			}
		} while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com seu sexo:");
			String sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo invalido");
			}
		} while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com seu estado civil:");
			String estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil invalido");
			}
		} while(!infoValida);

	}

}
