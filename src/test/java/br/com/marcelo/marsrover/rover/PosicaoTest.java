package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PosicaoTest {
	
	private Coordenada posicao;
	
	@Before
	public void setup() {
		posicao = new Coordenada(1,3);
	}
	
	@Test
	public void deveMostrarPosicaoXY() {
		assertEquals("1 3", posicao.toString());
	}

}
