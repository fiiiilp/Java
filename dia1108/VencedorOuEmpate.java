package dia1108;

import java.util.Scanner;

public class VencedorOuEmpate {

	public static void main(String[] args) {
		//  Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
	//	do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		
		// scanner para leitura de dados
Scanner sc = new Scanner(System.in);
	// variaveis

	String time1;
	String time2;
	int gols1; 
	int gols2;
	// pedir nome dos times ; 
	System.out.println("Digite o nome do 1 time: ");
	time1 = sc.nextLine();
	System.out.println("Digite  o nome do 2 time: ");
	time2 = sc.nextLine();
	// digite a quantidade de gols;
	System.out.println("Digite a quantidade de gols do 1 time: ");
	gols1 = sc.nextInt();	
	System.out.println("Digite a quantidade de gols do 2 time: ");
	gols2 = sc.nextInt();
	//
	// if e else if ;
	if(gols1 > gols2) {
		System.out.println(time1 + " Ganhou");
	}else if (gols2 > gols1) {
		System.out.println(time2 + " Ganhou");
	}else if (gols1 == gols2) {
		System.out.println("Empate");
	}
	
	
	sc.close();
	}

}
