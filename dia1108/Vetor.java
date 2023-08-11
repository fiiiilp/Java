package dia1108;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		
		/* 
		 * UM VETOR DE 20 POSIÇÕES
		 * mostrar o numeros inseridos
		 * somar os numeros inseridos
		 */

		int [] numeros = new int[5];
		int soma 	 = 0;
		// i = iterador // mesmo que o contador;
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Entre com o numero: ");
			numeros[i] = sc.nextInt();
			while(numeros[i] < 0) {
				System.out.println("Numero inválido!");
				System.out.println("Entre com o numero: ");
				numeros[i] = sc.nextInt();
			}
			soma += numeros[i];
		}
		System.out.println("A soma dos numeros: "+ soma);
		
		System.out.println("Numeros digitados :");
		for(int numero : numeros) {
			System.out.println(numero);
		}
			
		
		
		
		
		
		
	
		
		
		sc.close();
	}

}
