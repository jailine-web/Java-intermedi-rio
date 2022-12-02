package FigurasGeometricas;

public class Circulo extends Figuras{

	private double PI = 3.1415;
	private double raio;
	
	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public Double area() {
		return PI * (raio*raio);
	}
}
