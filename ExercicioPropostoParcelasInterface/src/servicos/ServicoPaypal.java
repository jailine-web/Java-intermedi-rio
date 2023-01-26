package servicos;

public class ServicoPaypal implements ServicoPagamento{

	
	@Override
	public double taxaPagamento(double quantia) {
		//2%
		return quantia * 0.02;
	}

	@Override
	public double juros(double quantia, Integer meses) {
		return quantia * 0.01 * meses;
	}

}
