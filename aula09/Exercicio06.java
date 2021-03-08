package cursojava.exercicios.aula09;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double[] vet = new double[5];
		
		vet[0] = 1;
		vet[1] = 2;
		vet[2] = 3;
		vet[3] = 4;
		vet[4] = 5;
		
		double maior = 0;
		double menor = 1000;
		int aux1 = 0;
		int aux2 = 0;
		
		for(int i = 0; i < vet.length; i++) {
			if(menor >= vet[i]) {
				menor = vet[i];
				aux1 = i;
			} else if(maior <= vet[i]) {
				maior = vet[i];
				aux2 = i;
			}
		}
		
		System.out.println("Posição: " + aux1 + " Valor: " + menor);
		System.out.println("Posição: " + aux2 + " Valor: " + maior);
		
			

	}

}
