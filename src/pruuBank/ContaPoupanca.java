package pruuBank;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta, saldo, cliente);
	}
	
	@Override
	public boolean sacar(double valor) {
		
		if(this.saldo < valor) {
			System.out.println("Você não tem saldo suficiente para está operação!");
			
			return false;
		} else {
			double total = this.saldo - valor;
			this.saldo = total;
			
			return true;
		}
	}
	
	@Override
	public boolean transferir(Conta contaDestino, double valor) {
	    if (this.sacar(valor)) {
	        contaDestino.depositar(valor);
	        return true;
	    }
	    return false;
	}
}
