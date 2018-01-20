package br.com.marcelo.marsrover.geo;

public enum TipoDirecao {

	N(new North()), E(new East()), S(new South()), W(new West());

	private Direcao direcao;

	private TipoDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	public Direcao getDirecao() {
		return direcao;
	}

}
