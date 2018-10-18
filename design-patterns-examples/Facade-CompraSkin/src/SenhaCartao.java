
public class SenhaCartao {
	
	private int senhaVerificadora = 12345;
	
	public int getSenhaVerificadora() {
		return senhaVerificadora;
	}
	
	public boolean senhaVerificada(int newSenhaVerificadora) {
	
		if(senhaVerificadora == newSenhaVerificadora) {
			
			return true;
			
		}
		
		return false;
	}

}
