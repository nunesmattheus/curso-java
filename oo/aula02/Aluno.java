package cursojava.exercicios.oo.aula02;

public class Aluno {
	
	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notas = new double[3][3];
	
	void calcularMedia() {
		double soma = 0;
		
		for(int i = 0; i < notas.length; i++) {
			soma = 0;
			for(int j = 0; j < notas[i].length; j++) {
				soma += notas[i][j];
			}
			double media = soma/3;
			System.out.println("Média de " + disciplinas[i] + " é: " + media);
			if(media >=7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}				
	}
	
	void imprimirNotas() {
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print(disciplinas[i] + "(nota " + (j+1) + ")" + " - " + notas[i][j] + " - ");
			}
			System.out.println();
		}
	}	

}
