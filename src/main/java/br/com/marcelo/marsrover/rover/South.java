package br.com.marcelo.marsrover.rover;

public class South implements Direcao {

	public Direcao viraADireita() {
		return new West();
	}

	public Direcao viraAEsquerda() {
		return new East();
	}

	public TipoDirecao getTipoDirecao() {
		return TipoDirecao.S;
	}

}
