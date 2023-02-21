package aplicacao;

import java.util.Arrays;
import java.util.List;

public class ListaTipoCuriga {

	public static void main(String[] args) {
		
		System.out.println("Lista de inteiros:");
		List<Integer> myInts = Arrays.asList(7,9,34);
		printlist(myInts);
		System.out.println();
		System.out.println("Lista de strings");
		List<String> myStr = Arrays.asList("Maria","Júlia", "Pedro");
		printlist(myStr);
		
	}

	private static void printlist(List<?> lista) {
		for(Object obj: lista) {
			System.out.println(obj);
		}
	}
}
