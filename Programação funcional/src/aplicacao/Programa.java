package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Tv", 900.00));
		produtos.add(new Produto("Notebook", 1200.00));
		produtos.add(new Produto("Tablet", 450.00));
		
		produtos.sort(new Comparacao());
		
		for(Produto p: produtos) {
			System.out.println(p);
		}
		
		
	}

}
