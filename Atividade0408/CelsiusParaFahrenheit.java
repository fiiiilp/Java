package principal;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		double Celsius =0 ;
		double Fahrenheit =0;
		double resultado =0;
		
		System.out.println("Digite a temperatura em graus Celsius");
		Celsius = leia.nextDouble();
		
		
		resultado = (Celsius * 9/5)+32;
		
		
		System.out.println("A temperatura em Fahrenheit é: " + resultado);
		
		
		
		
		
		
		
		leia.close();
	}

}
