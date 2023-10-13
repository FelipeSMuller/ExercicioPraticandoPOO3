package metodos;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class TratamentoInteiros {

	// Método para tratamento de números inteiros
	public static void tratarInteiros(int ano) {

		// Instanciando um novo objeto do tipo Data.
		LocalDate dataAtual = LocalDate.now();

		try {

			// Recebe a entrada do usuário

			// Verifica se o ano é negativo ou igual a zero
			if (ano <= 0) {

				// Se não for gera uma mensagem de erro com um ícone intuitivo.
				JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a zero", null,
						JOptionPane.ERROR_MESSAGE);

				// Se o ano inserido for maior que o ano atual (isso não é possível).
			} else if (ano > dataAtual.getYear()) {

				JOptionPane.showMessageDialog(null,
						"Não é possível inserir esse data, pois é um valor maior que o ano de " + dataAtual.getYear(),
						null, JOptionPane.ERROR_MESSAGE);

			}

			// Se o programa receber dados não numericos ou for fechado gera outro erro!
		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null,
					"Dados não númericos foram inseridos ou o programa foi finalizado incorretamente!!", null,
					JOptionPane.WARNING_MESSAGE);
		}
	}

}
