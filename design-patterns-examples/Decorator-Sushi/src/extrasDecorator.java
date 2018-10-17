
public abstract class extrasDecorator implements Sushi {
	
	protected Sushi tempSushi;
	
	public extrasDecorator(Sushi newSushi) {
		
		tempSushi = newSushi;
		
	}

	public String getDescricao() {
		return tempSushi.getDescricao();		
	}
	
	public double getPreco() {
		return tempSushi.getPreco();
	}

}
