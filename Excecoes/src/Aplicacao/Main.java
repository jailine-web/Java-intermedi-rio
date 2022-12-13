package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Reserva;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

		try {

			System.out.print("Número do quarto: ");
			int numero = ler.nextInt();
			System.out.print("Data entrada: ");
			Date dataEntrada = dataFormatada.parse(ler.next());
			System.out.print("Data Saída: ");
			Date dataSaida = dataFormatada.parse(ler.next());

			Reserva r = new Reserva(numero, dataEntrada, dataSaida);

			System.out.println("Reserva: " + r.toString());

			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva:");
			System.out.print("Data entrada: ");
			dataEntrada = dataFormatada.parse(ler.next());
			System.out.print("Data Saída: ");
			dataSaida = dataFormatada.parse(ler.next());

			r.atualizacaoDatas(dataEntrada, dataSaida);
			System.out.println("Reserva: " + r.toString());
		}

		catch (ParseException e) {
			System.out.println("Formato de data inválido");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Erro na reserva " + e.getMessage());
		}

		ler.close();
	}
}
