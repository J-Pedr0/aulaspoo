package br.org.serratec.teste;

import br.org.serratec.model.AtletaAmador;

public class TesteAtleta {

	public static void main(String[] args) {
		AtletaAmador amador = new AtletaAmador("Leandro", "Masculino", 27, 1.80, true);

		if (amador.podeCompetir()) {
			System.out.println(amador + " \nPode competir");
		} else {
			System.out.println(amador + " \nNão pode competir");
		}
	}

}
