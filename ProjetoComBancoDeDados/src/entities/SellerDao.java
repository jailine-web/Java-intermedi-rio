package entities;

import java.util.List;

public interface SellerDao {
	
	void insert(Seller departamento);
	void update(Seller departamento);
	void delete(Seller departamento);
	Seller findById(Integer Id) ;
	List<Seller> findAll();
}
