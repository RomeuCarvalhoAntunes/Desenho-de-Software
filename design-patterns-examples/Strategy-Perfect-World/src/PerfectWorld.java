
public class PerfectWorld {

	public static void main(String[] args) {
		Personagem peter = new Selvagem();
		Personagem romeu = new Guerreiro();
		System.out.println("Guerreiro: " + romeu.testeSeConsegueNadar());
		System.out.println("Selvagem: "+ peter.testeSeConsegueNadar());
		
		// Fazer guerreiro nadar
		romeu.setCapacidadeDeNadar(new ConsegueNadar());
		System.out.println("Guerreiro: " + romeu.testeSeConsegueNadar());
	}
}
