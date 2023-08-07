package pricipal;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in);
	
	int numero = 0;
	
	System.out.println("Digite um número: ");	
	numero = leia.nextInt();
	
	if (numero %2 == 0){
		System.out.println(numero + " é par");
	}else {
		System.out.println(numero + " é impar");
	}
			
		
		
		
		
		
	}

}
