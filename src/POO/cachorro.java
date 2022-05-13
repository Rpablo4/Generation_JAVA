package POO;

public class cachorro extends animais{

	public cachorro(String especie, String nome, int idade) {
		super(especie,nome,idade);
	}
	public String emiteSom() {
		return "Rrrofff Roouff - Latido do cachorro.";
	}
	
}
