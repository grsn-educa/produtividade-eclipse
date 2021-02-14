package br.com.itajava;

public class Carro {
	int potencia;
	int velocidade;
	String nome;


	public Carro(int potencia) {
		this.potencia = potencia;
	}


	public Carro(int potencia, int velocidade) {
		this.potencia = potencia;
		this.velocidade = velocidade;
	}
	

	public Carro(String nome) {
		this.nome = nome;
	}


	public Carro(int potencia, int velocidade, String nome) {
		this.potencia = potencia;
		this.velocidade = velocidade;
		this.nome = nome;
	}


	void acelerar() {
		velocidade += potencia;
	}

	void frear() {
		velocidade = velocidade / 2;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	void imprimir() {
		System.out.println("O carro " + nome + " esta a velocidade de " + getVelocidade() + " km/h");

	}

}
