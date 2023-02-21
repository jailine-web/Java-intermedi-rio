package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import service.Juros;
import service.TaxaJurosBrasil;
import service.TaxaJurosUsa;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double quantia = ler.nextDouble();
		System.out.print("Meses: ");
		int meses = ler.nextInt();
		
		Juros tx = new TaxaJurosUsa(1.0);
		double pagamento = tx.pagamento(quantia, meses);
		
		System.out.println("Pagamento após "+ meses + " meses: ");
		System.out.println(String.format("%.2f", pagamento));
		
		ler.close();
	}

}
