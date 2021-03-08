package cursojava.exercicios.aula06;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double popA = 80000;
		double popB = 200000;
		
		double cresA = 1.03;
		double cresB = 1.015;
		
		int ano = 0;
		
		while(popA <= popB) {
			popA = popA * cresA;
			popB = popB * cresB;
			ano++;
		}
		
		System.out.println("A quantidade de anos é: " + ano);
	}

}
