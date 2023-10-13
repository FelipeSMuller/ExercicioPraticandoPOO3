package treinandoOOP;

import javax.swing.JOptionPane;

import metodos.TratamentoDecimais;

import metodos.TratamentoInteiros;

import metodos.TratamentoStrings;

public class Moto extends Veiculo {

	// Atributos encapsulados da classe moto.
	private int cilindradas;

	private String tipoFreio;

	public Moto(String marca, String modelo, int ano, Double preco) {
		super(marca, modelo, ano, preco);

	}

	public int getCilindradas() {
		return cilindradas;
	}

	// Método público para acessar o atributo encapsulado
	public void setCilindradas(int cilindradas) {

		// Reutilizando o método de tratamento para números inteiros
		TratamentoInteiros.tratarInteiros(cilindradas);

		this.cilindradas = cilindradas;
	}

	public String getTipoFreio() {
		return tipoFreio;
	}

	public void setTipoFreio(String tipoFreio) {

		// Reutilizando o método de tratamento para de Strings

		TratamentoStrings.tratarStrings(tipoFreio);
		this.tipoFreio = tipoFreio;
	}

	@Override

	// Método overload , exibindo as informações da moto.

	public void exibirInformacoes() {

		JOptionPane.showMessageDialog(null,
				"INFORMAÇÕES DA MOTO:  " + "\nMarca:  " + marca + "\nModelo:  " + modelo + "\nAno:  " + ano
						+ "\nPreço:  " + TratamentoDecimais.formatarPreco(preco) + "\nTipo de freio: " + tipoFreio
						+ "\nQuantidade de cilindradas:  " + cilindradas);

	}

}
