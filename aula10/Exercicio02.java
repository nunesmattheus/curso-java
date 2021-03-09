package cursojava.exercicios.aula10;

public class Exercicio02 {

	public static void main(String[] args) {
		
double[][] matriz = new double[10][10];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i + j;				
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " - ");				
			}
			System.out.println();
		}
		
		double maior = 0;
		double menor = 1000;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
			   if(matriz[i][j] == matriz[4][j]) {
				   if(maior <= matriz[i][j]) {
					   maior = matriz[i][j];
				   }
			   } else if(matriz[i][j] == matriz[i][5]) {
				   if(menor >= matriz[i][j]) {
					   menor = matriz[i][j];
				   }
			   }
			}
		}
		
		System.out.println();
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

	}

}
