package resolucaoExercicio;

public class Conta {

	private int numeroConta;
	private String titular;
	private Double saldo; 
	private Double limite;
	
	public Conta(int numeroConta, String titular, Double saldo, Double limite) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public void depositar(Double valor) {
		saldo += valor;
		System.out.println(saldo);
	}
	
	public void sacar(Double valor) {
		if (saldo < valor) {
			System.out.println("Não há saldo suficiente! ");
		}
		else if(valor > limite) {
			System.out.println("O valor requerido é superior ao limite de saque!");
		}
		else {
			saldo -= valor;
			System.out.println("Saldo atual: "+ saldo);
			
		}
	}
}
