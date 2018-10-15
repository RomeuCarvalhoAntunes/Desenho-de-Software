// Cria��o da interface do Subject que cont�m os m�todos que ser�o implementados no StockGrabber
// StockGrabber que ir� fazer o gerenciamento do estoque
public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();

}
