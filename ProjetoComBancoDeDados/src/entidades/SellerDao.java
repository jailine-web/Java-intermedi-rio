package entidades;

import java.util.List;

public interface SellerDao {
	
	void insert(Seller departamento);
	void update(Seller departamento);
	void delete(Seller departamento);
<<<<<<< HEAD:ProjetoComBancoDeDados/src/entidades/SellerDao.java
	Seller findById(Integer id);
=======
	Seller findById(Integer Id) ;
>>>>>>> 4adbf9cbc04fdae7bc082c903ae932048fb204be:ProjetoComBancoDeDados/src/entities/SellerDao.java
	List<Seller> findAll();
}
