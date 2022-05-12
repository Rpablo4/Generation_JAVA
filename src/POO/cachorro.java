package POO;

public class cachorro extends animais{
	private String eleFaz;

	public cachorro(String nome, int idade, String som, String eleFaz) {
		super(nome,idade,som );
		this.eleFaz=eleFaz;
	}
	public void imprimirInfo() {
		System.out.println("\n\t\t\tDados do cachorro\nNome:"+getNome()+"\nIdade: "+getIdade()+"\nSom: "+
	getSom()+"\nEle "+eleFaz);
	}
	public String getEleFaz() {
		return eleFaz;
	}

	public void setEleFaz(String eleFaz) {
		this.eleFaz = eleFaz;
	}
	
}
