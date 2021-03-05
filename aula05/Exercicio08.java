package cursojava.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 1-sim e 0-nao:");
		System.out.println("Telefonou para a vitima?");
		int res1 = scan.nextInt();
		System.out.println("Esteve no local do crime?");
		int res2 = scan.nextInt();
		System.out.println("Mora perto da vitima?");
		int res3 = scan.nextInt();
		System.out.println("Devia para a vitima?");
		int res4 = scan.nextInt();
		System.out.println("Já trabalhou com a vitima?");
		int res5 = scan.nextInt();
		
		int soma = res1 + res2 + res3 + res4 + res5;
		
		if(soma == 2) {
			System.out.println("Suspeita");
		} else if(soma >=3 && soma <=4) {
			System.out.println("Cumplice");
		} else if(soma == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}

	}

}
