package service;

import java.util.List;

public class ServicoCalculadora{

	public static <T extends Comparable<? super T>> T servicoCalc(List<T> lista) {
		if(lista.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		T max = lista.get(0);
		for(T item: lista) {
			if(item.compareTo(max)>0) {
				max = item;
			}
		}
		return max;
	}
}
