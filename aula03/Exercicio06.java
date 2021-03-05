package cursojava.exercicios.aula03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voce ganha por hora: ");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalhadas por mes: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioMes = salarioHora * horasTrabalhadas;
		
		System.out.println("O salario mensal é: " + salarioMes);		

	}

}
