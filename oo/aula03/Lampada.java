package cursojava.exercicios.oo.aula03;

public class Lampada {
	
	private String modelo;
	private String marca;
	private double potencia;
	private double preco;	
	
	public Lampada() { }	

	public Lampada(String modelo, String marca, double potencia, double preco) {		
		this.modelo = modelo;
		this.marca = marca;
		this.potencia = potencia;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void ligar() {
		System.out.println("Ligar");
	}
	
	public void desligar() {
		System.out.println("Desligar");
	}
	
	public void exibirInfo() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Potencia: " + potencia);
		System.out.println("Preco: " + preco);
		
	}

}
