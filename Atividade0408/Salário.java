package principal;

import java.util.Scanner;

public class Salário {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double DinheiroPorHora=0;
		double HorasTrabalhadas=0;
		double resultado = 0;
		double divisao = DinheiroPorHora / HorasTrabalhadas;
		double multiplicacao = DinheiroPorHora * HorasTrabalhadas;
		//
		//
		System.out.println("Quanto você ganha por hora? " );
		DinheiroPorHora = leia.nextDouble();
		//
		System.out.println("Quantas horas você trabalha por mês? " );
		HorasTrabalhadas = leia.nextDouble();
		//
		resultado = (DinheiroPorHora * HorasTrabalhadas)30;
		//
		//
		System.out.println("Seu salário é : " + resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
		
	}

}
