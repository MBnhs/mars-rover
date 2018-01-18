package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.marcelo.marsrover.exception.ColisaoException;
import br.com.marcelo.marsrover.exception.ForaDaMalhaException;

public class PlanaltoTest {

	Planalto planalto;

	@Before
	public void setup() {
		planalto = new Planalto(2, 2);
	}

	@Test
	public void deveReceberRover() throws ColisaoException, ForaDaMalhaException {
		Rover rover = new Rover(new Coordenada(1, 1), new North(), planalto);
		planalto.recebe(rover);
		planalto.getMapa().get(rover.getCoordenada());
		assertNotNull(planalto.getMapa().get(rover.getCoordenada()));
	}

	@Test(expected = ColisaoException.class)
	public void naoDeveReceberRoverNaMesmaPosicao() throws ColisaoException, ForaDaMalhaException {
		planalto.recebe(new Rover(new Coordenada(1, 1), new North(), planalto));
		planalto.recebe(new Rover(new Coordenada(1, 1), new North(), planalto));
		planalto.recebe(new Rover(new Coordenada(0, 1), new North(), planalto));
	}

	@Test(expected = ForaDaMalhaException.class)
	public void naoDeveReceberRoverPosicaoForaDaMalha() throws ForaDaMalhaException, ColisaoException {
		planalto.recebe(new Rover(new Coordenada(3, 3), new North(), planalto));

	}

}
