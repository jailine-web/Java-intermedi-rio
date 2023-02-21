package Problema01ListaCuringa;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Figura> minhasFiguras = new ArrayList<>();
		
		minhasFiguras.add(new Retangulo(3.0, 2.0));
		minhasFiguras.add(new Circulo(2.0));
		
		List<Circulo> circulos = new ArrayList<Circulo>();
		circulos.add(new Circulo(3));
		circulos.add(new Circulo(4));
		System.out.println("Área total: "+ areaTotal(minhasFiguras));
		
	}
	
	public static double areaTotal(List<? extends Figura> l) {
		double soma = 0;
		for(Figura f : l) {
			soma += f.area();
		}
		
		return soma;
	}


}
