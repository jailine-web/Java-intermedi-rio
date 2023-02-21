package CopiarListasDistintas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(1,5,7);
		List<Double> doubles = Arrays.asList(1.0,5.5,7.6);
		List<Object> objs = new ArrayList<>();
		
		copiar(ints, objs);
		imprimirLista(objs);
		copiar(doubles, objs);
		imprimirLista(objs);
		
	}
	
	public static void copiar(List<? extends Number> origem, List<? super Number> destino) {
		for(Number num: origem) {
			destino.add(num);
		}
	}
	public static void imprimirLista(List<?> lista) {
		for(Object obj : lista) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
