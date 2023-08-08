package principal;

import java.util.Scanner;

public class EstruturasDeRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		/*
		 * Uma estrutura de repetição
		 * repete determinado bloco de codigo enquanto
		 * uma condição seja satisfeita;
		 */
			//for = até
			// a quantidade de vezes que será necessário repetir 

	/*for(int contador = 0; contador  < 10; contador++ ) {
		System.out.println("Contador está valendo" + contador );
	}
		
		/* while = enquanto
		 * geralmente usado quando não sabemos a quantidade de
		 * vezes que será executado determinado comando
		 */
	
		int contador2 = 0;
		char opcao;
		
	System.out.println("Deseja entrar no loop? (s/n)");
		
		opcao = leia.next().charAt(0);
		
		while(opcao == 's' ) {
			System.out.println("Contador valendo : " + contador2);
			contador2++;	
			System.out.println("Deseja continuar no loop/ s/n");
			opcao = leia.next().charAt(0);
		}
			
		  /* do while
		   * executa pelo menos 1 vez, temos a garantia de que será                                        
		   * executado ao menos uma vez
		   */
		                  
		
	do {	
		System.out.println("Contador valendo :" + contador2);
		System.out.println("Deseja continuar no loop/ (s/n)" + contador2);
		opcao = leia.next().charAt(0);
	}while(opcao == 's');
		
		
		
		


leia.close();
	}

}
