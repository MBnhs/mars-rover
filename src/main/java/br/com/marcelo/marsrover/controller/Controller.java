package br.com.marcelo.marsrover.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelo.marsrover.exception.ColisaoException;
import br.com.marcelo.marsrover.exception.ForaDaMalhaException;
import br.com.marcelo.marsrover.geo.Coordenada;
import br.com.marcelo.marsrover.geo.TipoDirecao;
import br.com.marcelo.marsrover.rover.Estacao;
import br.com.marcelo.marsrover.rover.Planalto;
import br.com.marcelo.marsrover.rover.Rover;

@RestController
public class Controller {

	@RequestMapping(value = "/mars", method = RequestMethod.POST)
	public Saida posicionaEntradas(@RequestBody Entrada entrada) {
		String[] splitPlanalto = entrada.getPlanalto().split(" ");
		Estacao estacao = new Estacao();

		Planalto planalto = new Planalto(Integer.parseInt(splitPlanalto[0]), Integer.parseInt(splitPlanalto[1]),
				estacao);

		estacao.adicionaMediado(planalto);

		Saida saida = new Saida();

		for (DadosRover dadosRover : entrada.getDadosRover()) {
			String[] splitPosicao = dadosRover.getPosicaoInicial().split(" ");
			Rover rover = new Rover(
					new Coordenada(Integer.parseInt(splitPosicao[0]), Integer.parseInt(splitPosicao[1])),
					TipoDirecao.valueOf(TipoDirecao.class, splitPosicao[2]).getDirecao(), estacao);

			estacao.adicionaMediado(rover);

			try {
				estacao.envia(rover.getCoordenada(), rover);
			} catch (ColisaoException | ForaDaMalhaException e) {
				continue;
			}

			String acoes = dadosRover.getAcoes();
			acoes.chars().forEach(c -> {
				char acao = (char) c;
				if (acao == 'M') {
					Coordenada proxima = new Coordenada(rover.getCoordenada().getX(), rover.getCoordenada().getY());
					rover.getDirecao().movimenta(proxima);
					try {
						estacao.envia(rover.getCoordenada(), proxima, rover);
						rover.moveAFrente();
					} catch (ColisaoException | ForaDaMalhaException e) {
						return;
					}
				}
				if (acao == 'L')
					rover.viraAEsquerda();

				if (acao == 'R')
					rover.viraADireita();

			});
			saida.getRovers().add(rover.getPosicao());
		}
		return saida;
	}

}
