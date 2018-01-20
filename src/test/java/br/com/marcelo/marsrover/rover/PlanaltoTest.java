package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.marcelo.marsrover.exception.ColisaoException;
import br.com.marcelo.marsrover.exception.ForaDaMalhaException;
import br.com.marcelo.marsrover.geo.Coordenada;

public class PlanaltoTest {

	Planalto planalto;

	@Before
	public void setup() {
		planalto = new Planalto(2, 2, new Estacao());
	}

	@Test
	public void deveOcuparCoordenada() throws ColisaoException, ForaDaMalhaException {
		planalto.atualiza(new Coordenada(1, 1));
		planalto.getMapa().get(new Coordenada(1, 1));
		assertNotNull(planalto.getMapa().get(new Coordenada(1, 1)));
	}

	@Test(expected = ColisaoException.class)
	public void naoDeveOcuparCoordenadaNaMesmaPosicao() throws ColisaoException, ForaDaMalhaException {
		planalto.atualiza(new Coordenada(1, 1));
		planalto.atualiza(new Coordenada(1, 1));
		planalto.atualiza(new Coordenada(1, 1));
	}

	@Test(expected = ForaDaMalhaException.class)
	public void naoDeveReceberCoordenadaForaDaMalha() throws ForaDaMalhaException, ColisaoException {
		planalto.atualiza(new Coordenada(5, 5));

	}

}
