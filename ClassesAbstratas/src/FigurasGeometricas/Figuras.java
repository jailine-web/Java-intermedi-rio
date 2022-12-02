package FigurasGeometricas;

public abstract class Figuras {

	private Cor cor;
	
	public Figuras(Cor cor) {
		super();
		this.setCor(cor);
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public abstract Double area();
}
