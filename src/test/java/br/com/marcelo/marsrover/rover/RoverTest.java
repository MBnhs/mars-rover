package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RoverTest {

	private Rover rover;

	@Before
	public void setup() {
		rover = new Rover(new Coordenada(1, 2), new North());

	}

	@Test
	public void deveMostrarPosicao() {
		System.out.println(rover.getPosicao());
		assertEquals("1 2 N", rover.getPosicao());
	}

}
