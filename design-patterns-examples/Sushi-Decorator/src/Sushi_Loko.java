
public class Sushi_Loko {
	
	public static void main(String[] args) {
		
		
		System.out.println("Criando Sushi B�sico: ");
		Sushi basico = new Salmao(new planejaSushi());
		System.out.println("Ingredientes: " + basico.getDescricao());
		System.out.println("Pre�o: " + basico.getPreco());
		System.out.println("\n ");
		
		System.out.println("Criando Sushi loko: ");
		Sushi loko = new Salmao(new Doritos(new planejaSushi()));
		System.out.println("Ingredientes: " + loko.getDescricao());
		System.out.println("Pre�o: " + loko.getPreco());
		
		
	}

}
