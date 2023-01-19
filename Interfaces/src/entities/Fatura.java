package entities;

public class Fatura {

	private double tarifaBasica;
	private double tarifa;
	
	public Fatura() {
		super();
	}

	public Fatura(double tarifaBasica, double tarifa) {
		this.tarifaBasica = tarifaBasica;
		this.tarifa = tarifa;
	}
	
	
	public double getTarifaBasica() {
		return tarifaBasica;
	}

	public void setTarifaBasica(double tarifaBasica) {
		this.tarifaBasica = tarifaBasica;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public Double getTotalPagamento() {
		return getTarifaBasica() + getTarifa();
	}
	
}
