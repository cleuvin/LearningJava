package learningJava;

import javax.swing.JOptionPane;

public class learningJava {

	public static void main(String[] args) {

		String nota = JOptionPane.showInputDialog("Informe a nota 1 ");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2 ");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3 ");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4 ");

		double dNota1 = Double.parseDouble(nota);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		/* Media para aprova��o � 60 */

		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno est� aprovado com m�dia de: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno est� em recupera��o com m�dia de: " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno est� reprovado com m�dia de: " + media);
		}

	}

}
