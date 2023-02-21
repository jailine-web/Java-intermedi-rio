package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import service.ServicoCalculadora;

public class resolucao01Generics {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();
		
		String caminho = "C:\\Users\\Jai\\Documents\\Java interm\\Generics-Set-map\\produtos.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String linha = br.readLine();
			while(linha != null) {
				lista.add(Integer.parseInt(linha));
				linha = br.readLine();
			}
			
			Integer r = ServicoCalculadora.servicoCalc(lista);
			System.out.println("Maximo: ");
			System.out.println(r);
		}
		
		catch(IOException e) {
			System.out.println("Erro ");
		}
	}

}
