package cursojava.exercicios.aula09;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double[] vet = new double[5];
		
		vet[0] = 1;
		vet[1] = 2;
		vet[2] = 3;
		vet[3] = 4;
		vet[4] = 5;
		
		double soma = 0;
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] % 5 == 0) {
				soma = soma + vet[i];
			}
		}
		
		System.out.println(soma);	

	}

}
