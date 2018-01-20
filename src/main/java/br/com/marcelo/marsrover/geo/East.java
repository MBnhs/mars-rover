package br.com.marcelo.marsrover.geo;

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

	public void movimenta(Coordenada coordenada) {
		coordenada.moveEixoX(TipoMovimento.POSITIVO);
	}

}
