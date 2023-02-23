package entidades;

public class Alunos implements Comparable<Alunos>{
	
	private Integer codigo;
	
	public Alunos(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public int compareTo(Alunos a) {
		return codigo.compareTo(a.getCodigo());
	}
}