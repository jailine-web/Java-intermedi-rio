package Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numeroQuarto;
	private Date dataEntrada;
	private Date dataSaida;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
	public Reserva(Integer numeroQuarto, Date dataEntrada, Date dataSaida) {
		this.numeroQuarto = numeroQuarto;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	
	public Date getDataSaida() {
		return dataSaida;
	}
	
	//retorna a diferença de dias
	public long duracaoEmDias() {
		long diff = dataSaida.getTime() - dataEntrada.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void atualizacaoDatas(Date dataEntrada , Date dataSaida) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	
	@Override
	public String toString() {
		return "Quarto: "+ getNumeroQuarto()
		+ " Data de entrada: "+ sdf.format(dataEntrada)
		+ " Data saída: "+ sdf.format(dataSaida) 
		+ " Duração: "+ duracaoEmDias() + " ,noites";
	}
	
}
