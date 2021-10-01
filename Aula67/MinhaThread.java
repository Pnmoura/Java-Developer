package Aula67;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	// Metodo Run - Da inicio a execução da Thread
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i); //'nome' é definido na classe 'Teste.java'
				Thread.sleep(tempo); // contagem feita em milisegundos
			}
		} catch (InterruptedException e) { //Interrompendo a thread
			e.printStackTrace(); //informando caso tenha algum problema dentro do seu try ele vai para o catch
		}
		
		System.out.println(nome + "terminou a execução");
		//Informa qual e quando finaliza a execução da Thread 
	}

}
