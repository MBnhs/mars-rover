package br.com.marcelo.marsrover.rover;

public interface Direcao {
	Direcao viraADireita();
	Direcao viraAEsquerda();
	TipoDirecao getTipoDirecao();
	void movimenta(Coordenada coordenada);
}
