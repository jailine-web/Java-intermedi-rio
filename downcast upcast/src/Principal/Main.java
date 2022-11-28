package Principal;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		Conta acc = new Conta(1001, "Alex", 0.0);
		ContaCorrente bacc = new ContaCorrente(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Conta acc1 = bacc;
		Conta acc2 = new ContaCorrente(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new ContaCorrente(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		ContaCorrente acc4 = (ContaCorrente)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof ContaCorrente) {
			ContaCorrente acc5 = (ContaCorrente)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}