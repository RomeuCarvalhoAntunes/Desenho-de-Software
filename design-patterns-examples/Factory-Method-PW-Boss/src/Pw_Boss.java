
public abstract class Pw_Boss {
	
	private String name;
	private int dano;

	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getDano() {
		return dano;
	}
	
	public void setDano(int newDano) {
		dano = newDano;
	}
	
	public void atacaPersonagem() {
		System.out.println(getName() + ": Atacando Heroi... " + getDano() + " de DANO");
	}
	
	public void apareceBoss() {
		System.out.println(getName() + ": Apareceu na tela");
	}

}
