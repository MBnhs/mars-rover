package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoordenadaTest {

	Coordenada coordenada;

	@Before
	public void setup() {
		coordenada = new Coordenada(0, 0);
	}

	@Test
	public void deveImprimirCoordenada() {
		assertEquals("0 0", coordenada.toString());
	}

}
