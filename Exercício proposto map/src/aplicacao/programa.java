package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class programa {

	public static void main(String[] args) {

		Map<String, Integer> votos = new LinkedHashMap<>();
		String caminho = "C:\\Users\\Jai\\Documents\\Java interm\\Exercício proposto map\\votos.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			String linha = br.readLine();

			while (linha != null) {

				String[] campos = linha.split(",");
				String nome = campos[0];
				int cont = Integer.parseInt(campos[1]);

				if (votos.containsKey(nome)) {
					int votosAtuais = votos.get(nome);
					votos.put(nome, cont + votosAtuais);
				} 
				else {
					votos.put(nome, cont);
				}
				
				linha = br.readLine();

			}

			for (String chave : votos.keySet()) {
				System.out.println(chave + ": " + votos.get(chave));
			}

		} catch (IOException e) {
			System.out.println("Erro " + e.getMessage());
		}

	}
}