package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura; 
		char sexo;
		
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite sua idade");
		idade = leia.nextInt();
		
		System.out.println("Digite sua altura");
		altura = leia.nextDouble();
		
		System.out.println("Qual o sexo (m/f)");
		sexo = leia.next().charAt(0);
		
		
		//leitura de dados tipo String ! (conjunto de caracteres)
		
		System.out.println("O nome digitado foi : " + nome);
		System.out.println("A idade digitada foi : " + idade);
		System.out.println("A altura digitada foi : " + altura);
		System.out.println("O sexo digitado foi :" + sexo);
		
			
	//	System.out.println("O nome digitado foi : " + nome);	
		//System.out.println("A idade digitada foi : " + idade);
		//System.out.println("A altura digitada foi : " + altura);
				
		
		
		
		
		
		leia.close();
		
		
		
		
		
		
		
	}

}
