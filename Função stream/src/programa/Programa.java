package programa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Programa {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		//Criando uma stream a partir de uma lista
		Stream<Integer> st1 = list.stream();
		Stream<Integer> stx = list.stream().map(x -> x*10) ;
		
		//O m�todo toArray transforma a stream em um vetor
		System.out.println(Arrays.toString(st1.toArray()));
		System.out.println(Arrays.toString(stx.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	
		}

}
