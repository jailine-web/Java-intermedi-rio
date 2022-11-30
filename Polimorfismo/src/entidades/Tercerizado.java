package entidades;

public class Tercerizado extends Funcionarios{
	
	private Double valorAdicional = 0d;
	
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
	public final double pagamento(){
		valorAdicional += 1.1d;
		return super.pagamento() + valorAdicional;
	}

	public String toString() {
		return "Nome: "+ getNome()+ "salario: " + pagamento();
	}
	
}
