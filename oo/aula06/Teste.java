package cursojava.exercicios.oo.aula06;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Teste pessoa fisica ***");
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		pessoaFisica.setNome("Joao");
		pessoaFisica.setTelefone("88888-8888");
		pessoaFisica.setRenda(1000);
		pessoaFisica.setCpf("777755555");
		
		pessoaFisica.calcularImposto();
		
		System.out.println(pessoaFisica);
		
		System.out.println("*** Teste pessoa juridica ***");
		
		PessoaJuridica pessoaJurudica = new PessoaJuridica();
		
		pessoaJurudica.setNome("Joao");
		pessoaJurudica.setTelefone("88888-8888");
		pessoaJurudica.setRenda(50000);
		pessoaJurudica.setCnpj("777755555");
		
		pessoaJurudica.calcularImposto();
		
		System.out.println(pessoaJurudica);

	}

}
