package ExercicioResolvido;

import java.util.Date;
import java.util.Objects;

public class Usuarios{

	private String nome;
	private Date data;

	//private DateFormat df = DateFormat.
	
	public Usuarios(String nome, Date data) {
		this.nome = nome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(nome, other.nome);
	}

	
}
