package cursojava.exercicios.oo.aula06;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private double renda;
	private double imposto;	

	public Pessoa() { }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public String toString() {
		return "Pessoa [nome = " + nome + ", telefone = " + telefone + ", renda = " + renda + ", imposto = " + imposto + "]";
	}	

	
}
