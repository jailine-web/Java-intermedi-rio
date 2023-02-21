package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	List<T> valores = new ArrayList<>();
	
	public void addValores(T valor) {
		valores.add(valor);
	}
	
	public T retornaPrimeiro() {
		if(valores.isEmpty()) {
			throw new IllegalStateException("");
		}
		return valores.get(0);
	}
	
	public void retornaLista() {
		System.out.print("[");
		if(!valores.isEmpty()) {
			System.out.print(valores.get(0));
		}
		for(int i = 1; i< valores.size(); i ++ ) {
			System.out.print(" "+valores.get(i));
		}
		System.out.print("]");
	}
	
	

}
