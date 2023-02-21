package entidades;

public class Funcionarios implements Comparable<Funcionarios>{

	private String nome;
	private Double salario;

	public Funcionarios(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionarios outro) {
		//Compara os nomes organiza de maneira alfabética
		//return nome.compareTo(outro.getNome());
		//salários em ordem decrescente
		return -salario.compareTo(outro.getSalario());
	}
	
	
	
	
	
}
