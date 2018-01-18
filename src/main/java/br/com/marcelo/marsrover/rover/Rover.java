package br.com.marcelo.marsrover.rover;

public class Rover {

	private Coordenada coordenada;
	private Direcao direcao;
	private Planalto planalto;

	public Rover(Coordenada coordenada, Direcao direcao, Planalto planalto) {
		this.coordenada = coordenada;
		this.direcao = direcao;
		this.planalto = planalto;
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
//		planalto.isMovimentacaoPossivel(coordenada);
		direcao.movimenta(coordenada);

	}
}
