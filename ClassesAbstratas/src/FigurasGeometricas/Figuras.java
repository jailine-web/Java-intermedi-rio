package FigurasGeometricas;

public abstract class Figuras {

	private String cor;
	
	public Figuras(String cor) {
		super();
		this.cor = cor;
	}

	public abstract Double area();
}
