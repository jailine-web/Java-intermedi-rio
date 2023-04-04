package aplicacao;

import java.util.Date;
import java.util.List;

import entidades.DaoFactory;
import entidades.Department;
import entidades.Seller;
import entidades.SellerDao;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("#### TESTE 01: encontrar vendedor por meio do método findById #### ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n##TESTE 02: encontrar vendedores pelo id do departamento método: findByDepartment() ##");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);

		for (Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n##TESTE 03: encontrar todos os vendedores ###");
		list = sellerDao.findAll();
		
		for (Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n##TESTE 04: inserindo dados a tabela vendedores ###");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! novo id: " + newSeller.getId());
		
		System.out.println("\n##TESTE 05: atualizando dados da tabela vendedor update seller ###");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		//seller.setEmail("martha@gmail.com");
		sellerDao.update(seller);
		System.out.println("Atualização completa!");
	}

}