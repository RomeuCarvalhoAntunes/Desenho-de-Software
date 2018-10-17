
public class LelilaoDeCarros {

	public static void main(String[] args) {
		Leiloeiro leiloeiro = new Leiloeiro();
		
		Comprador comprador01 = new Comprador(leiloeiro);
		Comprador comprador02 = new Comprador(leiloeiro);
		Comprador comprador03 = new Comprador(leiloeiro);
		
		leiloeiro.retiraLicitante(comprador02);
		
		leiloeiro.setNovoLance(500);
		leiloeiro.setNovoLance(502);
		leiloeiro.setNovoLance(503);
		leiloeiro.setNovoLance(510);
		leiloeiro.setNovoLance(550);
		leiloeiro.setNovoLance(590);
		leiloeiro.setNovoLance(6000);
		
		
	}
}
