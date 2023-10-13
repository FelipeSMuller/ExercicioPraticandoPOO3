package treinandoOOP;

import javax.swing.JOptionPane;

import metodos.TratamentoDecimais;

import metodos.TratamentoInteiros;

import metodos.TratamentoStrings;

public class Carro extends Veiculo {

	// Atributos da classe carro.
	private int quantidadePortas;

	private String tipoCombustivel;

	public Carro(String marca, String modelo, int ano, Double preco) {

		// Super indica que a classe Carro herdou os atributos da classe Veiculo
		super(marca, modelo, ano, preco);

	}

	// Getters e setters
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	// Acessando o atributo encapsulado
	public void setQuantidadePortas(int quantidadePortas) {

		// Reutilizando o método de tratamento para números inteiros, produzindo
		// modularidade no código
		TratamentoInteiros.tratarInteiros(quantidadePortas);

		this.quantidadePortas = quantidadePortas;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	// Acessando o atributo encapsulado
	public void setTipoCombustivel(String tipoCombustivel) {

		// Reutilizando o método para tratamento de String
		TratamentoStrings.tratarStrings(tipoCombustivel);
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override

	// Método overload , exibindo as informações do carro.

	public void exibirInformacoes() {

		String precoFormatado = TratamentoDecimais.formatarPreco(preco);

		JOptionPane.showMessageDialog(null,
				"INFORMAÇÕES DO CARRO:  " + "\nMarca:  " + marca + "\nModelo:  " + modelo + "\nAno:  " + ano
						+ "\nPreço:  " + precoFormatado + "\nQuantidade de portas:  " + quantidadePortas
						+ "\nTipo de combustível:  " + tipoCombustivel);

	}

}
