package Aula72;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExecutando) {

		if (!estaExecutando) { // esta executando tique?
			tique = true; // true(sim) false(não)
//			notify(); // caso não esteja executando, ira notificar a 2ª thread
			return;
		}

		System.out.print("Tique ");

		tique = true; // Executou o 'tique'?

//		notify(); // sim -> Notifica a 2ª thread para exibir o 'taque'

		try {
			while (tique) { // while = enquanto
				wait();
				/*
				 * wait = também faz com que a thread atual pare de executar, porém sem um tempo
				 * determinado.
				 * 
				 * A execução continua quando outra thread chama o método notify no mesmo
				 * objeto, ou seja, a thread pausada é notificada que pode continuar.
				 */
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void taque(boolean estaExecutando) {

		if (!estaExecutando) { // esta executando tique?
			tique = false; // true(sim) false(não)
			notify(); // caso não esteja executando, ira notificar a 2ª thread
			return;
		}

		System.out.println("Taque ");

		tique = false; // Executou o 'tique'?

		notify(); // sim -> Notifica a 2ª thread para exibir o 'taque'

		try {
			while (!tique) { // !while = enquanto não for (intancia)
				wait();
				/*
				 * wait = também faz com que a thread atual pare de executar, porém sem um tempo
				 * determinado.
				 * 
				 * A execução continua quando outra thread chama o método notify no mesmo
				 * objeto, ou seja, a thread pausada é notificada que pode continuar.
				 */
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
