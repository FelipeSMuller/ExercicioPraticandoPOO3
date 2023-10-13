package metodos;

import javax.swing.JOptionPane;

public class TratamentoStrings {

	public static void tratarStrings(String frase) {

		try {

			// Se o campo estiver vazio gera um erro
			if (frase.isEmpty()) {

				JOptionPane.showMessageDialog(null, "O campo está vazio, porém precisa ser preenchido", null,
						JOptionPane.ERROR_MESSAGE);
			}

			// Se o programa for fechado incorretamente gera outro erro!!
		} catch (NullPointerException erro) {

			JOptionPane.showMessageDialog(null, "O programa foi encerrado!!", null, JOptionPane.WARNING_MESSAGE);
		}

	}

	public static void tratarBooleanos(Boolean inserir) {

		if (inserir != false && inserir != true) {

			JOptionPane.showMessageDialog(null, "Insira apenas valores true or false", null,
					JOptionPane.WARNING_MESSAGE);
		}

	}

}
