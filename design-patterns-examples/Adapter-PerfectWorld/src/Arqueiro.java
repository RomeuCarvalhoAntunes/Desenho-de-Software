
public class Arqueiro implements Ataque{
	private String name;
	private int dano;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	
	public void ataqueArco() {
		System.out.println("Atacando com o arco: " + getDano());
	}
	
}
