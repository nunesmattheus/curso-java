package cursojava.exercicios.oo.aula02;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Joao";
		aluno.matricula = 12345;
		aluno.curso = "Engenharia";
		aluno.disciplinas[0] = "Calculo";
		aluno.disciplinas[1] = "Fisica";
		aluno.disciplinas[2] = "Algebra";
		
		aluno.notas[0][0] = 8;
		aluno.notas[0][1] = 6;
		aluno.notas[0][2] = 7.4;
		
		aluno.notas[1][0] = 5;
		aluno.notas[1][1] = 6;
		aluno.notas[1][2] = 5;
		
		aluno.notas[2][0] = 8;
		aluno.notas[2][1] = 6;
		aluno.notas[2][2] = 7.4;
		
		System.out.println("Nome: " + aluno.nome);
		System.out.println("Matricula: " + aluno.matricula);
		System.out.println("Curso: " + aluno.curso + "\n");		
		aluno.imprimirNotas();
		System.out.println();
		aluno.calcularMedia();
		

	}
	
}
