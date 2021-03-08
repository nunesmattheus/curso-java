package cursojava.exercicios.aula09;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double[] vetA = new double[5];
		double[] vetB = new double[5];
		
		vetA[0] = 1;
		vetA[1] = 2;
		vetA[2] = 3;
		vetA[3] = 4;
		vetA[4] = 6;
		
		for(int i = 0; i < vetA.length; i++) {
			vetB[i] = vetA[i] * vetA[i];
			System.out.println(vetB[i]);
		}		

	}

}
