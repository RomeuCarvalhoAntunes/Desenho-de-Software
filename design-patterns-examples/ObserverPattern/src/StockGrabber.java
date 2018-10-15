import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers; // lista dos "inscritos" no estoque
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	
	public StockGrabber() {
		
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObserver) {
		// Adiciona um novo observer no arraylist
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		
		// delete do arraylist
		int observerIndex = observers.indexOf(deleteObserver);
		
		System.out.println("Observer(inscrito)" + observerIndex+1 + "deleted");
		
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		
		for (Observer observer : observers ) {
			
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
		
	}

	
	public void setIBMPrice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}
	
	public void setAAPLPrice(double newAAPLPrice) {
		this.aaplPrice = newAAPLPrice;
		notifyObserver();
	}
	
	
	public void setGOOGrice(double newGOOGPrice) {
		this.googPrice = newGOOGPrice;
		notifyObserver();
	}
	
	
	
	
	
	
}
