
public class Salmao extends extrasDecorator {

	public Salmao(Sushi newSushi) {
		super(newSushi);
		System.out.println("Adiciona Alga");
		System.out.println("Adiciona Salmao");
	}
	
	public String getDescricao() {
		return tempSushi.getDescricao() + ", Salmao";		
	}
	
	public double getPreco() {
		return tempSushi.getPreco() + 5.00;
	}
}
