package cursojava.exercicios.oo.aula03;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
		
		System.out.println("Entre com o modelo:");
		lampada.setModelo(scan.next());
		
		System.out.println("Entre com a marca:");
		lampada.setMarca(scan.next());
		
		System.out.println("Entre com a potencia");
		lampada.setPotencia(scan.nextDouble());
		
		System.out.println("Entre com o preco:");
		lampada.setPreco(scan.nextDouble());
		
		lampada.exibirInfo();
				
		lampada.ligar();
		lampada.desligar();

	}

}
