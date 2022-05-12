package POO;

public class cavalo extends animais{
	
	private String eleFaz;

	public cavalo(String nome, int idade, String som, String eleFaz) {
		super(nome,idade,som );
		this.eleFaz=eleFaz;
	}
	public void imprimirInfo() {
		System.out.println("\n\t\t\tDados do cavalo\nNome:"+getNome()+"\nIdade: "+getIdade()+"\nSom: "+
	getSom()+"\nEle "+eleFaz);
	}
	public String getEleFaz() {
		return eleFaz;
	}

	public void setEleFaz(String eleFaz) {
		this.eleFaz = eleFaz;
	}
	
	
	
}
