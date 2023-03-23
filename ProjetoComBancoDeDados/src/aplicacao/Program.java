package aplicacao;

import java.util.Date;

import entidades.Department;
import entidades.Seller;

public class Program {

	public static void main(String[] args) {

		Department objD = new Department(1, "Books");
		System.out.println(objD);
		
		Seller s = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, objD);
		System.out.println(s);
		
	}

}
