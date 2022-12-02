package FigurasGeometricas;

public class Circulo extends Figuras {

	private double raio;

	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Double area() {
		return Math.PI * (raio * raio);
	}
}
