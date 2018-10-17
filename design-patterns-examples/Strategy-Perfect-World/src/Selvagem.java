
public class Selvagem  extends Personagem{

	public void trasnformaBesta() {
		System.out.println("Alterando para forma Bestial");
	}
	
	public Selvagem() {
		super();
		setDano(300);
		tipoQueConsegueNadar = new ConsegueNadar();
	}
	
}
