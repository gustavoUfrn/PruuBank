package pruuBank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Conta> listaDeContas = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		int idConta = 101, sair = 999;
		boolean achou;
		double dnum;
		
		while(sair != 7) {
			//Menu default
			achou = false;
			System.out.println("------------------------------------------------------------");
			System.out.println("Escolha uma de nossas operaçõesPruu!!");
			System.out.println("1 - Criar sua contaPruu!");
			System.out.println("2 - Fazer um depositoPruu!");
			System.out.println("3 - Fazer um saquePruu!");
			System.out.println("7 - Sair");
			System.out.println("------------------------------------------------------------");
			
			sair = scanner.nextInt();
			scanner.nextLine();
			
			switch(sair) {
			  case 1:
				  //Nome do cliente
				  System.out.println("Digite seu nomePruu!!");
				  String nome = scanner.nextLine();
				  Cliente cliente = new Cliente(nome);
				  
				  //Tipo da conta
				  System.out.println("Escolha o tipo da sua contaPruu!!");
				  System.out.println("1 - Conta poupançaPruu!!");
				  System.out.println("2 - Conta correntePruu!!");
				  System.out.println("Outros números são invalidos!!");
				  
				  int num = scanner.nextInt();
				  scanner.nextLine();
				  
				  //Criando a conta
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
				  
				  for(Conta c : listaDeContas) {
					  if(c.getNumeroConta() == num) {
				
						 System.out.println("Digite o número do valor do depositoPruu!!");
						 dnum = scanner.nextDouble();
						 scanner.nextLine();
						 
						 c.depositar(dnum);
						 System.out.println("O deposito foi um sucesso!!");
						 achou = true;
					  }
				  }
				  
				  if(achou) {
					  break;
				  } else {
					  System.out.println("------------------------------------------------------------");
					  System.out.println("Não encontramos uma conta conrrespondente!!");
					  System.out.println("------------------------------------------------------------");
				  }
				  break;
				  
			  case 3:
				  System.out.println("Digite o número da conta para saquePruu!!");
				  num = scanner.nextInt();
				  scanner.nextLine();
				  
				  for(Conta c : listaDeContas) {
					  if(c.getNumeroConta() == num) {
						  System.out.println("Digite o número do valor do saquePruu!!");
						  dnum = scanner.nextDouble();
						  scanner.nextLine();
						  
						  c.sacar(dnum);
						  achou = true;
					  }
				  }
				  
				  if(achou) {
					  break;
				  } else {
					  System.out.println("------------------------------------------------------------");
					  System.out.println("Não encontramos uma conta conrrespondente!!");
					  System.out.println("------------------------------------------------------------");
				  }
				  break;
				  
			  case 7:
			    scanner.close();
			    break;
			  default:
			    
			}
		}
	}

}
