package br.com.marcelo.marsrover.rover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.marcelo.marsrover.geo.Coordenada;
import br.com.marcelo.marsrover.geo.Direcao;
import br.com.marcelo.marsrover.geo.TipoDirecao;
import br.com.marcelo.marsrover.geo.West;

public class WestTest {

	West oeste;

	@Before
	public void setup() {
		oeste = new West();
	}

	@Test
	public void deveMostrarValorPadraoNorte() {
		assertEquals(TipoDirecao.W, oeste.getTipoDirecao());
	}

	@Test
	public void deveVirarADireitaParaNorte() {
		Direcao direcao = oeste.viraADireita();
		assertEquals(TipoDirecao.N, direcao.getTipoDirecao());
	}

	@Test
	public void deveVirarAEsquerdaParaSul() {
		Direcao direcao = oeste.viraAEsquerda();
		assertEquals(TipoDirecao.S, direcao.getTipoDirecao());
	}
	
	@Test
	public void deveSeMoverParaOOeste() {
		Coordenada coordenada = new Coordenada(0, 0);
		oeste.movimenta(coordenada);
		assertEquals("-1 0", coordenada.toString());
	}

}
