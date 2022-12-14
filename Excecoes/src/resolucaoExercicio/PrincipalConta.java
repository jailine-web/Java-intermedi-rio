package resolucaoExercicio;

import java.util.Scanner;

public class PrincipalConta {
	
	public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
	
		System.out.println("Entre com os dados da conta:");
		System.out.print("Número da conta: ");
		int numero = ler.nextInt();
		System.out.print("Titular: ");
		ler.nextLine();
		String nome = ler.nextLine();
		System.out.print("Valor a ser depositado: ");
		double valorInicial = ler.nextDouble();
		System.out.print("Qual o limite do saque? ");
		double retirar = ler.nextDouble();
		
		Conta c = new Conta(numero, nome, valorInicial, retirar);
		
		System.out.println();
		System.out.print("Entre com o valor que deseja retirar: ");
		double valor = ler.nextDouble();
		try {
			
			c.sacar(valor);
			System.out.println("Saldo atual: "+ c.getSaldo());
		} 
		catch(ExcecaoCustomizada e) {
			System.out.println(e.getMessage());
		}
		
		ler.close();
	}

}
