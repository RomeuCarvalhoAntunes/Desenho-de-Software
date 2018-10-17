
public class Comprador implements Licitante {
	
	private double maiorLance;
	
	private static int compradorIDRastreador = 0 ;
	
	private int compradorID;
	
	private Leilao leiloeiro;
	
	public Comprador(Leilao newleiloeiro) {
		this.leiloeiro = newleiloeiro;
		
		this.compradorID = ++compradorIDRastreador;
		
		System.out.println("Novo Comprador adicionado ao Leilão: " + this.compradorID);
		
		leiloeiro.registraLicitante(this);
		
	}

	@Override
	public void atualizaValorLance(double maiorLance) {
		this.maiorLance = maiorLance ;
		printNotificacoesLance();
	}
	
	public void printNotificacoesLance() {
		System.out.println(compradorID + "\n Maior Lance do Momento:" + maiorLance);
	}

}
