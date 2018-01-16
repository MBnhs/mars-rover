package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EastTest {
	
	East leste;
	
	@Before
	public void setup() {
		leste = new East();
	}

	@Test
	public void deveMostrarValorPadraoLest() {
		assertEquals(TipoDirecao.E, leste.getTipoDirecao());
	}
	
	@Test
	public void deveVirarADireitaParaSul() {
		Direcao direcao = leste.viraADireita();
		assertEquals(TipoDirecao.S, direcao.getTipoDirecao());
	}
	
	@Test
	public void deveVirarAEsquerdaParaNorte() {
		Direcao direcao = leste.viraAEsquerda();
		assertEquals(TipoDirecao.N, direcao.getTipoDirecao());
	}

}
