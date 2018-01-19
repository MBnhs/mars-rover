package br.com.marcelo.marsrover.rover;

public class Rover extends Mediado {

	private Coordenada coordenada;
	private Direcao direcao;

	public Rover(Coordenada coordenada, Direcao direcao, Mediador mediador) {
		super(mediador);
		this.coordenada = coordenada;
		this.direcao = direcao;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public String getPosicao() {
		StringBuilder sb = new StringBuilder();
		sb.append(coordenada);
		sb.append(" ");
		sb.append(direcao.getTipoDirecao());

		return sb.toString();
	}

	public void viraADireita() {
		direcao = direcao.viraADireita();
	}

	public void viraAEsquerda() {
		direcao = direcao.viraAEsquerda();
	}

	public void moveAFrente() {
		direcao.movimenta(coordenada);

	}

	@Override
	void recebe(Coordenada coordenada) {
		return;
	}

	@Override
	void recebe(Coordenada atual, Coordenada proxima) {
		return;		
	}
}
