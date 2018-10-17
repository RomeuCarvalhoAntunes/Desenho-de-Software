public class Personagem {

	private String name;
	private String raca;
	private int dano;
	private String sexo;
	
	// Composicao da interface na classe
	public Nadar tipoQueConsegueNadar;
	
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String newRaca) {
		raca = newRaca;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int newDano) {
		dano = newDano;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String newSexo) {
		sexo = newSexo;
	}
	
	public String testeSeConsegueNadar() {
		// retorna o metodo da interface
		return tipoQueConsegueNadar.sabeNadar();
	}
	
	public void setCapacidadeDeNadar(Nadar newTipoQueConsegueNadar) {
		tipoQueConsegueNadar = newTipoQueConsegueNadar;
	}
	
	
	
	
}
