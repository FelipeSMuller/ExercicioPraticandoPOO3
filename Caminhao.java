package treinandoOOP;

import javax.swing.JOptionPane;

import metodos.TratamentoDecimais;

import metodos.TratamentoStrings;

public class Caminhao extends Veiculo {

	private Double capacidadeCarga;

	private Boolean eixoTraseiroDuplo;

	public Caminhao(String marca, String modelo, int ano, Double preco) {
		super(marca, modelo, ano, preco);

	}

	public Double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(Double capacidadeCarga) {

		TratamentoDecimais.tratarDecimais(capacidadeCarga);

		this.capacidadeCarga = capacidadeCarga;
	}

	public Boolean getEixoTraseiroDuplo() {
		return eixoTraseiroDuplo;
	}

	// Método para tratamento de valores booleanos, se for diferente de verdadeiro
	// ou falso gera um erro!!
	public void setEixoTraseiroDuplo(Boolean eixoTraseiroDuplo) {

		TratamentoStrings.tratarBooleanos(eixoTraseiroDuplo);

		this.eixoTraseiroDuplo = eixoTraseiroDuplo;
	}

	@Override

	// Método overload , exibindo as informações do caminhão.
	public void exibirInformacoes() {

		String precoFormatado = TratamentoDecimais.formatarPreco(preco);

		JOptionPane.showMessageDialog(null,
				"INFORMAÇÕES DO CAMINHÃO:  " + "\nMarca:  " + marca + "\nModelo:  " + modelo + "\nAno:  " + ano
						+ "\nPreço:  " + precoFormatado + "\nCapacidade de carga:  " + capacidadeCarga
						+ "\nEixo traseiro duplo:  " + eixoTraseiroDuplo);

	}

}
