package aplicacao;

import entidades.Cliente;

public class Principal {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); //Compara as refer�ncias dos objetos(endere�o de mem�ria) e n�o as informa��es dos objetos.
		System.out.println(s1 == s2); //D� true, porque o compilador da um tratamento especial(Quando n�o h� ocorr�ncia do "new")
		
		
	} 

}
