package cursojava.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 lados de um triangulo:");
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		boolean triangulo;
		
		if((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
			triangulo = true;
		} else {
			triangulo = false;
		}
		
		if(triangulo == true) {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Trinagulo equilatero");
			} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo Isosceles");
			} else {
				System.out.println("trinagulo Escaleno");
			}
		} else{
			System.out.println("Não é um triangulo");
		}

	}

}