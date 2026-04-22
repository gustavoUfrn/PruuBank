package pruuBank;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta, saldo, cliente);
	}
	
	@Override
	public boolean sacar(double valor) {
		if(this.getSaldo() < valor) {
			System.out.println("Você não tem saldo suficiente para está operação!");
			return false;
		} else {
			double total = this.getSaldo() - valor;
			this.setSaldo(total);
			return true;
		}
	}
	
	@Override
	public boolean transferir() {
		return true;
	}
}
