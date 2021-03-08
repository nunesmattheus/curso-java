package cursojava.exercicios.aula09;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double[] vet = new double[5];
		
		vet[0] = 1;
		vet[1] = 2;
		vet[2] = 3;
		vet[3] = 4;
		vet[4] = 5;
		
		int cont = 0;
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				cont++;
			}
		}
		
		System.out.println(cont);		

	}

}
