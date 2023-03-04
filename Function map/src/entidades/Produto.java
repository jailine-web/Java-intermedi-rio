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
	public static void atualizacaoDoPrecoEstatico(Produto p) {
		p.setPreco(p.getPreco() * 1.1);
	}
	//M�todo n�o est�tico trabalha com os atributos do pr�prio obj
	public void atualizacaoDoPrecoNaoEstatico() {
		setPreco(getPreco() * 1.1);
		//Outra forma
	//	preco = preco * 1.1;
	}
	
	@Override
	public String toString() {
		return "Produto: " + nome + ", Pre�o: " + String.format("%.2f", preco);
	}
	
	
}
