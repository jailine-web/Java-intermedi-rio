package aplicacao;

import java.util.List;

import entidades.DaoFactory;
import entidades.Department;
import entidades.Seller;
import entidades.SellerDao;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("#### TESTE 01: encontrar vendedor por meio do m�todo findById #### ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n##TESTE 02: encontrar vendedores pelo id do departamento m�todo: findByDepartment() ##");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);

		for (Seller sel : list) {
			System.out.println(sel);
		}
	}

}