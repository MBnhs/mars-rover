package br.com.marcelo.marsrover.rover;

import java.util.ArrayList;
import java.util.List;

import br.com.marcelo.marsrover.exception.ColisaoException;
import br.com.marcelo.marsrover.exception.ForaDaMalhaException;
import br.com.marcelo.marsrover.geo.Coordenada;

public class Estacao implements Mediador {

	List<Mediado> mediados = new ArrayList<>();

	public void adicionaMediado(Mediado mediado) {
		mediados.add(mediado);
	}

	@Override
	public void envia(Coordenada coordenada, Mediado originador) throws ColisaoException, ForaDaMalhaException {
		for (Mediado mediado : mediados) {
			if (mediado.getClass() != originador.getClass()) {
				mediado.recebe(coordenada);
			}
		}

	}

	@Override
	public void envia(Coordenada atual, Coordenada proxima, Mediado originador) throws ColisaoException, ForaDaMalhaException {
		for (Mediado mediado : mediados) {
			if (mediado.getClass() != originador.getClass()) {
				mediado.recebe(atual, proxima);
			}
		}

	}

}
