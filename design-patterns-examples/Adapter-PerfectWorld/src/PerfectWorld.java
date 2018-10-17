
public class PerfectWorld {

	public static void main(String[] args) {
		Arqueiro arch = new Arqueiro();
		Barbaro tonelada = new Barbaro();
		
		Ataque barbaroAdapter = new AtaqueAdapter(tonelada);
		
		arch.setName("Arch");
		tonelada.setName("Tonelada");
		arch.setDano(500);
		tonelada.setDano(500000);
		
		// Sem adapter
		arch.ataqueArco();
		tonelada.ataqueMachado();
		
		// Com adapter
		barbaroAdapter.ataqueArco();
	}
	
}
