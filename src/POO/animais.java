package POO;

public class animais {
	
	//Declarando atributos
	
	private String especie;
	private String nome;
	private int idade;

	//criando construtor
	public animais ( String especie, String nome, int idade) {
		super();
		this.nome=nome;
		this.idade=idade;
		this.especie=especie;
	}
	public void imprimirInfo() {
		System.out.println("\n\t\t\tDados do animal:\nEspécie: "+getEspecie()+"Nome:"+getNome()+"\nIdade: "+getIdade()
		+"\nEmite o som: "+emiteSom());
	}
	public String getNome() {
		return nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String emiteSom() {
		return "Nenhum som definido";
	}
	
}

