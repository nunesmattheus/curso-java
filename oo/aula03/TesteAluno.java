package cursojava.exercicios.oo.aula03;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno:");
		aluno.setNome(scan.next());
		
		System.out.println("Entre com o nome do curso:");
		aluno.setCurso(scan.next());
		
		System.out.println("Entre com a matricula:");
		aluno.setMatricula(scan.nextInt());
		
		for(int i = 0; i < aluno.getDisciplinas().length; i++) {
			System.out.println("Entre com o nome da disciplina " + (i+1));
			aluno.setNomeDisciplina(i, scan.next());			
		}
		
		for(int i = 0; i < aluno.getNotas().length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.getDisciplinas()[i]);
			for(int j = 0; j < aluno.getNotas()[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1));
				aluno.setNotasDisciplinas(i, j, scan.nextDouble());				
			}
		}
		
		aluno.mostrarInfo();
		aluno.calcularMedia();
		
	}

}
