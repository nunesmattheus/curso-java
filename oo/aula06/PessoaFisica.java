package cursojava.exercicios.oo.aula06;

public class PessoaFisica extends Pessoa{
	
	private String cpf;	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
	public String toString() {	
		String s = "Pessoa Fisica[";
		s += " cpf: " + cpf;		
		s += "; " + super.toString();
		s += "]";
		return s;		
	}
	
	public void calcularImposto() {		
		double renda = this.getRenda();		
		if(renda >= 0 && renda <= 1400) {
			this.setImposto(0);
		} else if(renda > 1400 && renda <= 2100){
			this.setImposto(renda*0.1);
		} else if(renda > 2100 && renda <= 2800) {
			this.setImposto(renda*0.15);
		} else if(renda > 2800 && renda <= 3600) {
			this.setImposto(renda*0.25);
		} else {
			this.setImposto(renda*0.30);
		}
	}	

}
