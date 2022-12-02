package FigurasGeometricas;

import java.awt.MultipleGradientPaint.ColorSpaceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Figuras> figuras = new ArrayList<Figuras>();

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o número de figuras que será digitadas:");
		int n = ler.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "° figura");
			System.out.print("É retangulo(r) ou circulo? (r/c):");
			char res = ler.next().charAt(0);
			System.out.print("Qual a cor? (red/black/blue): ");
			Cor cor = Cor.valueOf(ler.next());

			if (res == 'r') {
				System.out.print("Largura: ");
				double base = ler.nextDouble();
				System.out.print("Altura: ");
				double alt = ler.nextDouble();
				figuras.add(new Retangulo(cor, base, alt));
				
			} else {
				System.out.print("Qual o raio? ");
				double raio = ler.nextDouble();

				figuras.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println();
		System.out.println("ÁREAS DAS FIGURAS");
		for (Figuras fig : figuras) {
			System.out.println(String.format("%.2f", fig.area()));
		}
		
		ler.close();
	}

}
