package pruuBank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Conta> listaDeContas = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		int idConta = 101;
		int sair = 999;
		
		while(sair != 7) {
			
			//Menu default
			System.out.println("------------------------------------------------------------");
			System.out.println("Escolha uma de nossas operaçõesPruu!!");
			System.out.println("1 - Criar sua contaPruu!");
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
					  System.out.println("Redirecionando para tela de operaçõesPruu!!");
					  System.out.println("------------------------------------------------------------");
					  break;
				  }
				  idConta++;
				  break;
			  case 7:
			    scanner.close();
			    break;
			  default:
			    
			}
		}
	}

}
