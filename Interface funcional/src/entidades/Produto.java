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
	
	//M�todo n�o est�tico
	public static boolean ProdutoPredicateEstatico(Produto p){
		return p.getPreco() >= 100.0;
	}
	
	//M�todo n�o est�tico
	public boolean ProdutoPredicate(){
		return preco >= 100.0;
	}
	
	@Override
	public String toString() {
		return "Produto: " + nome + ", Pre�o: " + preco;
	}
	
	
}
