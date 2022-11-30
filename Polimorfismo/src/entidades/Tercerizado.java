package entidades;

public class Tercerizado extends Funcionarios{
	
	private Double valorAdicional = 0d;
	private Double pag = pagamento();
	
	public Tercerizado() {
		
	}

	public Tercerizado(String nome, Integer horas, Double valorPorHoras, Double valorAdicional) {
		super(nome, horas, valorPorHoras);
		this.valorAdicional = valorAdicional;
	}
	
	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public Double pagamento(){
		valorAdicional += 0.110d;
		return pag + valorAdicional;
	}

	public String toString() {
		return "Nome "+ getNome()+ " pagamento: " ;
	}
	
}
