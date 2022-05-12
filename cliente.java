package familia52;

public class cliente {
	// declaração dos atributos da classe cliente
	
	private String nomeCliente;
	private int idade;
	private String profissao;
	private String celular;
	
	//Declarando o método constructor
	
	public cliente(String nomeCliente, int idade, String profissao, 
			String celular) {
		this.nomeCliente=nomeCliente;
		this.idade= idade;
		this.profissao=profissao;
		this.celular=celular;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do Cliente: "+nomeCliente+"\n Idade: "
				+idade+" anos\n Profissão: "+profissao+"\n Numero de celular: "+celular);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	

}


