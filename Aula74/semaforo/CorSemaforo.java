package Aula74.semaforo;

public enum CorSemaforo {
	
	VERDE(1000), AMARELO(300), VERMELHO(1000);
	
	private int tempoEspera;
	
	private CorSemaforo(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}

	public void setTempoEspera(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}
}
