package aplicacao;

import java.util.Set;
import java.util.TreeSet;

import entidades.Produto;

public class OrdenacaoTreeSetC {

	public static void main(String[] args) {

		Set<Produto> set = new TreeSet<>();
		set.add(new Produto("TV", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));
		
		for (Produto p : set) {
			System.out.println(p);
		}
	}

}
