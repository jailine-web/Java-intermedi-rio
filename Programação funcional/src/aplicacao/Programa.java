package aplicacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Produto("Tv", 900.00));
		produtos.add(new Produto("Notebook", 1200.00));
		produtos.add(new Produto("Tablet", 450.00));

		Comparator<Produto> comp = (p1 , p2) ->{
			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		};

		produtos.sort(comp);

		for (Produto p : produtos) {
			System.out.println(p);
		}

	}

}
