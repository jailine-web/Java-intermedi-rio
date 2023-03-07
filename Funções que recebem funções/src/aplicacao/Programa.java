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
		
		double sum = sp.somaFiltrada(lista);
		
		System.out.println("Soma: "+String.format("%.2", sum));
	}

}
