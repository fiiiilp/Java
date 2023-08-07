package pricipal;

import java.util.Scanner;

public class TresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
int n1 = 0;
int n2 = 0;
int n3 = 0;

// 
System.out.println("Digite o 1 número");
n1 = leia.nextInt();	
System.out.println("Digite o 2 número");
n2 = leia.nextInt();		
System.out.println("Digite o 3 número");
n3 = leia.nextInt();

if ( n1>n2 && n2>n3) {
	System.out.println(n1 + "é o maior");
	System.out.println(n3 + "é o menor");
}else if ( n1 > n3 && n3> n2) {
	System.out.println(n1 + "é o maior");
	System.out.println(n2 + "é o menor");
}else if ( n2 > n1 && n1> n3) {
	System.out.println(n2 + "é o maior");
	System.out.println(n3 + "é o menor");
	
}else if ( n2 > n3 && n3> n1) {
	System.out.println(n2 + "é o maior");
	System.out.println(n1 + "é o menor");
}else if (n3 > n1 && n1> n2) {
	System.out.println(n3 + "é o maior");
	System.out.println(n2 + "é o menor");
}else if ( n3 > n2 && n2> n1) {
	System.out.println(n3 + "é o maior");
	System.out.println(n1 + "é o menor");
}

		
		
		
		
	}

}
