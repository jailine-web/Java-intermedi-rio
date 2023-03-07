package entidades.service;

import java.util.List;

import entidades.Produto;

public class ServicoProduto {

	public double somaFiltrada(List<Produto> lista) {
		double soma = 0.0;
		for(Produto p: lista) {
			if(p.getNome().charAt(0) == 'T') {
				soma += p.getPreco();
			}
		}
		return soma;
	}
}
