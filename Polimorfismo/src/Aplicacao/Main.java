package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionarios;
import entidades.Tercerizado;

public class Main {

	public static void main(String[] args) {
		
		List<Funcionarios> funcionarios = new ArrayList<>();
		
		Scanner ler = new Scanner(System.in);
	
		System.out.print("Quantos funcionários deseja digitar? ");
		int n = ler.nextInt();
		
		for(int i = 0; i <n; i++) {
			System.out.println("# Dados do funcionário "+ (i+1));
			System.out.print("O funcionario é tercerizado? ");
			String resp = ler.next();
			if(resp.equals("n")) {
				System.out.print("Digite o nome do funcionário: ");
				ler.nextLine();
				String nome = ler.nextLine();
				System.out.print("Digite a quantidade de horas trabalhadas: ");
				Integer horas = ler.nextInt();
				System.out.print("Digite o valor da hora");
				Double valorP = ler.nextDouble();
				
				Funcionarios func = new Funcionarios(nome, horas, valorP);
				funcionarios.add(func);
			}else if(resp.equals("s")){
				System.out.print("Digite o nome do funcionário: ");
				ler.nextLine();
				String nome = ler.nextLine();
				System.out.print("Digite a quantidade de horas trabalhadas: ");
				Integer horas = ler.nextInt();
				System.out.print("Digite o valor da hora");
				Double valorP = ler.nextDouble();
				System.out.print("Valor adiconal: ");
				Double vA = ler.nextDouble();
				
				Funcionarios tercerizado = new Tercerizado(nome, horas, valorP, vA);
				funcionarios.add(tercerizado);
			}
			
		}
		
		for(Funcionarios f : funcionarios) {
			System.out.println(f);
		}
	}
}
