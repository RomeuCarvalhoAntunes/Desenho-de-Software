
public class Guerreiro extends Personagem {
	
	public void auraDeAco() {
		System.out.println("Usando habilidade Aura de A�o");
	}
	
	public Guerreiro() {
		// Construtor da classe 
		// Referencia para a classe pai
		super();
		setDano(500);
		tipoQueConsegueNadar = new NConsegueNadar();
	}

}
