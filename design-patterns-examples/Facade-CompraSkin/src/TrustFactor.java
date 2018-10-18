
public class TrustFactor {
	
	private String codigoVerificador = "HTWM";
	
	public String getCodigoVerificador() {
		return codigoVerificador;
	}
	
	public boolean contaVerificada(String newCodigoVerificador) {
	
		if(codigoVerificador == newCodigoVerificador) {
			
			return true;
			
		}
		
		return false;
	}

}
