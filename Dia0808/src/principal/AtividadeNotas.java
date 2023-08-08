package principal;

import java.util.Scanner;

public class AtividadeNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
	int nota;	
	int contador;
		
		System.out.println("Digite sua nota");
		nota = leia.nextInt();
		
		
		
		while (nota>10 || nota<0) {
			System.out.println("Digite um numero de 0 a 10" );
			
		}
		
		


		
	}

}
