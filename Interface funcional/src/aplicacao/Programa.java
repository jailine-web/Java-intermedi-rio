package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import entidades.ProdutoPredicate;

public class Programa {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.00));
		
		lista.removeIf(new ProdutoPredicate());
		
		for(Produto p: lista) {
			System.out.println(p);
		}
		
		
	}

}
