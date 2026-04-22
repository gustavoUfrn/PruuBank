package pruuBank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Conta> listaDeContas = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		int idContas = 101;
		int sair = 999;
		
		while(sair != 7) {
			
			System.out.println("Escolha uma de nossas operaçõesPruu!!");
			System.out.println("1 - Criar sua contaPruu!");
			System.out.println("7 - Sair");
			
			sair = scanner.nextInt();
			
			switch(sair) {
			  case 1:
				  System.out.println("Digite seu PruuNome!!");
				  String nome = scanner.nextLine();
			    break;
			  case 7:
			    scanner.close();
			    break;
			  default:
			    
			}
		}
	}

}
