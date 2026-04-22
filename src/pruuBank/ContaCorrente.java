package pruuBank;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta, saldo, cliente);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorComtaxa = valor * 1.05;
		
		if(this.getSaldo() < valorComtaxa) {
			System.out.println("Você não tem saldo suficiente para está operação!");
			return false;
		} else {
			double total = this.getSaldo() - valorComtaxa;
			this.setSaldo(total);
			return true;
		}
	}
	
	@Override
	public boolean transferir() {
		return true;
	}
}