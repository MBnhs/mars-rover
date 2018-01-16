package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NorthTest {
	
	North norte;
	
	@Before
	public void setup() {
		norte = new North();
	}

	@Test
	public void deveMostrarValorPadraoNorte() {
		assertEquals(TipoDirecao.N, norte.getTipoDirecao());
	}
	
	@Test
	public void deveVirarADireitaParaLeste() {
		Direcao direcao = norte.viraADireita();
		assertEquals(TipoDirecao.E, direcao.getTipoDirecao());
	}
	
	@Test
	public void deveVirarAEsquerdaParaOeste() {
		Direcao direcao = norte.viraAEsquerda();
		assertEquals(TipoDirecao.W, direcao.getTipoDirecao());
	}

}
