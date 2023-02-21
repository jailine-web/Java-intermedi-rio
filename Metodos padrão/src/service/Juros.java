package service;

import java.security.InvalidParameterException;

public interface Juros {
	
	double getJuro();
	
	public default double pagamento(double quantia, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("A quantidade de meses deve ser maior que zero!");
		}
		//Potenciação
		return quantia * Math.pow(1.0 + getJuro()/100, meses);
	}
	
}
