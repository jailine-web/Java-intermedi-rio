package entidades;

import java.util.Objects;

public class Produto implements Comparable<Produto>{

	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	@Override
	public String toString() {
		return "[Produto: " + nome + ", preco: " + preco + "]";
	}

	@Override
	public int compareTo(Produto p) {
		return nome.toUpperCase().compareTo(p.getNome().toUpperCase());
	}
	
	
}
