import java.util.Scanner;

public class Boss_fight {
	
	public static void main(String[] args) {
		
		
		BossFactory factory;
		
		Pw_Boss boss = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Digite Tigre para Boss do tipo Tigre");
		
		if(userInput.hasNext()) {
			
			String tipoBoss = userInput.nextLine();
			
			boss = BossFactory.makeBoss(tipoBoss);
			
			testeBoss(boss);
			
			
		}
	}

	
	public static void testeBoss(Pw_Boss novoBoss) {
		novoBoss.apareceBoss();
		novoBoss.atacaPersonagem();
	}
}
