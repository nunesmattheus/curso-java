package cursojava.exercicios.aula09;

public class Exercicio07 {

	public static void main(String[] args) {
		
		double[] vetA = new double[5];
		double[] vetB = new double[5];
		double[] vetC = new double[5];
		
		vetA[0] = 1;
		vetA[1] = 2;
		vetA[2] = 3;
		vetA[3] = 4;
		vetA[4] = 6;
		
		vetB[0] = 1;
		vetB[1] = 5;
		vetB[2] = 2;
		vetB[3] = 4;
		vetB[4] = 6;
		
		for(int i = 0; i < vetA.length; i++) {
			if(vetA[i] > vetB[i]) {
				vetC[i] = 1;
			} else if(vetA[i] == vetB[i]) {
				vetC[i] = 0;
			} else if(vetA[i] < vetB[i]) {
				vetC[i] = -1;
			}
			System.out.println(vetC[i]);
		}
		
	}

}
