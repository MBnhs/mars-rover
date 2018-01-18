package br.com.marcelo.marsrover.rover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.marcelo.marsrover.exception.ColisaoException;
import br.com.marcelo.marsrover.exception.ForaDaMalhaException;

public class Planalto {

	private List<Coordenada> malha;
	Map<Coordenada, Rover> mapa;

	public Planalto(int x, int y) {
		malha = new ArrayList<>();

		for (int base = 0; base <= x; base++) {
			for (int altura = 0; altura <= y; altura++) {
				malha.add(new Coordenada(base, altura));
			}
		}
		mapa = new HashMap<>();
	}

	public boolean isMovimentacaoPossivel(Coordenada coordenada) {
		
		return true;
	}

	public void recebe(Rover rover) throws ColisaoException, ForaDaMalhaException {
		if (!isDentroDaMalha(rover.getCoordenada())) {
			throw new ForaDaMalhaException("Impossível pousar, coordenada definida fora da malha!");
		}
		if (!isPosicaoVaga(rover.getCoordenada())) {
			throw new ColisaoException("Impossível pousar, espaço da malha está ocupado!");
		} else {
			mapa.put(rover.getCoordenada(), rover);
		}
	}

	private boolean isDentroDaMalha(Coordenada coordenada) {
		return malha.contains(coordenada);
	}

	private boolean isPosicaoVaga(Coordenada coordenada) {
		return mapa.get(coordenada) == null;
	}

	public Map<Coordenada, Rover> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Coordenada, Rover> mapa) {
		this.mapa = mapa;
	}

}
