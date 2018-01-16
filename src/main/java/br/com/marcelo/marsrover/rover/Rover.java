package br.com.marcelo.marsrover.rover;

public class Rover {

	private Coordenada coordenada;
	private Direcao direcao;

	public Rover(Coordenada coordenada, Direcao direcao) {
		this.coordenada = coordenada;
		this.direcao = direcao;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	public String getPosicao() {
		StringBuilder sb = new StringBuilder();
		sb.append(coordenada);
		sb.append(" ");
		sb.append(direcao.getTipoDirecao());

		return sb.toString();
	}

}
