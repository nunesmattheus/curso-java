package cursojava.exercicios.oo.aula06;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
	
	public String toString() {
		String s = "Pessoa Fisica[";
		s += " cnpf: " + cnpj;		
		s += "; " + super.toString();
		s += "]";
		return s;	
	}
	
	public void calcularImposto() {
		double renda = this.getRenda();
		this.setImposto(renda*0.1);
	}	
	

}
