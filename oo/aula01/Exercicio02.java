package cursojava.exercicios.oo.aula01;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();	
		
		livro.nome = "Pai rico Pai pobre";
		livro.genero = "Auto ajuda";
		livro.numPaginas = 300;
		livro.anoLancamento = 2007;
		
		System.out.println(livro.nome);
		System.out.println(livro.genero);
		System.out.println(livro.numPaginas);
		System.out.println(livro.anoLancamento);

	}

}
