package Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Model.excecao.DominioException;

public class Reserva {

	private Integer numeroQuarto;
	private Date dataEntrada;
	private Date dataSaida;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
	public Reserva(Integer numeroQuarto, Date dataEntrada, Date dataSaida)  {
		if(!dataSaida.after(dataEntrada)){
			throw new DominioException("Erro ao realizar reserva: Data de sa�da � menor "
					+ "que a data de entrada");
		}
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
	
	//retorna a diferen�a de dias
	public long duracaoEmDias() {
		long diff = dataSaida.getTime() - dataEntrada.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void atualizacaoDatas(Date dataEntrada , Date dataSaida) {
		Date now = new Date();
		
		if(dataSaida.before(now) || dataEntrada.before(now)){
			throw new DominioException("Erro na reserva: datas passadas");
		} 
		if(!dataSaida.after(dataEntrada)){
			throw new DominioException("Erro ao realizar reserva: Data de sa�da � menor "
					+ "que a data de entrada");
		}
		
		this.dataEntrada = dataEntrada;
		this.dataSaida   = dataSaida;
	}
	
	@Override
	public String toString() {
		return "Quarto: "+ getNumeroQuarto()
		+ " Data de entrada: "+ sdf.format(dataEntrada)
		+ " Data sa�da: "+ sdf.format(dataSaida) 
		+ " Dura��o: "+ duracaoEmDias() + " ,noites";
	}
	
}
