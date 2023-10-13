package metodos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TratamentoDecimais {

	// Método para tratamento de valores decimais
	public static void tratarDecimais(Double numero) {

		try {

			// Se o valor for negativo ou igual a zero gera um erro
			if (numero <= 0) {

				JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a zero", null,
						JOptionPane.ERROR_MESSAGE);
			}

			// Se o programa for fechado ou caso o programa receba dados inválidos ( um
			// campo de números decimais não pode receber strings)
		} catch (NumberFormatException | NullPointerException erro) {

			// Mostra no prompt uma mensagem de erro com ícones intuitivos
			JOptionPane.showMessageDialog(null,
					"Dados não númericos foram inseridos ou o programa foi finalizado incorretamente!!", null,
					JOptionPane.WARNING_MESSAGE);
		}

	}

	// Método para formatação de valores decimais
	public static String formatarPreco(Double preco) {

		String precoFormatado;

		DecimalFormat df = new DecimalFormat("R$ ####.##");

		precoFormatado = df.format(preco);

		return precoFormatado;

	}

}
