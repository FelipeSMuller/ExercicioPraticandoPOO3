package treinandoOOP;

import javax.swing.JOptionPane;

public class PraticandoHeranca {

	public static void main(String[] args) {

		// Inicializando a variavel
		int opcao = 0;
		int escolha = 0;

		// Entrando em um loop
		do {

			try {

				// Entrada de dados, recebe um número inteiro que determina uma opção
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"CADASTRO DE VEICULOS \n1-Insira dados do carro \n2-Insira dados da moto \n3-Insira dados do caminhão"));

				// Se o programa receber algo diferente de um número inteiro cai em um bloco try
				// catch
			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Dados não numéricos foram inseridos ou o programa foi finalizado!!", null,
						JOptionPane.ERROR_MESSAGE);
			}

			// Estrutura switch case.
			switch (opcao) {

			case 1:

				// Instanciando um novo objeto do tipo carro;
				Carro carro1 = new Carro(null, null, 0, 0.0);

				// Acessando os atributos através dos getters e setters
				carro1.setAno(2023);

				carro1.setMarca("Fiat");

				carro1.setModelo("Cronos");

				carro1.setPreco(20000.0);

				carro1.setQuantidadePortas(4);

				carro1.setTipoCombustivel("Diesel");

				escolha = JOptionPane.showConfirmDialog(null, "Deseja verificar as informações do carro?");

				// Se a escolha for igual a SIM
				if (escolha == 0) {

					// Chama o método que imprime as informações do carro

					carro1.exibirInformacoes();

				}

				// Caso contrário mostra uma mensagem no prompt, indicando que a aplicação foi
				// finalizada
				else {

					JOptionPane.showMessageDialog(null, "A aplicação foi finalizada!!");
				}

				break;

			case 2:

				// Instanciando um novo objeto do tipo moto.
				Moto moto1 = new Moto(null, null, 0, 0.0);

				// Acessando os atributos através dos getters e setters

				moto1.setAno(2020);

				moto1.setMarca("Honda");

				moto1.setModelo("CG 160 Fan");

				moto1.setPreco(20000.0);

				moto1.setTipoFreio("Disco");

				moto1.setCilindradas(4);

				escolha = JOptionPane.showConfirmDialog(null, "Deseja verificar as informações da moto?");

				// Se a escolha for igual a SIM
				if (escolha == 0) {

					// Chama o método que imprime as informações do carro

					moto1.exibirInformacoes();

				}

				// Caso contrário mostra uma mensagem no prompt, indicando que a aplicação foi
				// finalizada
				else {

					JOptionPane.showMessageDialog(null, "A aplicação foi finalizada!!");
				}

				break;

			case 3:

				// Instanciando um objeto do tipo caminhão.
				Caminhao caminhao1 = new Caminhao(null, null, 0, null);

				// Getters e Setters para acesso dos atributos
				caminhao1.setAno(2020);

				caminhao1.setMarca("Scania");

				caminhao1.setModelo("Linha P");

				caminhao1.setPreco(100000.0);

				caminhao1.setCapacidadeCarga(40.0);

				caminhao1.setEixoTraseiroDuplo(false);

				escolha = JOptionPane.showConfirmDialog(null, "Deseja verificar as informações do caminhão?");

				// Se a escolha for igual a SIM
				if (escolha == 0) {

					// Chama o método que imprime as informações do carro

					caminhao1.exibirInformacoes();

				}

				// Caso contrário mostra uma mensagem no prompt, indicando que a aplicação foi
				// finalizada
				else {

					JOptionPane.showMessageDialog(null, "A aplicação foi finalizada!!");
				}

				break;

			}

			// Enquanto a opção escolhida for maior do que 0
		} while (opcao > 0);

	}

}
