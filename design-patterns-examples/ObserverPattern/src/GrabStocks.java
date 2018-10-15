public class GrabStocks {
	
	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		StockObserver observer2 = new StockObserver(stockGrabber);
		StockObserver observer3 = new StockObserver(stockGrabber);
		
		stockGrabber.setAAPLPrice(250.00);
		stockGrabber.setGOOGrice(540.12);
		stockGrabber.setIBMPrice(321.00);
		
		StockObserver observer4 = new StockObserver(stockGrabber);
		
		stockGrabber.setAAPLPrice(150.00);
		stockGrabber.setGOOGrice(940.12);
		stockGrabber.setIBMPrice(721.00);
	}

}
