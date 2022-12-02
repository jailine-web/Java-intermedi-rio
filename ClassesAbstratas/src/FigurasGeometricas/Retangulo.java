package FigurasGeometricas;

public class Retangulo extends Figuras{

	private double base;
	private double altura;
	
	public Retangulo(Cor cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public Double area() {
		return base * altura;
	}
	
}
