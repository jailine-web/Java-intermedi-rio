package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Nome do usuário", "Maria");
		cookies.put("Email", "maria@gmail.com");
		cookies.put("Telefone", "9 9785-6734");
		
		cookies.remove("Email");//Remove a chave Telefone
		cookies.put("Telefone", "9 0000-2345"); //Sobrescreve o valor da chave Telefone
		System.out.println("\nVerificando se contém a chave no map: "+cookies.containsKey("Telefone"));
		System.out.println("Obtendo o valor da chave (Telefone) "+ cookies.get("Telefone"));
		System.out.println("Obtendo o tamanho do map: "+ cookies.size());
		
		System.out.println();
		System.out.println("Todos os cookies: ");
		for(String chave: cookies.keySet()) {
			System.out.println(chave +": "+ cookies.get(chave));
		}
		
		
	}

}
