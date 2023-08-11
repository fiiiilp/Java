package dia1108;

import java.util.Scanner;

public class PostoDeGasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner para leitura de dados; // 
Scanner sc = new Scanner(System.in);
 // criar variaveis de preço; //
	double valorAPagar =0;	
	double precoA = 3.90 ;
	double precoG = 5.80;
//criar variavel para litros;	
	double litros = 0;
	
	//variavel para receber o tipo de combustivel;//
	char tipocombustivel;
	
	// pedir para digitar a quantidade de litros;
	//  e qual o tipo do combustivel;
	
	// validação para que nao digite um combustivel inválido;
	
	do{
	System.out.println("Digite A para álcool ou G para gasolina: ");
	tipocombustivel = sc.next().charAt(0);
	
	}while(Character.toUpperCase(tipocombustivel) != 'A' && Character.toUpperCase(tipocombustivel) != 'G');
		
	tipocombustivel = Character.toLowerCase(tipocombustivel);
	// pedir a quantidade de litros que foram abastecidos ;
	// validar quantidade de litros ( nao pode ser 0 nem negativo);
	
	
do {
System.out.println("Digite a quantidade de litros abastecidos");
litros = sc.nextDouble();}
while(litros <= 0);
	
//fazer o calculo do desconto com base na quantidade de litros
//que foi abastecido , e o tipo do combustivel;
	
	if(tipocombustivel == 'G') {
		if(litros <=20 ) {
			valorAPagar = (litros * precoG);
			valorAPagar = valorAPagar -(valorAPagar * 0.04);
			System.out.println("Valor com desconto: " + valorAPagar);
 		}else {
 			valorAPagar = (litros * precoG);
			valorAPagar = valorAPagar -(valorAPagar * 0.06);
			System.out.println("Valor com desconto: " + valorAPagar);
 		}
	}
	if(tipocombustivel == 'A') {
		if(litros <=20 ) {
			valorAPagar = (litros * precoG);
			valorAPagar = valorAPagar -(valorAPagar * 0.03);
			System.out.println("Valor com desconto: " + valorAPagar);
 		}else {
 			valorAPagar = (litros * precoG);
			valorAPagar = valorAPagar -(valorAPagar * 0.05);
			System.out.println("Valor com desconto: " + valorAPagar);
 		}
	

sc.close();
	}
	}
}
