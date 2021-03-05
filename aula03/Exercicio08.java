package cursojava.exercicios.aula03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamnho do arquivo(MB): ");
		double arq = scan.nextDouble();
		
		System.out.println("Digite a velocidade da internet(Mbps): ");
		double vel = scan.nextDouble();
		
		double tempoSeg = arq / vel;
		
		double tempoMin = tempoSeg / 60;
		
		System.out.println("O tempo de download é: " + tempoMin + " minutos");		

	}

}

