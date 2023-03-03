package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.90));
		
		//Opcional, fica mais flexivel, podendo ser o valor digitado pelo usuário
		double fator = 1.1;
		
		lista.forEach(p -> p.setPreco(p.getPreco()* fator));
		lista.forEach(System.out::println);
	}

}
