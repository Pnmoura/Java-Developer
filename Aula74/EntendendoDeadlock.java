package Aula74;

public class EntendendoDeadlock {

	public static void main(String[] args) {
		
		/*
		 * Deadlock
		 * 
		 * Quando um recurso tenta acessar o outro,
		 * porem no caminho ambos se encontram em uma 
		 * zona de conflito e isso impede os acesso a ambos os recursos
		 */		

		final String RECURSO1 = "Recurso #1";
		final String RECURSO2 = "Recurso #2";

		Thread t1 = new Thread () {
			public void run() {
				synchronized (RECURSO1) {
					//System.out.println("Thread #1 bloqueou o recurso 1");
					System.out.println("Caminhao1 bloqueando acesso a #RUA1");
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					//System.out.println("Thread #1 tentando acesso ao recurso 2");
					System.out.println("Caminhao1 tentando acesso a #RUA2");
					
					synchronized (RECURSO2) {
						//System.out.println("Thread #1 bloqueou o recurso 2");
						System.out.println("Caminhao1 bloqueou o acesso do Caminhao2");
					}
				}
			}
		};
		
		Thread t2 = new Thread () {
			public void run() {
				synchronized (RECURSO2) {
					//System.out.println("Thread #1 bloqueou o recurso 2");
					System.out.println("Caminhao2 bloqueando o acesso a #RUA2");
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					//System.out.println("Thread #2 tentando acesso ao recurso 1");
					System.out.println("Caminhao2 tentando acessar #RUA1");
					
					synchronized (RECURSO1) {
						//System.out.println("Thread #2 bloqueou o recurso 2");
						System.out.println("Caminhao2 bloqueou o acesso a #RUA2");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
