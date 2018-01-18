package br.com.marcelo.marsrover.rover;

public class East implements Direcao {

	public Direcao viraADireita() {
		return new South();
	}

	public Direcao viraAEsquerda() {
		return new North();
	}

	public TipoDirecao getTipoDirecao() {
		return TipoDirecao.E;
	}

}