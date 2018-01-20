package br.com.marcelo.marsrover.rover;

import br.com.marcelo.marsrover.exception.ColisaoException;
import br.com.marcelo.marsrover.exception.ForaDaMalhaException;
import br.com.marcelo.marsrover.geo.Coordenada;

public abstract class Mediado {

	private Mediador mediador;

	public Mediado(Mediador mediador) {
		this.mediador = mediador;
	}

	abstract void recebe(Coordenada coordenada) throws ColisaoException, ForaDaMalhaException;
	abstract void recebe(Coordenada atual, Coordenada proxima) throws ColisaoException, ForaDaMalhaException;

	public void envia(Coordenada coordenada) throws ColisaoException, ForaDaMalhaException {
		mediador.envia(coordenada, this);
	}

}
