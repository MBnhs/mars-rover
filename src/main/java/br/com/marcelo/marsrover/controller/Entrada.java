package br.com.marcelo.marsrover.controller;

import java.util.List;

public class Entrada {

	private String planalto;
	private List<DadosRover> dadosRover;

	public String getPlanalto() {
		return planalto;
	}

	public void setPlanalto(String planalto) {
		this.planalto = planalto;
	}

	public List<DadosRover> getDadosRover() {
		return dadosRover;
	}

	public void setDadosRover(List<DadosRover> dadosRover) {
		this.dadosRover = dadosRover;
	}

}
