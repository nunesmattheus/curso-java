package cursojava.exercicios.aula05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros inteiros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 >num3) {
			System.out.println("maior: " + num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("maior: " + num2);
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("maior: " + num3);
		}
		
		if(num1 < num2 && num1 <num3) {
			System.out.println("menor: " + num1);
		} else if(num2 < num1 && num2 < num3) {
			System.out.println("menor: " + num2);
		} else if(num3 < num1 && num3 < num2) {
			System.out.println("menor: " + num3);
		}		

	}

}
