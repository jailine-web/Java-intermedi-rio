package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;
import service.ServicoCalculadora;

public class resolucao01Generics {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();
		
		String caminho = "C:\\Users\\Jai\\Documents\\Java interm\\Generics-Set-map\\produtos.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String linha = br.readLine();
			while(linha != null) {
				
				String[] campos = linha.split(",");
				lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			
			Produto r = ServicoCalculadora.servicoCalc(lista);
			System.out.println("Mais caro: ");
			System.out.println(r);
		}
		
		catch(IOException e) {
			System.out.println("Erro ");
		}
	}

}
