package FigurasGeometricas;

public class Retangulo extends Figuras{

	private double base;
	private double altura;
	
	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double area() {
		return base * altura;
	}

	
}
