package br.com.marcelo.marsrover.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelo.marsrover.rover.Coordenada;
import br.com.marcelo.marsrover.rover.Planalto;
import br.com.marcelo.marsrover.rover.Rover;
import br.com.marcelo.marsrover.rover.TipoDirecao;

@RestController
public class Central {

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String post(@RequestBody Entrada entrada) {
		String[] splitPlanalto = entrada.getPlanalto().split(" ");

		Planalto planalto = new Planalto(Integer.parseInt(splitPlanalto[0]), Integer.parseInt(splitPlanalto[1]));
		for (DadosRover dadosRover : entrada.getDadosRover()) {
			String[] splitPosicao = dadosRover.getPosicaoInicial().split(" ");
			Rover rover = new Rover(
					new Coordenada(Integer.parseInt(splitPosicao[0]), Integer.parseInt(splitPosicao[1])),
					TipoDirecao.valueOf(TipoDirecao.class, splitPosicao[2]).getDirecao(), planalto);
			System.out.println("");
		}
		return "hello";
	}

}
