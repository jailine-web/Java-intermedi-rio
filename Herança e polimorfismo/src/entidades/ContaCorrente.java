package entidades;

public class ContaCorrente extends Conta {

	private Double loanLimit;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, loanLimit);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
}
