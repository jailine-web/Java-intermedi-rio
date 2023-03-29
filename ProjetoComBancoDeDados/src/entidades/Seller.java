package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private Date birthDate;
	private Double baseSalary;
	
	private Department department;
	
	public Seller() {
		
	}
	
	public Seller(int id, String name, String email, Date birthDate, 
			Double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

<<<<<<< HEAD:ProjetoComBancoDeDados/src/entidades/Seller.java
	public void setName(String name) {
		this.name = name;
=======
	public void setName(String nome) {
		this.name = nome;
>>>>>>> 4adbf9cbc04fdae7bc082c903ae932048fb204be:ProjetoComBancoDeDados/src/entities/Seller.java
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Seller [id: " + id + ", nome: " + name + ", email=" 
				+ email + ", birthdate: " + birthDate + ", baseSalary: "
				+ baseSalary + " Department: "+ department;
	}
	
	
}
