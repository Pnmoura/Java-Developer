package Aula62;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println(soma(1, 2)); // IMPRIMINDO NO CONSOLE O VALOR DE 1 + 2
		System.out.println(soma(1, 2, 3)); // IMPRIMINDO NO CONSOLE O VALOR DE 1 + 2 + 3

		int[] vetor = { 1, 2, 3, 4, 5 }; 
		System.out.println(soma(vetor)); // IMPRIMINDO NO CONSOLE O VALOR DE 1 + 2 + 3 + 4 + 5 
		
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // IMPRIMINDO NO CONSOLE O VALOR DE 1 + 2 + 3.... + 10
	}
	//Solicitando o retorno de informações da soma
	static int soma(int a, int b) {
		return a + b;
	}

	static int soma(int a, int b, int c) {
		return a + b + c;
	}
	
	static int soma(int[] vetor) {

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i]; //Soma do vetor + 1
		}
		return total; //Imprimindo no console o resultado de todos os valores salvos
	}

	//VarArgs
	static int soma(int a, int b, Integer... vetor) {

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
}
