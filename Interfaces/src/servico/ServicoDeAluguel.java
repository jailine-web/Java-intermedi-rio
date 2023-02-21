package servico;

import java.time.Duration;

import entities.AluguelCarros;
import entities.Fatura;

public class ServicoDeAluguel {

	private Double precoPorHora;
	private Double precoPorDia;
	private ServicoDeImposto imposto;
	
	public ServicoDeAluguel(Double precoPorHora, Double precoPorDia, ServicoDeImposto imposto) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.imposto = imposto;
	}

	public Double getPrecoPorHora() {
		return precoPorHora;
	}

	public Double getPrecoPorDia() {
		return precoPorDia;
	}
	
	public ServicoDeImposto getImposto() {
		return imposto;
	}

	public void fatura(AluguelCarros aluguelC) {
		
		//Encontra a duração entre dois instantes
		double duracaoMinutos = Duration.between(aluguelC.getInstanteInicial(), 
		aluguelC.getInstanteFinal()).toMinutes();
		double horas = duracaoMinutos/60;
		double pagBasico;
		
		//Math.ceil arredonda a hora para cima
		if(horas <= 12.0) {
			pagBasico = precoPorHora * Math.ceil(horas);
		}
		else {
			pagBasico = precoPorDia * Math.ceil(horas/24);
		}
		
		double imposto = this.imposto.imposto(pagBasico);
		
		aluguelC.setFatura(new Fatura(pagBasico,imposto));
	}
}
