
public class SteamMarketFacade {
	
	private int senhaVerificadora;
	private String codigoVerificador;
	
	TrustFactor senhaLetra;
	SenhaCartao senhaNumero;
	VerificacaoSaldo saldo;
	Steam appSteamMarket;
	
	public SteamMarketFacade(String newSenhaLetra, int newSenhaNumero) {
		codigoVerificador = newSenhaLetra;
		senhaVerificadora = newSenhaNumero;
		
		appSteamMarket = new Steam();
		senhaLetra = new TrustFactor();
		senhaNumero = new SenhaCartao();
		saldo = new VerificacaoSaldo();
		
	}

	public int getSenhaVerificadora() {
		return senhaVerificadora;
	}

	
	public String getCodigoVerificador() {
		return codigoVerificador;
	}

	public void compraSkin(double valorSkin) {
		if(senhaLetra.contaVerificada(getCodigoVerificador()) && 
				senhaNumero.senhaVerificada(getSenhaVerificadora()) && 
				saldo.temDinheiro(valorSkin)){
					System.out.println("Comprou Miseravi");
				}else {
					System.out.println("Deu não parça");
				}
	}
	
	public void depositaMoney(double dinheiroDaMae) {
		if(senhaLetra.contaVerificada(getCodigoVerificador()) && 
				senhaNumero.senhaVerificada(getSenhaVerificadora())){
					System.out.println("Faliu a mãe, valor depositado: " + dinheiroDaMae );
				}else {
					System.out.println("Deu não parça");
				}
	}
	
	
}
