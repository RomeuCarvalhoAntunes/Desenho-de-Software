public interface BossFactory {

	public static Pw_Boss makeBoss(String newTipoBoss) {
		
		Pw_Boss newBoss = null;
		
		if(newTipoBoss.equals("Tigre")) {
			
			return new TigreBoss();
			
		} else
			
			return new GuerreiroBoss();
		
	}
	
}
