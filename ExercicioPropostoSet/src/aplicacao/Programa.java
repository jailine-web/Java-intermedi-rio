package aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.Alunos;

public class Programa {

	public static void main(String[] args) {

		Set<Alunos> setAlunos = new HashSet<Alunos>();

		Scanner ler = new Scanner(System.in);

		System.out.println("Quantos alunos para o curso A? ");
		int A = ler.nextInt();

		for (int i = 0; i < A; i++) {
			System.out.println("Digite os códigos dos alunos: ");
			int cod = ler.nextInt();
			setAlunos.add(new Alunos(cod));

		}
		System.out.println("Quantos alunos para o curso B? ");
		int B = ler.nextInt();

		for (int i = 0; i < B; i++) {
			System.out.println("Digite os códigos dos alunos: ");
			int cod = ler.nextInt();
			setAlunos.add(new Alunos(cod));

		}
		System.out.println("Quantos alunos para o curso C? ");
		int C = ler.nextInt();

		for (int i = 0; i < C; i++) {
			System.out.println("Digite os códigos dos alunos: ");
			int cod = ler.nextInt();
			setAlunos.add(new Alunos(cod));

		}

		Set<Alunos> juncao = new HashSet<Alunos>(setAlunos);
		System.out.println("Total de alunos: "+ juncao.size());
	}

}
