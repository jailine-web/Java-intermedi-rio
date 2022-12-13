package resolucaoExercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConta {
	
	public static void main(String[] args) {
		
		List<Conta> conta = new ArrayList<>();
		
		Scanner ler = new Scanner(System.in);
	
		System.out.println("Entre com os dados da conta:");
		System.out.print("Número da conta: ");
		int numero = ler.nextInt();
		System.out.print("Titular: ");
		ler.nextLine();
		String nome = ler.nextLine();
		System.out.print("Valor a ser depositado: ");
		double valorInicial = ler.nextDouble();
		System.out.print("Quanto deseja retirar? ");
		double retirar = ler.nextDouble();
		
		Conta c = new Conta(numero, nome, valorInicial, retirar);
		conta.add(c);
		
		System.out.println();
		System.out.print("Entre com o valor que deseja retirar: ");
		double valor = ler.nextDouble();
		c.sacar(valor);
		
		
		ler.close();
	}

}
