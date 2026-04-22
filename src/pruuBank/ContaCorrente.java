package pruuBank;

public class ContaCorrente extends Conta implements ITributavel {
	
	public ContaCorrente(String numeroConta, double saldo, Cliente cliente) {
		super(numeroConta, saldo, cliente);
	}
	
	@Override
	public double calcularTributos(){
		return this.saldo * 0.01;
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorComtaxa = valor * 1.05;
		
		if(this.saldo < valorComtaxa) {
			System.out.println("Você não tem saldo suficiente para está operação!");
			return false;
		} else {
			double total = this.saldo  - valorComtaxa;
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