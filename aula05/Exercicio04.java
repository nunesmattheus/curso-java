package cursojava.exercicios.aula05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sue salário: ");
		double salario = scan.nextDouble();
		
		double novoSalario;
		double percent;
		double valorAumento;
		
		if(salario <= 280) {
			novoSalario = salario * 1.2;
			valorAumento = salario * 0.2;
			percent = 20;
		} else if(salario > 280 && salario <= 700) {
			novoSalario = salario * 1.15;
			valorAumento = salario * 0.15;
			percent = 15;
		} else if(salario > 700 && salario <= 1500) {
			novoSalario = salario * 1.1;
			valorAumento = salario * 0.1;
			percent = 10;
		} else {
			novoSalario = salario * 1.05;
			valorAumento = salario * 0.05;
			percent = 5;
		}
		
		System.out.println("Salario inicial: " + salario);
		System.out.println("Percentual do aumento: " + percent + "%");
		System.out.println("Valor do aumento: " + valorAumento);
		System.out.println("Salario final: " + novoSalario);		

	}

}