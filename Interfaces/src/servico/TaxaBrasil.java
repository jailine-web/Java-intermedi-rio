package servico;

public class TaxaBrasil {

	public double imposto(double quantia) {
		
		if (quantia <= 100) {
			return quantia * 0.10;
		}
		else {
			return quantia * 0.15;
		}
	}
}
