package entidades;

import java.util.List;

public interface SellerDao {
	
	void insert(Seller departamento);
	void update(Seller departamento);
	void delete(Seller departamento);
	Seller findById(Seller departamento);
	List<Seller> findAll();
}
