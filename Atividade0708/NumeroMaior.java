package pricipal;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
	int numero1 =0;	
	int numero2 =0;
	
	//
	System.out.println("Digite um número: ");
	numero1 = leia.nextInt();
	//
	System.out.println("Digite o segundo número: ");
	numero2 = leia.nextInt();
	
	if(numero1 > numero2) {
		System.out.println(numero1 + " é maior");
	}else {
		System.out.println(numero1 + " é menor");
	}
		
		
		
		
	}

}
