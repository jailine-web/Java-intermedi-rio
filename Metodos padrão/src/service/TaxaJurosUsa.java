package service;

public class TaxaJurosUsa implements Juros{

	private double juro;
	
	public TaxaJurosUsa(double juro) {
		this.juro = juro;
	}
	
	@Override
	public double getJuro() {
		return juro;
	}

	
	
}
