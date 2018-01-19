package br.com.marcelo.marsrover.rover;

import br.com.marcelo.marsrover.exception.ColisaoException;
import br.com.marcelo.marsrover.exception.ForaDaMalhaException;

public interface Mediador {
	void envia(Coordenada atual, Mediado mediado) throws ColisaoException, ForaDaMalhaException;
	void envia(Coordenada atual, Coordenada proxima, Mediado mediado) throws ColisaoException, ForaDaMalhaException;
}
