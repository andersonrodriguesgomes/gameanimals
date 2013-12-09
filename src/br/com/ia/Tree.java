package br.com.ia;

/**
 * 
 * @author anderson.gomes
 *
 */

public class Tree {

	private No ARVORE;

	public No getARVORE() {
		return ARVORE;
	}

	public void setARVORE(No aRVORE) {
		ARVORE = aRVORE;
	}

	protected void inserirValor(No no, String valor1, String valor2) {

		String aux = no.valor;
		no.valor = valor1;
		no.casoSim = new No(valor2, ++Jogo.indice);
		no.casoNao = new No(aux, ++Jogo.indice);

	}

}
