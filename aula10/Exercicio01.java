package cursojava.exercicios.aula10;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double[][] matriz = new double[4][4];
		
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
		double menor = 100;
		double aux1 = 0;
		double aux2 = 0;
		double aux3 = 0;
		double aux4 = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {				
				if(menor >= matriz[i][j]) {
					menor = matriz[i][j];
					aux1 = i;
					aux2 = j;
				} else if(maior <= matriz[i][j]) {
					maior = matriz[i][j];
					aux3 = i;
					aux4 = j;
				}								
			}
		}
		
		System.out.println("Maior: " + maior + " Posição: " + aux3 + " " + aux4);
		System.out.println("Menor: " + menor + " Posição: " + aux1 + " " + aux2);

	}
	
}
