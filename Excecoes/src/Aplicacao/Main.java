package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Reserva;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner ler = new Scanner(System.in);
		
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número do quarto: ");
		int numero = ler.nextInt();
		System.out.print("Data entrada: ");
		Date dataEntrada = dataFormatada.parse(ler.next());
		System.out.print("Data Saída: ");
		Date dataSaida = dataFormatada.parse(ler.next());
		
		if(!dataSaida.after(dataEntrada)) {
			System.out.println("Erro ao realizar reserva: Data de saída é menor que a data de entrada");
		}
		else {
			Reserva r = new Reserva(numero, dataEntrada, dataSaida);
			
			System.out.println("Reserva: "+ r.toString());
			
			System.out.println("Entre com os dados para atualizar a reserva:");
			System.out.print("Data entrada: ");
			dataEntrada = dataFormatada.parse(ler.next());
			System.out.print("Data Saída: ");
			dataSaida = dataFormatada.parse(ler.next());
			
			Date now = new Date();
			
			if(dataSaida.before(now) || dataEntrada.before(now)){
				System.out.println("Erro na reserva: datas passadas");
			} 
			else if(!dataSaida.after(dataEntrada)){
				System.out.println("Erro ao realizar reserva: Data de saída é menor que a data de entrada");

			}else {
				
				r.atualizacaoDatas(dataEntrada, dataSaida);
				System.out.println("Reserva: "+ r.toString());
			}
			
		}
		
		ler.close();		
	}
}
