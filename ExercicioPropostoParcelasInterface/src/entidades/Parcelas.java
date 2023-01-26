package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {

	private static DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate dataVencimento;
	private Double quantia;
	
	public Parcelas() {
		
	}
	
	public Parcelas(LocalDate dataVencimento, Double quantia) {
		this.dataVencimento = dataVencimento;
		this.quantia = quantia;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getQuantia() {
		return quantia;
	}

	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}

	@Override
	public String toString() {
		return "Data de vencimento: "+dataVencimento.format(dataFormatada) + " valor: " + String.format("%.2f", quantia) ;
	}
	
	
	
	
	
	
}
