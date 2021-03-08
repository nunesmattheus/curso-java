package cursojava.exercicios.aula09;

public class Exercicio08 {

	public static void main(String[] args) {
		
		double[] vetA = new double[5];
		double[] vetB = new double[5];
		
		vetA[0] = 1;
		vetA[1] = 2;
		vetA[2] = 3;
		vetA[3] = 4;
		vetA[4] = 5;
		
		for(int i = 0; i < vetA.length; i++) {
			vetB[vetA.length - i - 1] = vetA[i];			
		}
		
		System.out.println("Vetor A = ");
		for(int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Vetor B = ");
		for(int i = 0; i < vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
		System.out.println();		

	}

}
