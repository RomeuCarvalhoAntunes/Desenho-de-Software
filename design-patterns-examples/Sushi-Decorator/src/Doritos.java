
public class Doritos extends extrasDecorator {
	
	public Doritos(Sushi newSushi) {
		super(newSushi);
		System.out.println("Adiciona Alga");
		System.out.println("Adiciona Doritos");
	}
	
	public String getDescricao() {
		return tempSushi.getDescricao() + ", Doritos";		
	}
	
	public double getPreco() {
		return tempSushi.getPreco() + 1.00;
	}


}
