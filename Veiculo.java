package treinandoOOP;

import metodos.TratamentoDecimais;

import metodos.TratamentoStrings;

import metodos.TratamentoInteiros;

public class Veiculo {

	// Atributos do veiculo.

	protected String marca;

	protected String modelo;

	protected int ano;

	protected Double preco;

	// Método construtor do veiculo, inicializando os atributos
	public Veiculo(String marca, String modelo, int ano, Double preco) {

		this.marca = marca;

		this.modelo = modelo;

		this.ano = ano;

		this.preco = preco;
	}

	// Getters e setters
	public String getMarca() {
		return marca;
	}

	// Chama o método que verifica variaveis do tipo String.
	public void setMarca(String marca) {
		// Método verifica se o campo está vazio, se estiver gera um erro, se o programa
		// for finalizado durante a execução gera outro erro
		TratamentoStrings.tratarStrings(marca);

		// Caso contrário armazena o valor no atributo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {

		// Método verifica se o campo está vazio, se estiver gera um erro, se o programa
		// for finalizado durante a execução gera outro erro

		TratamentoStrings.tratarStrings(modelo);
		// Caso contrário armazena o valor no atributo;

		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {

		// O Método verifica se o ano inserido é maior que o ano atual(2023) ou se é um
		// número igual a zero ou negativo, Outra veriicação também ocorre se o programa
		// for finalizado durante a execução gerando outro erro
		TratamentoInteiros.tratarInteiros(ano);

		// Caso contrário armazena o valor no atributo
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {

		// Método verifica se os valores são compatíveis , no caso maiores do que zero,
		// se estiver fora dos padrões gera um erro

		TratamentoDecimais.tratarDecimais(preco);

		// Caso contrário atribui o valor no atributo;
		this.preco = preco;
	}

	public void exibirInformacoes() {

	}

}
