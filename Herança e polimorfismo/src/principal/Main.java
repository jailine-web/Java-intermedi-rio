package principal;

import entidades.ContaCorrente;

public class Main{

		public static void main(String[] args) {

			ContaCorrente account = new ContaCorrente(8010, "Bob Brown", 0.0, 500.0);
			System.out.println(account.getBalance());
			
		}
	}