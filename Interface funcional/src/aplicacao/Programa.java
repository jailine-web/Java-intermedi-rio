package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.00));
		
		Predicate<Produto> pred = p -> p.getPreco() >= 100.0; 
		
		lista.removeIf(pred);
		
		for(Produto p: lista) {
			System.out.println(p);
		}
		
		
	}

}
