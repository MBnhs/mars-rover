package br.com.marcelo.marsrover.rover;

public class Coordenada {

	public Coordenada(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	private Integer x;
	private Integer y;

	@Override
	public String toString() {
		return x + " " + y;
	}

}