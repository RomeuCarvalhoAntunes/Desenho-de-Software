
public class Smoke {

	private static Smoke granada = null;
	
	
	private Smoke() {}
	
	public static Smoke getInstance() {
		if(granada == null) {
			return granada = new Smoke();
		}
		return granada;
	}
			
}
