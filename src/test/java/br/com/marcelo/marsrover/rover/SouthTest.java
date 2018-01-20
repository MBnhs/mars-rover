package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.marcelo.marsrover.geo.Coordenada;
import br.com.marcelo.marsrover.geo.Direcao;
import br.com.marcelo.marsrover.geo.South;
import br.com.marcelo.marsrover.geo.TipoDirecao;

public class SouthTest {
	
	South sul;
	
	@Before
	public void setup() {
		sul = new South();
	}

	@Test
	public void deveMostrarValorPadraoSul() {
		assertEquals(TipoDirecao.S, sul.getTipoDirecao());
	}
	
	@Test
	public void deveVirarADireitaParaOeste() {
		Direcao direcao = sul.viraADireita();
		assertEquals(TipoDirecao.W, direcao.getTipoDirecao());
	}
	
	@Test
	public void deveVirarAEsquerdaParaLeste() {
		Direcao direcao = sul.viraAEsquerda();
		assertEquals(TipoDirecao.E, direcao.getTipoDirecao());
	}
	
	@Test
	public void deveSeMoverParaOSul() {
		Coordenada coordenada = new Coordenada(0, 0);
		sul.movimenta(coordenada);
		assertEquals("0 -1", coordenada.toString());
	}

}
