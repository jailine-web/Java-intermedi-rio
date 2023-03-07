package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import entidades.service.ServicoProduto;

public class Programa {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.90));
		
		ServicoProduto sp = new ServicoProduto();
		
		double soma = sp.somaFiltrada(lista, p -> p.getNome().charAt(0) == 'T');
		//double prod = sp.somaFiltrada(lista, p -> p.getPreco() < 100);
		double m = sp.somaFiltrada(lista, p -> p.getPreco()<100.0);
		
		System.out.println("Soma dos itens que se iniciam com a letra T : "+String.format("%.2f", soma));
		System.out.println("Soma dos valores menores que 100: "+String.format("%.2f", m));
		
	}

}
