package pricipal;

import java.util.Scanner;

public class anoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int ano;
		System.out.println("Digite um ano para saber se � bissexto ou n�o");
		ano = ent.nextInt();
		// se o ano for maior que 400
		if(ano % 400 == 000) {
			System.out.println(ano + " � bissexto" );
		}else if((ano % 4 == 0)&& (ano % 100  !=0)) {
			System.out.println(ano + " � bissexto");
		}else {
			System.out.println(ano + " N�o � bissexto");
		}
		
		
		
		
		
		
		
		
		
	}

}
