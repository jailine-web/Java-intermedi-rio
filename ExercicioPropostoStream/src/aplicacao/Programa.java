package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Funcionarios;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		List<Funcionarios> func = new ArrayList<>();
		
		System.out.println("Entre com o caminho completo do arquivo:");
		String caminho = ler.nextLine();
		System.out.print("Através do valor do salario, descubra o email do funcionário: ");
		double sal = ler.nextDouble();
		
		try(BufferedReader buffer = new BufferedReader(new FileReader(caminho))){
			String linha = buffer.readLine();
			
			while(linha != null) {
				String[] campos = linha.split(",");
				func.add(new Funcionarios(campos[0], campos[1], Double.parseDouble(campos[2])));
				linha = buffer.readLine();
			}
					
			List<String> ef = func.stream().filter(s -> s.getSalario() > sal)
			.map(s -> s.getEmail()).sorted().collect(Collectors.toList());
			
			System.out.println();
			System.out.println("Os funcionário que recebem mais que "+sal +" são: ");
			ef.forEach(System.out::println);
			
			System.out.print("Digite a letra inicial dos funcionários que deseja somar os salarios: ");
			char letra = ler.next().toUpperCase().charAt(0);
			
			double soma = func.stream()
					.filter(f -> f.getNome().charAt(0) == letra)
					.map(x -> x.getSalario())
					.reduce(0.0, (x,y)-> x + y);
			
			
			System.out.print("Soma dos salários dos nomes iniciados com a letra digitada: "+soma);
		}
		
		catch(IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
		ler.close();
	}

}
