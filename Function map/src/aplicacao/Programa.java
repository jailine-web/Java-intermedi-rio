package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import entidades.Produto;
import util.NomeMaiuculos;

public class Programa {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.90));
		
		List<String> nomes = lista.stream().map(new NomeMaiuculos()).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);
	}

}
