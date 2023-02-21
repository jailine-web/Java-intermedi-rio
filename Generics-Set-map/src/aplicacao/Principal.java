package aplicacao;

import java.util.Scanner;

import service.PrintService;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
			
		//PrintService<Integer> pI = new PrintService<>();
		PrintService<String> pS = new PrintService<>();

		System.out.print("Qual a quantidade que deseja digitar? ");
		int numero = ler.nextInt();
		
		System.out.print("Digite os numeros: ");
		
		for(int i = 0; i< numero; i++) {
			String valor = ler.next();
			pS.addValores(valor);
		}
		
		pS.retornaLista();
		String I = pS.retornaPrimeiro();
		System.out.println();
		System.out.print("Primeiro: "+ I);
		
		ler.close();
	}
	
	
	
	
}
