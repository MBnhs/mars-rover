package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RoverTest {

	private Rover rover;

	@Before
	public void setup() {
		rover = new Rover(new Coordenada(1, 2), new North(), new Planalto());

	}

	@Test
	public void deveMostrarPosicao() {
		assertEquals("1 2 N", rover.getPosicao());
	}

	@Test
	public void deveVirarADireita() {
		rover.viraADireita();
		assertEquals("1 2 E", rover.getPosicao());
		rover.viraADireita();
		assertEquals("1 2 S", rover.getPosicao());
		rover.viraADireita();
		assertEquals("1 2 W", rover.getPosicao());
		rover.viraADireita();
		assertEquals("1 2 N", rover.getPosicao());
	}

	@Test
	public void deveVirarAEsquerda() {
		rover.viraAEsquerda();
		assertEquals("1 2 W", rover.getPosicao());
		rover.viraAEsquerda();
		assertEquals("1 2 S", rover.getPosicao());
		rover.viraAEsquerda();
		assertEquals("1 2 E", rover.getPosicao());
		rover.viraAEsquerda();
		assertEquals("1 2 N", rover.getPosicao());
	}
	
	@Test
	public void deveSeMoverAFrente() {
		rover.moveAFrente();
	}

}
