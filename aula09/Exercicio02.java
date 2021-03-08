package cursojava.exercicios.aula09;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double[] vetA = new double[10];
		double[] vetB = new double[10];
		double[] vetC = new double[10];
		
		vetA[0] = 1;
		vetA[1] = 2;
		vetA[2] = 3;
		vetA[3] = 4;
		vetA[4] = 5;
		vetA[5] = 6;
		vetA[6] = 7;
		vetA[7] = 8;
		vetA[8] = 9;
		vetA[9] = 10;
		
		vetB[0] = 11;
		vetB[1] = 12;
		vetB[2] = 13;
		vetB[3] = 14;
		vetB[4] = 15;
		vetB[5] = 16;
		vetB[6] = 17;
		vetB[7] = 18;
		vetB[8] = 19;
		vetB[9] = 20;
		
		for(int i = 0; i < vetA.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
			System.out.println(vetC[i]);
		}
		
	}

}
