package principal;

import java.util.Scanner;

public class Sal�rio {

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
		System.out.println("Quanto voc� ganha por hora? " );
		DinheiroPorHora = leia.nextDouble();
		//
		System.out.println("Quantas horas voc� trabalha por m�s? " );
		HorasTrabalhadas = leia.nextDouble();
		//
		resultado = (DinheiroPorHora * HorasTrabalhadas)30;
		//
		//
		System.out.println("Seu sal�rio � : " + resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
		
	}

}
