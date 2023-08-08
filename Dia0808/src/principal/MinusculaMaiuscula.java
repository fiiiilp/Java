package principal;

import java.util.Scanner;

public class MinusculaMaiuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
	char sexo;	
		
	System.out.println("Digite seu sexo (m/f)");	
		
	sexo = leia.next().charAt(0);
		
	if(Character.toLowerCase (sexo)== 'm') {
		System.out.println("O sexo digitado foi " + sexo);
			
		
		
	}else {
		System.out.println("O sexo digitado foi " + sexo);
	}

}}
