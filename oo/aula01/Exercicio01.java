package cursojava.exercicios.oo.aula01;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.marca = "Volt";
		lampada.modelo = "E20";
		lampada.potencia = 220;
		lampada.preco = 5.50;
		
		System.out.println(lampada.marca);
		System.out.println(lampada.modelo);
		System.out.println(lampada.potencia);
		System.out.println(lampada.preco);

	}

}
