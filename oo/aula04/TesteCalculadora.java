package cursojava.exercicios.oo.aula04;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.soma(1, 2));
		imprimirTela(Calculadora.subtrair(2, 1));
		imprimirTela(Calculadora.multiplicar(2, 3));
		imprimirTela(Calculadora.dividir(4, 2));			
		
	}
	
	static void imprimirTela(int num) {
		System.out.println(num);
	}

}
