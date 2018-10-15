// Criação da interface do Subject que contém os métodos que serão implementados no StockGrabber
// StockGrabber que irá fazer o gerenciamento do estoque
public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();

}
