package Aula63;

public class ExemploPrintf {
	
	public static void main (String[] args) {
		
		//System.out.printf("Hello %s", "Olá, Mundo!");
		System.out.printf("%s", "Olá, Mundo!"); //s = formatação normal conforme foi escrita pelo Desenvolvedor
		System.out.println();
		System.out.printf("%S", "Olá, Mundo!"); //S = passa todas as informações em caixa alta
		System.out.println();
		
		System.out.printf("%c", 'c'); //Reproduz no console tudo com caracter minusculo
		System.out.println();
		System.out.printf("%C", 'c'); //Reproduz no console tudo com caracter maiusculo
		
		System.out.printf("%n"); //pula linha/nova linha
		
		int valor = 123456789;
		System.out.printf("%d", valor); // '%d' Formata os numeros para exibição no consoles
		
		System.out.println();
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante); //'%f' para saida de ponto flutuante
		
		System.out.println();
	}
}
