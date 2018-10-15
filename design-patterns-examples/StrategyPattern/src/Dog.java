public class Dog extends Animals {
	
	public void digHole() {
		System.out.println("Dug a hole");
	}

	public Dog() {
		super();
		
		setSound("Bark");
		
		flyingType = new cantFly();
	}
}
