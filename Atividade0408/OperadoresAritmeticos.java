package principal;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * operador "+" para soma
		 * operador "-" para subtra��o 
		 * operador "*" para multiplica��o
		 * operador "/" para divis�o
		 * operador "%" para o resto da divis�o.
		 *
		 */
			int numero1 = 10;
			int numero2 = 10;
			int soma = numero1 + numero2;
			int divisao = numero1 / numero2;
			int subtracao = numero1 - numero2;
			int multiplicacao = numero1 * numero2;
			int restoDaDivisao = numero1 % numero2;
			
			
			
			
			System.out.println("Resultado1 :" + soma);
			System.out.println("Resultado2 :" + divisao);
			System.out.println("Resultado 3 :" + subtracao);
			System.out.println("Resultado 4 :" +  multiplicacao);
			System.out.println("Resultado 5 :" + restoDaDivisao);
		
	}

}
