package entities;

import java.time.LocalDateTime;

public class AluguelCarros {

	private LocalDateTime instanteInicial;
	private LocalDateTime instanteFinal;
	
	private Veiculos veiculo;
	private Fatura fatura;
	
	public AluguelCarros() {
		super();
	}

	public AluguelCarros(LocalDateTime instanteInicial, LocalDateTime instanteFinal, Veiculos veiculo) {
		super();
		this.instanteInicial = instanteInicial;
		this.instanteFinal = instanteFinal;
		this.veiculo = veiculo;
	}

	public LocalDateTime getInstanteInicial() {
		return instanteInicial;
	}

	public void setInstanteInicial(LocalDateTime instanteInicial) {
		this.instanteInicial = instanteInicial;
	}

	public LocalDateTime getInstanteFinal() {
		return instanteFinal;
	}

	public void setInstanteFinal(LocalDateTime instanteFinal) {
		this.instanteFinal = instanteFinal;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
}
