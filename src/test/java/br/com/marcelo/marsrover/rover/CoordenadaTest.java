package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.marcelo.marsrover.geo.Coordenada;
import br.com.marcelo.marsrover.geo.TipoMovimento;

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

	@Test
	public void deveMoverEixoXPositivamente() {
		coordenada.moveEixoX(TipoMovimento.POSITIVO);
		assertEquals("1 0", coordenada.toString());
	}

	@Test
	public void deveMoverEixoXNegativamente() {
		coordenada.moveEixoX(TipoMovimento.NEGATIVO);
		assertEquals("-1 0", coordenada.toString());
	}

	@Test
	public void deveMoverEixoYPositivamente() {
		coordenada.moveEixoY(TipoMovimento.POSITIVO);
		assertEquals("0 1", coordenada.toString());
	}

	@Test
	public void deveMoverEixoYNegativamente() {
		coordenada.moveEixoY(TipoMovimento.NEGATIVO);
		assertEquals("0 -1", coordenada.toString());
	}

}
