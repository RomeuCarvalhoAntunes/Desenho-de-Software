public class TestCompraSkin {

	
	public static void main(String[] args) {
		
		SteamMarketFacade acessandoContaSteam = new SteamMarketFacade("HTWM", 12345);
		
		acessandoContaSteam.compraSkin(12591);
		acessandoContaSteam.depositaMoney(1000);
		System.out.println("\nComprando outra Skin\n");
		acessandoContaSteam.compraSkin(125910000);
		
	}
}
