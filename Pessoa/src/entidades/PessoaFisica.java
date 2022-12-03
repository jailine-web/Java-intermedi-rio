package entidades;

public class PessoaFisica extends Pessoa {

	private double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcularImposto() {

		double result = 0;

		if (getRendaAnual() < 20000.0) {
			result = getRendaAnual() * 0.15;
		}
		if (getRendaAnual() > 20000) {
			result = getRendaAnual() * 0.25;

			if (gastosSaude > 0) {
				result = (getRendaAnual() * 0.25) - (gastosSaude * 0.50);
			}
		}

		return result;
	}

	@Override
	public String toString() {
		return getNome() + ": $ " + String.format("%.2f", calcularImposto());
	}

}
