package cursojava.exercicios.oo.aula02;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.modelo = "E15";
		lampada.marca = "Volts";
		lampada.potencia = 220;
		lampada.preco = 5.70;
		
		System.out.println(lampada.modelo);
		System.out.println(lampada.marca);
		System.out.println(lampada.potencia);
		System.out.println(lampada.preco);
		
		lampada.ligar();
		lampada.desligar();		

	}

}
