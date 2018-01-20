package br.com.marcelo.marsrover.geo;

public interface Direcao {
	Direcao viraADireita();
	Direcao viraAEsquerda();
	TipoDirecao getTipoDirecao();
	void movimenta(Coordenada coordenada);
}
