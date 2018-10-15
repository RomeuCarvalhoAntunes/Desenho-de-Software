public class AnimalPlay {

	public static void main(String[] args) {
		Animals koda = new Dog();
		Animals periquito = new Bird();
		
		System.out.println("Dog:" + koda.tryToFly());
		System.out.println("Bird:" + periquito.tryToFly());
		
		koda.setFlyingAbility(new itFlys());
		System.out.println("Dog:" + koda.tryToFly());
	}
}
