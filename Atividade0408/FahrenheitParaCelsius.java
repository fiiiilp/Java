package principal;

import java.util.Scanner;

public class GrausCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner leia = new Scanner(System.in);
	double Celsius =0;	
	double Fahrenheit =0;
	double resultado =0;
		
	
	//
	System.out.println("Digite a temperatura em Fahrenheit : ");
	Fahrenheit = leia.nextDouble();
		
		
	
		
	resultado = (Fahrenheit - 32) *5/9;
		
	System.out.println("A temperatura em graus Celsius é: " + resultado);	
		
		
	leia.close();
	}

}
