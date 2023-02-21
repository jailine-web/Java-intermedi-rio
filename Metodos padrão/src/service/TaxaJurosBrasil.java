package service;

public class TaxaJurosBrasil implements Juros{

	private double juro;
	
	public TaxaJurosBrasil(double juro) {
		this.juro = juro;
	}

	@Override
	public double getJuro() {
		return juro;
	}

	
}
