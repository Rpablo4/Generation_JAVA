package POO;

public class preguica extends animais{
	

	public preguica(String especie, String nome, int idade) {
		super(especie,nome,idade);
	}
	public String emiteSom() {
		return "Zzzz - preguica dormindo";
	}
}
