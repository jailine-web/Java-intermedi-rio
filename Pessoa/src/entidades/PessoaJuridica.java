package entidades;

public class PessoaJuridica extends Pessoa {

	private int numeroFuncionarios;
	double result = 0;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calcularImposto() {

		if (numeroFuncionarios > 10) {
			result = (getRendaAnual() * 0.14);

		}
		if (numeroFuncionarios <= 10) {
			result = (getRendaAnual() * 0.16);
		}
		return result;
	}

	@Override
	public String toString() {
		return getNome() + ": $ " + String.format("%.2f", calcularImposto());
	}

}
