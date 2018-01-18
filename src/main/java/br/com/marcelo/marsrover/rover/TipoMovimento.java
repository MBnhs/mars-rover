package br.com.marcelo.marsrover.rover;

public enum TipoMovimento {

	POSITIVO(1), NEGATIVO(-1);

	private int valor;

	private TipoMovimento(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}
