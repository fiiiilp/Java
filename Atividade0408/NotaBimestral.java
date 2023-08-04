package principal;

import java.util.Scanner;

public class NotaBimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia= new Scanner(System.in);
		
		double nota1 = 0 ;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double resultado = 0;
		//
		System.out.println("Digite sua nota do 1 bimestre : " );
		nota1 = leia.nextDouble();
		System.out.println("Digite sua nota do 2 bimestre : " );
		nota2 = leia.nextDouble();
		System.out.println("Digite sua nota do 3 bimestre : " );
		nota3 = leia.nextDouble();
		System.out.println("Digite sua nota do 4 bimestre : " );
		nota4 = leia.nextDouble();
		
		resultado = (nota1 + nota2 + nota3 + nota4 )/ 4;
		
		
		System.out.println("A sua média é: " + resultado);
		
		
		
		
		
		
		
		
		
		
		leia.close();
		
	}

}
