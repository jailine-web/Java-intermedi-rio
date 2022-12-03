package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();

		System.out.print("Digite a quantidade de impostos que deseja: ");
		int n = ler.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {

			System.out.println("Dados para calculos do " + (i + 1) + "° imposto:");
			System.out.print("Pessoa física ou jurídica: (f/j)? ");
			char r = ler.next().charAt(0);
			System.out.print("Nome: ");
			String nome = ler.next();
			System.out.print("Renda anual: ");
			double renda = ler.nextDouble();
			if (r == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = ler.nextDouble();
				pessoas.add(new PessoaFisica(nome, renda, gastosSaude));

			} else if (r == 'j') {
				System.out.print("Digite a quantidade de funcionários:");
				int func = ler.nextInt();
				pessoas.add(new PessoaJuridica(nome, renda, func));
			}
			System.out.println();
		}

		System.out.println("Taxas de impostos");

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

		double soma = 0;

		for (Pessoa p : pessoas) {
			soma += p.calcularImposto();
		}
		System.out.println("\nTotal de impostos: " + soma);
		ler.close();
	}

}
