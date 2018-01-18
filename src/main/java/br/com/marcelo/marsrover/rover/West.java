package br.com.marcelo.marsrover.rover;

public class West implements Direcao {

	public Direcao viraADireita() {
		return new North();
	}

	public Direcao viraAEsquerda() {
		return new South();
	}

	public TipoDirecao getTipoDirecao() {
		return TipoDirecao.W;
	}

	public void movimenta(Coordenada coordenada) {
		coordenada.moveEixoX(TipoMovimento.NEGATIVO);
	}

}
