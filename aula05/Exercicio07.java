package cursojava.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		System.out.println("Digite +, -, *, / para escolher a operacao:");
		String operacao = scan.next();
		
		double resultado = 0;
		
		switch(operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		default: System.out.println("Operacao invaida"); break;
		}
		
		System.out.println(resultado);
		
		if(resultado % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		if(resultado > 0) {
			System.out.println("Positivo");			
		} else {
			System.out.println("Negativo");
		}
		
	}

}