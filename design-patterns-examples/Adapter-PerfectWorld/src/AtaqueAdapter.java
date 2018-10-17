
public class AtaqueAdapter implements Ataque{
	
	Barbaro newWB;
	
	public AtaqueAdapter(Barbaro newBarbaro) {
		newWB = newBarbaro;
	}

	@Override
	public void ataqueArco() {
		newWB.ataqueMachado();
		
	}

}
