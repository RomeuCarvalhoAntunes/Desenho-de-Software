public class Animals {
	
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private String sound;
	private double speed;
	
	// Aqui é onde setamos dinamicamente a capacidade ou não de voar do animal
	public Flys flyingType;
	
	public void setName (String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWeight(int newWeight) {
		if(newWeight > 0) {
			weight = newWeight;
		} else {
			System.out.println("Weight must be > 0");
		}
	}
	
	public int getWeight() {
		return weight;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	// Metodo de voo
	public  String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
	
	
	
}
