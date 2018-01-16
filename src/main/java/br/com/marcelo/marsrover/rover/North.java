package br.com.marcelo.marsrover.rover;

public class North implements Direcao {

	private TipoDirecao tipoDirecao = TipoDirecao.N;

	public Direcao viraADireita() {
		return new East();

	}

	public Direcao viraAEsquerda() {
		return new West();
	}
	
	public TipoDirecao getTipoDirecao() {
		return tipoDirecao;
	}

}
