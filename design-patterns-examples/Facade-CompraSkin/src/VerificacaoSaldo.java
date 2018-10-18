
public class VerificacaoSaldo {
	
	private double saldoNaSuaCarteira = 100000.00;
	
	public double getSaldoNaSuaCarteira() {
		return saldoNaSuaCarteira;
	}
	
	public void dinheiroGasto(double skinComprada) {
		saldoNaSuaCarteira -= skinComprada;
	}
	
	public void depositoDinheiro(double dinheiroDepositado) {
		saldoNaSuaCarteira += dinheiroDepositado;
	}
	
	public boolean temDinheiro(double skinComprada) {
		if(skinComprada > saldoNaSuaCarteira) {
			System.out.println("TU É POBRE MLK, SOME DAQUI\n");
			System.out.println("Valor na tua carteira: " + getSaldoNaSuaCarteira()+ "\n");
			return false;
		} else {
			dinheiroGasto(skinComprada);
			System.out.println("Tu comprou uma skin de: " + skinComprada + "\n");
			System.out.println("Valor na tua carteira: " + getSaldoNaSuaCarteira()+ "\n");
			return true;
		}

	}
	
	public void meDaTeuDinheiro(double dinheiroDepositado) {
		depositoDinheiro(dinheiroDepositado);
		System.out.println("Valor Depositado: " + dinheiroDepositado + "\n");
		System.out.println("Valor na tua carteira: " + getSaldoNaSuaCarteira()+ "\n");
	}

}
