package br.com.marcelo.marsrover.rover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.marcelo.marsrover.exception.ColisaoException;
import br.com.marcelo.marsrover.exception.ForaDaMalhaException;

public class Planalto extends Mediado {

	private List<Coordenada> malha;
	Map<Coordenada, Boolean> mapa;

	public Planalto(int x, int y, Mediador mediador) {
		super(mediador);
		malha = new ArrayList<>();

		for (int base = 0; base <= x; base++) {
			for (int altura = 0; altura <= y; altura++) {
				malha.add(new Coordenada(base, altura));
			}
		}
		mapa = new HashMap<>();
	}

	public void atualiza(Coordenada coordenada) throws ColisaoException, ForaDaMalhaException {
		if (!isDentroDaMalha(coordenada)) {
			throw new ForaDaMalhaException("Impossível pousar, coordenada definida fora da malha!");
		}
		if (!isPosicaoVaga(coordenada)) {
			throw new ColisaoException("Impossível pousar, espaço da malha está ocupado!");
		} else {
			mapa.put(coordenada, true);
		}
	}

	public void atualiza(Coordenada atual, Coordenada proxima) throws ColisaoException, ForaDaMalhaException {
		if (!isDentroDaMalha(proxima)) {
			throw new ForaDaMalhaException("Impossível movimentar, coordenada definida fora da malha!");
		}
		if (!isPosicaoVaga(proxima)) {
			throw new ColisaoException("Impossível movimentar, espaço da malha está ocupado!");
		} else {
			mapa.put(atual, null);
			mapa.put(proxima, true);
		}
	}

	private boolean isDentroDaMalha(Coordenada coordenada) {
		return malha.contains(coordenada);
	}

	private boolean isPosicaoVaga(Coordenada coordenada) {
		return mapa.get(coordenada) == null;
	}

	public Map<Coordenada, Boolean> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Coordenada, Boolean> mapa) {
		this.mapa = mapa;
	}

	public List<Coordenada> getMalha() {
		return malha;
	}

	public void setMalha(List<Coordenada> malha) {
		this.malha = malha;
	}

	@Override
	void recebe(Coordenada coordenada) throws ColisaoException, ForaDaMalhaException {

		atualiza(coordenada);

	}

	@Override
	void recebe(Coordenada atual, Coordenada proxima) throws ColisaoException, ForaDaMalhaException {

			atualiza(atual, proxima);

	}

}
