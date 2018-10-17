import java.util.ArrayList;

public class Leiloeiro implements Leilao{

	private ArrayList<Licitante> licitantes;
	private double lanceAtual;
	
	public Leiloeiro() {
		licitantes = new ArrayList<Licitante>();
	}

	@Override
	public void registraLicitante(Licitante novoLicitante) {
		licitantes.add(novoLicitante);
		
	}

	@Override
	public void retiraLicitante(Licitante deleteLicitante) {
		int  licitanteID = licitantes.indexOf(deleteLicitante);
		
		System.out.println("Licitante: " + (licitanteID+1) + ", Saiu do leilão");
		
		licitantes.remove(licitanteID);
	}

	@Override
	public void notificaLicitantes() {

		for(Licitante licitante : licitantes) {
			licitante.atualizaValorLance(lanceAtual);
		}
		
	}
	
	public void setNovoLance(double lanceAtual) {
		this.lanceAtual = lanceAtual;
		notificaLicitantes();
	}
	
	
	

}
