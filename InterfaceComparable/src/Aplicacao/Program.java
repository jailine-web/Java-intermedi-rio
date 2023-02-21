package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
		List<Funcionarios> funcionarios = new ArrayList<>();
		String caminho = "C:\\Users\\Jai\\Documents\\Java interm\\InterfaceComparable\\nomes.txt";
		
		
		try (BufferedReader br = new BufferedReader(new  FileReader(caminho))){
			
			String funcionariosCsv = br.readLine();
			
			while (funcionariosCsv != null) {
				String[] campos = funcionariosCsv.split(",");
				funcionarios.add(new Funcionarios(campos[0], Double.parseDouble(campos[1])));
				funcionariosCsv = br.readLine();
			}
			//Ordena a coleção 
			Collections.sort(funcionarios);
			for (Funcionarios fun : funcionarios) {
				System.out.println(fun.getNome() + ", "+ fun.getSalario());
			}
			
		}
		
		catch(IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
	}
}
