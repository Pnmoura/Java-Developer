package Aula60;

public class EscopoVariaveis {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor) {
		/*
		 * Daqui sairá o output do valor estimado + 10 conforme foi declarado mais
		 * abaixo
		 * 
		 * 
		 * TODO valor declarado aqui seguira a sequencia de leitura | V
		 * 
		 * Explicação.:
		 * 
		 * Pegará o 'valor' + 10 = 30 -> -10 = 20 -> *2 = 40
		 * 
		 * Todo o resultado aqui informado será apresentado ao executar o programa
		 * Teste.java
		 */

		valor = valor + 10;
		valor = valor - 10;
		valor = valor * 2;

		return valor;
	}

	public int teste() { // Variavel local

		int valor = 5;

		if (true) {

			valor--;

			/*
			 * Pega o valor '5' (int) subtrai (valor--)
			 *
			 * o que resulta em 5 - 1 = 4
			 */
		}

		// this.valor = valor; //referencial valor global/atributo da classe
		/*
		 * Caso esta linha 'this.valor' seja descomentada a mesma receberá o valor do
		 * int acima declarado, exibindo no console o resultador de 4, pois:
		 * 
		 * Calculará o valor de 5 + (valor--) = 5 - 1 = 4
		 * 
		 * Passará a printar o valor de 'this'(objeto atual) que sera 4
		 */

		return valor;
		/*
		 * Após a impressão do valor 4 do if declarado acima o mesmo retorna o valor
		 * declarado em 'escopo.setValor(10)' que sen encontra na classe Teste.java
		 */
	}

	public void outroTeste() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// i++; //erro de compilação

		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j);
		}

		System.out.println(j); // j tem valor 10
	}

	public void maiUmTeste() {

		boolean flag = true;

		if (flag) {

			int umaVariavel = 10;

			umaVariavel++;

			System.out.println(umaVariavel);
		}

		// System.out.println(umaVariavel); //erro de compilação
	}

	public void maiUmOutroTeste(int num) {

		int total = 0;

		try {
			int outroNum = 0;

			total = num / outroNum;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			total++;
			// outroNum++; //erro de compilação
			// e.printStackTrace(); //erro de compilação
		}

		num++;

		// outroNum++; //erro de compilação
		// e.printStackTrace(); //erro de compilação
	}

}
