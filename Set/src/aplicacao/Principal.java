package aplicacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {

		//Os tr�s tipos de implementa��o do set:
		
		//� o mais r�pido, mas n�o garante a ordem dos elementos --> Hashset
		//Set<String> set = new HashSet<>();
		
		//Mais lento ordena em ordem alfabetica --> treeset
		//Set<String> set = new TreeSet();
		
		//Mantem a ordem de inser��o da cole��o, velocidade intermedi�ria
		Set<String> set = new LinkedHashSet();
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		//System.out.println(set.contains("Notebook"));
		
		//Remo��es
		//set.remove("Tv");
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0)== 'T');
		
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
