package cursojava.exercicios.oo.aula03;

public class Aluno {
	
	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplinas;
	private double[][] notas;		
	
	public Aluno() {
		disciplinas = new String[3];
		notas = new double[3][3];
	}		

	public Aluno(String nome, int matricula, String curso) {		
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = new String[3];
		this.notas = new double[3][3];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
	public void calcularMedia() {
		double soma = 0;
		
		for(int i = 0; i < this.notas.length; i++) {
			soma = 0;
			for(int j = 0; j < this.notas[i].length; j++) {
				soma += this.notas[i][j];
			}
			double media = soma/3;
			System.out.println("Média de " + this.disciplinas[i] + " é: " + media);
			if(media >=7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}				
	}
	
	public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);
        
        for (int i=0; i<notas.length; i++){
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j=0; j<notas[i].length; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	public void setNomeDisciplina(int pos, String nomeDisciplina) {
		this.disciplinas[pos] = nomeDisciplina;
	}
	
	public void setNotasDisciplinas(int posI, int posJ, double notaDisciplina) {
		this.notas[posI][posJ] = notaDisciplina;
	}
}
