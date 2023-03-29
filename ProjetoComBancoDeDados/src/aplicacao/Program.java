package aplicacao;

import entidades.DaoFactory;
import entidades.Seller;
import entidades.SellerDao;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("#### TESTE 01: encontrar vendedor por meio do m�todo findById #### ");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

	}

}
