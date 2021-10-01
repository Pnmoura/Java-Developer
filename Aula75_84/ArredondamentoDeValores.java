package Aula75_84;

public class ArredondamentoDeValores {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 3)); //Elevação
		
		System.out.println(Math.round(4.7)); //Arredondamento para cima
		
		System.out.println(Math.round(4.4)); //Arredondamento para baixo
		
		System.out.println(Math.ceil(4.4)); //Arredondamento para o próximo número mais proximo 
		
		System.out.println(Math.ceil(4.7)); //Arredondamento para o próximo número mais proximo 
		
		System.out.println(Math.floor(4.4)); //Arredondamento para baixo
		
		System.out.println(Math.floor(4.7)); //Arredondamento para baixo
		
		System.out.println(Math.random()); //Gera números aleatorios
		
		System.out.println(Math.round(Math.random())); //Arredonda os números aleatorios gerados com 'Math.random'
		
		System.out.println(Math.round(Math.random() * 100)); //Gera um número multiplicado ATÉ o valor informado
		
		//Seno
		System.out.println(Math.sin(Math.toRadians(30))); //Neste exemplo a classe 'Math', exibe o valor do seno de 30°; porem vai dar o valor
		
		//Cosseno
		System.out.println(Math.cos(Math.toRadians(1))); //Neste exemplo ele pegará o valor do cosseno passar para (incluindo uma classe 'Math' dentro da outra)radiano e determinar o valor
		
		//Tangente
		System.out.println(Math.tan(Math.toRadians(45))); //Resultado deveria ser 1, porem vai jogar um valor aproximado
		
		
		
		
	}

}
