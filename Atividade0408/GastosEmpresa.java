package principal;

import java.util.Scanner;

public class GastosEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double Gastos1 = 0;
		double Gastos2 = 0;
		double Gastos3 = 0;
		double media = 0;
		double resultadototal = 0;
		
		//
		
		System.out.println("Digite os gastos do 1 m�s : ");
		Gastos1 = leia.nextDouble();
		
		System.out.println("Digite os gastos do 2 m�s : ");
		Gastos2 = leia.nextDouble();
		
		System.out.println("Digite os gastos do 3 m�s : ");
		Gastos3 = leia.nextDouble();
		
		resultadototal = (Gastos1 + Gastos2 + Gastos3);
		 
		System.out.println("O gasto total do m�s foi : " + resultadototal);
		
		media = (Gastos1 + Gastos2 + Gastos3)/3 ;
		
		System.out.println("A m�dia de gastos foi : " + media);
		
		
		
		
	leia.close();	
	}

}
