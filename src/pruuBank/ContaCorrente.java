package pruuBank;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta, saldo, cliente);
	}
	
	@Override
	public double sacar() {
		
		return 0;
	}
	
	@Override
	public double transferir() {
		return 0;
	}
}
