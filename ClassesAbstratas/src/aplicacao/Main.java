package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.ContaCorrente;
import entidades.ContaPoupanca;
import entidades.Contas;

public class Main {

	public static void main(String[] args) {

		//Contas acc = new Contas(1001, "Alex", 0.0); dá erro pois classes abstratas não podem ser instaciadas:
		//Contas bacc = new ContaCorrente(1002, "Maria", 0.0, 500.0);
		
		List<Contas> contas = new ArrayList<Contas>();
		
		contas.add(new ContaPoupanca(1004, "Maria", 500d, 0.01));
		contas.add(new ContaCorrente(1005, "Julia", 1000d, 200d));
		contas.add(new ContaPoupanca(1006, "Maria", 300d, 0.01));
		contas.add(new ContaCorrente(1007, "Paulo", 500d, 400d));
		
		double soma = 0d;
		
		//Realizando a soma do saldo das contas
		for(Contas conta: contas) {
			soma += conta.getBalance();
		}
		System.out.println("Total da soma das contas: "+soma);
	
		//Somando mais 10 em todas as contas
		for(Contas c : contas) {
			c.deposit(10);
			System.out.println(c.getBalance());
		}
	}
}
