package entidades;

public class ProdutoImportado extends Produto{

	private Double taxaAlfandegaria;

	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String nome,Double preco,Double taxaAlfandegaria) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	public Double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	@Override
	public String etiquetaPreco() {
		return  getNome() + " $ "+ String.format("%.2f",getPreco())+
				"(Taxa Alfandeg�ria: R$ "+ String.format("%.2f", getTaxaAlfandegaria()) + " )";
		
	}
	
}
	