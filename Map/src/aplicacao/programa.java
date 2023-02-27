package aplicacao;

import java.util.HashMap;
import java.util.Map;

import entidades.Produto;

public class programa {

	public static void main(String[] args) {
		
		Map<Produto, Double> produtos = new HashMap<>();
		
		Produto p1 = new Produto("Tv", 900.0);
		Produto p2 = new Produto("Notebook", 1200.0);
		Produto p3 = new Produto("Tablet", 400.0);
		
		produtos.put(p1, 1000.0);
		produtos.put(p2, 2000.0);
		produtos.put(p3, 1500.0);
		
		Produto ps = new Produto("Tv", 900.0);
		
		System.out.println("Contém a chave ps: "+ produtos.containsKey(ps));
	}
}
