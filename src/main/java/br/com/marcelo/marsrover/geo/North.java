package br.com.marcelo.marsrover.geo;

public class North implements Direcao {

	public Direcao viraADireita() {
		return new East();

	}

	public Direcao viraAEsquerda() {
		return new West();
	}

	public TipoDirecao getTipoDirecao() {
		return TipoDirecao.N;
	}

	public void movimenta(Coordenada coordenada) {
		coordenada.moveEixoY(TipoMovimento.POSITIVO);
	}

}
