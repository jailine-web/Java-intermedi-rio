package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcelas;
import servicos.ServicoContrato;
import servicos.ServicoPaypal;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Número: ");
		int numero = ler.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(ler.next(), dataFormatada);
		System.out.print("Valor do contrato: ");
		double valor = ler.nextDouble();
		
		Contrato c = new Contrato(numero, data, valor);
		
		System.out.print("Entre com o valor das parcelas: ");
		int numParcelas = ler.nextInt();
		
		ServicoContrato pc = new ServicoContrato(new ServicoPaypal());
		pc.ProcessoContrato(c , numParcelas);
		
		System.out.println();
		System.out.println("Parcelas");
		for(Parcelas p: c.getParcelas()) {
			System.out.println(p);
		}
		
		ler.close();
	}

}
