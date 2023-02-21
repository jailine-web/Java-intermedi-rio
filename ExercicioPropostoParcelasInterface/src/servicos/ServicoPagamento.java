package servicos;

public interface ServicoPagamento {

	double taxaPagamento(double quantia);
	
	double juros(double quantia, Integer meses);
}
