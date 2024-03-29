package entidades;

public class Produto {

	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	//M�todo est�tico
	public static String nomesMaiusculosEstatico (Produto p) {
		return p.getNome().toUpperCase();
	}
	//Como � um m�todo n�o est�tico ele trabalha com o pr�prio objeto
	public String nomesMaiusculosNaoEstatico () {
		return getNome().toUpperCase();
	}
	
	
	
	@Override
	public String toString() {
		return "Produto: " + nome + ", Pre�o: " + String.format("%.2f", preco);
	}
	
	
}
