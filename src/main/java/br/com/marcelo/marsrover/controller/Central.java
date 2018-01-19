package br.com.marcelo.marsrover.controller;

import java.util.ArrayList;
import java.util.List;

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
		List<Rover> rovers = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (DadosRover dadosRover : entrada.getDadosRover()) {
			String[] splitPosicao = dadosRover.getPosicaoInicial().split(" ");
			Rover rover = new Rover(
					new Coordenada(Integer.parseInt(splitPosicao[0]), Integer.parseInt(splitPosicao[1])),
					TipoDirecao.valueOf(TipoDirecao.class, splitPosicao[2]).getDirecao(), planalto);
			rovers.add(rover);
			String acoes = dadosRover.getAcoes();
			acoes.chars().forEach(c -> {
				char acao = (char) c;
				if (acao == 'M')
					rover.moveAFrente();

				if (acao == 'L')
					rover.viraAEsquerda();

				if (acao == 'R')
					rover.viraADireita();

			});
			sb.append(rover.getPosicao());
			sb.append("\n");
		}
		return sb.toString();
	}

}
