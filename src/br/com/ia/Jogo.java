package br.com.ia;


import javax.swing.JOptionPane;

/**
 * 
 * @author anderson.gomes
 *
 */

public class Jogo extends Tree {

	public static int indice = 1;

	public Jogo() {
		
		String str[] = { "Sim", "Não" };

		JOptionPane.showMessageDialog(null, "Pense em um Animal");
		
		if (getARVORE() == null) {
			setARVORE(new No("vive na agua", indice));
			getARVORE().casoNao = new No("Macaco", ++indice);
			getARVORE().casoSim = new No("Tubarao", ++indice);

		}

		int sair = 1;

		while (sair == 1) {

			int resp = JOptionPane.showOptionDialog(null, "O animal que pensei"
					+ getARVORE().valor, "Confirme", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, str, str[0]);

			if (resp == 0) {
				
				perguntarUsuario(getARVORE().casoSim);
			} else {
				
				perguntarUsuario(getARVORE().casoNao);
			}

			int respSair = JOptionPane.showOptionDialog(null,
					"Deseja sair do jogo?", "Confirme",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, str, str[0]);

			if (respSair == 0) {
				sair = 0;
			}
		}

	}

	private void inserirAnimalNovo(No no) {
		
		++indice;
			String animal = JOptionPane.showInputDialog(null,
					"Qual o animal que você pensou?");

			++indice;
			String caracteristica = JOptionPane.showInputDialog("Um(a) "
					+ animal + "______ mas um(a) "+ no.valor +" não.");

			inserirValor(no, caracteristica, animal);
	
	}

	private void perguntarUsuario(No no) {
		String str[] = { "Sim", "Não" };

		int respSim = JOptionPane.showOptionDialog(null, "O animal que pensei "
				+ no.valor, "Confirme", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, str, str[0]);

		if (respSim == 0) {

			if (no.casoSim == null)
				JOptionPane.showMessageDialog(null, "Acertei de novo!");
			else {
				perguntarUsuario(no.casoSim);
			}

		} else {
			if (no.casoNao == null)
				inserirAnimalNovo(no);
			else {
				perguntarUsuario(no.casoNao);
			}
		}

	}

}
