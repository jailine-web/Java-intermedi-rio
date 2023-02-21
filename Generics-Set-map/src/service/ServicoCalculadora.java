package service;

import java.util.List;

public class ServicoCalculadora{

	public static Integer servicoCalc(List<Integer> lista) {
		if(lista.isEmpty()) {
			throw new IllegalStateException("");
		}
		Integer max = lista.get(0);
		for(Integer item: lista) {
			if(item.compareTo(max)>0) {
				max = item;
			}
		}
		return max;
	}
}
