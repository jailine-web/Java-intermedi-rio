package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

	private Date dataFabricacao;

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String etiquetaPreco() {
		return getNome() + " (usado) R$ " + String.format("%.2f", getPreco()) + 
				" Data de fabricação: " + sdf.format(dataFabricacao);
	}
}
