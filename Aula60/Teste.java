package Aula60;

public class Teste {

	public static void main(String[] args) {
		
		EscopoVariaveis escopo = new EscopoVariaveis(); //Instanciando
		escopo.setValor(10); //Setando o valor
		
		System.out.println(escopo.getValor()); //output do valor na tela -> 10
		
		System.out.println(escopo.calculaValor(20)); //Calcula o valor -> 10 + 20
		
		System.out.println(escopo.getValor()); //Repete o valor 10
		
		System.out.println(escopo.teste());
		
		System.out.println(escopo.getValor());
		
	}

}
