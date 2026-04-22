package pruuBank;

public abstract class Conta {
	
	private String numeroConta;
	private double saldo;
	private Cliente cliente;
	
	public Conta(String numeroConta, double saldo, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public abstract boolean sacar(double valor);
	public abstract boolean transferir();
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
}
