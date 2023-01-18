package ExercicioProposto;

public class Produto {

	private String nome;
	private Double precoUnitario;
	private Double qnt;
	
	public Produto(String nome, Double precoUnitario, Double qnt) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.qnt = qnt;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Double getQnt() {
		return qnt;
	}

	public void setQnt(Double qnt) {
		this.qnt = qnt;
	}	
	
	public double valorTotal() {
		return precoUnitario * qnt;
	}
	
}
