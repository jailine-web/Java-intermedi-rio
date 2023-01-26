package aplicacao;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import entities.AluguelCarros;
import entities.Veiculos;
import servico.ServicoDeAluguel;
import servico.TaxaBrasil;

public class Principal {

		public static void main(String[] args) throws ParseException {
			
			Scanner ler = new Scanner(System.in);
			
			DateTimeFormatter dtf = new DateTimeFormatterBuilder().toFormatter().ofPattern("dd/MM/yyyy HH:mm");
			//DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			
			System.out.println("Dados do aluguel");
			System.out.print("Modelo do carro: ");
			String modelo = ler.nextLine();
			System.out.print("Entre com a data da retirada do ve�culo: ");
			LocalDateTime inicio = LocalDateTime.parse(ler.nextLine(), dtf);
			System.out.print("Entre com a data de retorno do ve�culo: ");
			LocalDateTime fim = LocalDateTime.parse(ler.nextLine(), dtf);
			
			AluguelCarros aC = new AluguelCarros(inicio, fim, new Veiculos(modelo));
			
			System.out.print("Entre com o pre�o por hora: ");
			double hora = ler.nextDouble();
			System.out.print("Entre com o pre�o da di�ria: ");
			double diaria = ler.nextDouble();
			
			ServicoDeAluguel servicoAluguel = new ServicoDeAluguel(hora, diaria, new TaxaBrasil());
			
			servicoAluguel.fatura(aC);
			
			System.out.println();
			System.out.println("FATURA");
			System.out.println("Pagamento b�sico: "+aC.getFatura().getTarifaBasica());
			System.out.println("Imposto: " + aC.getFatura().getTarifa());
			System.out.println("Pagamento total: "+ aC.getFatura().getTotalPagamento());
			
			ler.close();
			
		}
}
