package pruuBank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Conta> listaDeContas = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		Conta conta;
		
		int idConta = 101, sair = 999;
		double dnum;
		
		while(sair != 7) {
			//Menu default
			System.out.println("------------------------------------------------------------");
			System.out.println("Escolha uma de nossas operaçõesPruu!!");
			System.out.println("1 - Criar sua contaPruu!");
			System.out.println("2 - Fazer um depositoPruu!");
			System.out.println("3 - Fazer um saquePruu!");
			System.out.println("4 - Fazer uma transferenciaPruu!");
			System.out.println("7 - Sair");
			System.out.println("------------------------------------------------------------");
			
			sair = scanner.nextInt();
			scanner.nextLine();
			
			switch(sair) {
			  case 1:
				  System.out.println("Digite seu nomePruu!!");
				  String nome = scanner.nextLine();
				  Cliente cliente = new Cliente(nome);
				  
				  System.out.println("Escolha o tipo da sua contaPruu!!");
				  System.out.println("1 - Conta poupançaPruu!!");
				  System.out.println("2 - Conta correntePruu!!");
				  System.out.println("Outros números são invalidos!!");
				  
				  int num = scanner.nextInt();
				  scanner.nextLine();
				  
				  if(num==1){
					  
					  ContaPoupanca contaPoupanca = new ContaPoupanca(idConta, 0.0, cliente);
					  listaDeContas.add(contaPoupanca);
					  
					  System.out.println("------------------------------------------------------------");
					  System.out.println("Obrigado por escolher PruuBank! Sua conta poupançaPruu foi criada!!");
					  System.out.println("------------------------------------------------------------");
				  } else if(num==2) {
					  
					  ContaCorrente contaCorrente = new ContaCorrente(idConta, 0.0, cliente);
					  listaDeContas.add(contaCorrente);
					  
					  System.out.println("------------------------------------------------------------");
					  System.out.println("Obrigado por escolher PruuBank! Sua conta corretePruu foi criada!!");
					  System.out.println("------------------------------------------------------------");
				  } else {
					  
					  System.out.println("------------------------------------------------------------");
					  System.out.println("Número inválido redirecionando para tela de operaçõesPruu!!");
					  System.out.println("------------------------------------------------------------");
					  break;
				  }
				  
				  idConta++;
				  break;
				  
			  case 2:
				  
				  System.out.println("Digite o número da conta para depositoPruu!!");
				  num = scanner.nextInt();
				  scanner.nextLine();
				  
				  conta = buscarIdConta(listaDeContas, num);
				  
				  if(conta != null) {
					  System.out.println("Digite o valor de um depositoPruu!!");
					  
					  dnum = scanner.nextDouble();
					  scanner.nextLine();
					  
					  conta.depositar(dnum);
				  }
				  break;
				  
			  case 3:
				  
				  System.out.println("Digite o número da conta para saquePruu!!");
				  num = scanner.nextInt();
				  scanner.nextLine();
				  
				  conta = buscarIdConta(listaDeContas, num);
				  
				  if(conta != null) {
					  System.out.println("Digite o número do valor do saquePruu!!");
					  dnum = scanner.nextDouble();
					  scanner.nextLine();
						    
					  conta.sacar(dnum);
				  }
				  break;
				  
			  case 4: 
				  
			  case 7:
			    scanner.close();
			    break;
			}
		}
	}
	
	public static Conta buscarIdConta(ArrayList<Conta> lista, int numeroConta) {
		for (Conta c : lista) {
			if(c.getNumeroConta() == numeroConta) {
				return c;
			}
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Não encontramos uma conta conrrespondente!!");
		System.out.println("------------------------------------------------------------");
		
		return null;
	}
}















