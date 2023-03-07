package programa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PepilineStream {

	public static void main(String[] args) {
		
		List<Integer> lista =  Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> st1 = lista.stream().map(x -> x *10);
		//toArray é uma operação terminal
		System.out.println(Arrays.toString(st1.toArray()));
		
		//0 é o elemento neutro da soma. Para realizar a multiplicação basta trocar o 0 por 1(que é o elemento neutro do mult) e adicionar o sinal de multiplicação *
		int soma = lista.stream().reduce(0, (x , y)-> x + y);
		System.out.println("A soma é: "+soma);
		//Collect é uma operação terminal
		List<Integer> listaNova = lista.stream().filter(x -> x % 2 == 0)
				.map(x -> x *10).collect(Collectors.toList());
		System.out.println(Arrays.toString(listaNova.toArray()));
		
	}
	
}
