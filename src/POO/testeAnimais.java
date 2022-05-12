package POO;

public class testeAnimais {
	public static void main (String[] args){
		cavalo cavalo1= new cavalo("Juninho",4,"Berra","corre");
		cavalo1.imprimirInfo();
		cachorro cachorro1 = new cachorro("Slash",4,"Late","corre");
		cachorro1.imprimirInfo();
		preguica preguica1= new preguica("Ciclaninho", 2, "Zzzzz","escala arvores");
		preguica1.imprimirInfo();
	}
}
