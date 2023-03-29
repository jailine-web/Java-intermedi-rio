package entidades;

import java.util.List;

public interface DepartmentDao {

	void insert(Department departamento);
	void update(Department departamento);
	void delete(Department departamento);
	Department findById(Integer id);
	List<Department> findAll();
}
