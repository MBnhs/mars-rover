package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RoverTest {

	private Rover rover;

	@Before
	public void setup() {
		rover = new Rover(new Coordenada(1, 2), new North(), new Estacao());
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
		assertEquals("1 3 N", rover.getPosicao());
	}
	
	@Test
	public void deveMoverPosicao() {
		rover.viraAEsquerda();
		rover.moveAFrente();
		rover.viraAEsquerda();
		rover.moveAFrente();
		rover.viraAEsquerda();
		rover.moveAFrente();
		rover.viraAEsquerda();
		rover.moveAFrente();
		rover.moveAFrente();
		assertEquals("1 3 N", rover.getPosicao());
		
		rover = new Rover(new Coordenada(3, 3), new East(), new Estacao());
		rover.moveAFrente();
		rover.moveAFrente();
		rover.viraADireita();
		rover.moveAFrente();
		rover.moveAFrente();
		rover.viraADireita();
		rover.moveAFrente();
		rover.viraADireita();
		rover.viraADireita();
		rover.moveAFrente();
		assertEquals("5 1 E", rover.getPosicao());
		
	}

	@Test
	public void deveMoverPosicao2() {
		rover.viraAEsquerda();
		rover.moveAFrente();
		rover.viraAEsquerda();
		rover.moveAFrente();
		rover.viraAEsquerda();
		rover.moveAFrente();
		rover.viraAEsquerda();
		rover.moveAFrente();
		rover.moveAFrente();
		assertEquals("1 3 N", rover.getPosicao());
		
		rover = new Rover(new Coordenada(3, 3), new East(), new Estacao());
		rover.moveAFrente();
		rover.moveAFrente();
		rover.viraADireita();
		rover.moveAFrente();
		rover.moveAFrente();
		rover.viraADireita();
		rover.moveAFrente();
		rover.viraADireita();
		rover.viraADireita();
		rover.moveAFrente();
	
		assertEquals("5 1 E", rover.getPosicao());
		
	}
}
