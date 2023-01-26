package servicos;


import java.time.LocalDate;

import entidades.Contrato;
import entidades.Parcelas;

public class ServicoContrato {

	private ServicoPagamento servicoPagamento;
	
	public ServicoContrato(ServicoPagamento servicoPagamento) {
		this.servicoPagamento = servicoPagamento;
	}

	public void ProcessoContrato(Contrato c, Integer meses) {
	
		double parcelaBasica = c.getValorTotal() / meses;
		
		for(int i = 1; i <= meses; i++) {
			
			//Data original mais um mês = plusMonths
			LocalDate vencimento = c.getDate().plusMonths(i);
			double juros = servicoPagamento.juros(parcelaBasica, i);
			double taxa = servicoPagamento.taxaPagamento(parcelaBasica + juros);
			double cota = parcelaBasica + juros + taxa;
			
			c.getParcelas().add(new Parcelas(vencimento, cota));
			
		}
		
	}
}
