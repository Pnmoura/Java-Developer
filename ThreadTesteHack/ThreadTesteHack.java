package ThreadTesteHack;

public class ThreadTesteHack extends Thread {

	private String nome;
	private int tempo;

	public ThreadTesteHack(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	// Metodo Run - Da inicio a execução da Thread
	public void run() {
		try {
			for (int i = 0; i <110; i+=10) {
				System.out.println(nome + " " + i + "%"); //'nome' é definido na classe 'Teste.java'
				Thread.sleep(tempo); // contagem feita em milisegundos
			}
		} catch (InterruptedException e) { //Interrompendo a thread
			e.printStackTrace(); //informando caso tenha algum problema dentro do seu try ele vai para o catch
		}
		
		System.out.println();
		System.out.println("††††††††††††††††††††††††††††† Voce foi invadido †††††††††††††††††††††††††††††");
		//Informa qual e quando finaliza a execução da Thread 
	}

}
