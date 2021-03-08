package cursojava.exercicios.aula06;

public class Exercicio11 {

	public static void main(String[] args) {
		
		int n1 = 1;	
		int n2 = 1;
		
		System.out.println("1 ");
		System.out.println("1 ");
		
		int fibo = 0;
		
		while(fibo < 500) {
			fibo = n1 + n2;
			System.out.println(fibo);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
		}

	}

}
