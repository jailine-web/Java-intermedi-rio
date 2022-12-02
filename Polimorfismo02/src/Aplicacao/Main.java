package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Main {

	public static void main(String[] args) throws ParseException {

		List<Produto> produtos = new ArrayList<Produto>();

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Quantos produtos deseja cadastrar? ");
		int n = ler.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite os dados do " + (i + 1) + "° produto");
			System.out.print("Produto comum(c), usado(u), ou importado(i)? (c,u,i):");
			char resp = ler.next().charAt(0);
			System.out.print("Nome: ");
			String nome = ler.next();
			System.out.print("Preço: ");
			double preco = ler.nextDouble();

			if (resp == 'i') {
				System.out.print("Taxa de alfandega: ");
				double txAlfandegaria = ler.nextDouble();
				produtos.add(new ProdutoImportado(nome, preco, txAlfandegaria));
			}

			if (resp == 'u') {
				System.out.print("Data de fabricação formato: (DD/MM/YYYY):");
				Date date = data.parse(ler.next());
				produtos.add(new ProdutoUsado(nome, preco, date));
			}

			else if (resp == 'c') {
				produtos.add(new Produto(nome, preco));
			}

			System.out.println();
		}

		System.out.println("Etiqueta de preço dos produtos:\n");
		for (Produto produto : produtos) {
			System.out.println(produto.etiquetaPreco());

		}

	}

}
