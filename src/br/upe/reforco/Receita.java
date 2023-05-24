package br.upe.reforco;

public class Receita {
	
	private String nome;
	private double qtdCafe;
	private double qtdAgua;
	private double qtdChocolate;
	private double qtdLeite;

	private double preco;
	
	public Receita(String nome, double qtdCafe, double qtdAgua, double qtdLeite, double qtdChocolate, double preco) {
		this.nome = nome;
		this.qtdAgua = qtdAgua;
		this.qtdCafe = qtdCafe;
		this.qtdLeite = qtdLeite;
		this.qtdChocolate = qtdChocolate;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQtdCafe() {
		return qtdCafe;
	}

	public void setQtdCafe(double qtdCafe) {
		this.qtdCafe = qtdCafe;
	}

	public double getQtdAgua() {
		return qtdAgua;
	}

	public void setQtdAgua(double qtdAgua) {
		this.qtdAgua = qtdAgua;
	}

	public double getQtdChocolate() {
		return qtdChocolate;
	}

	public void setQtdChocolate(double qtdChocolate) {
		this.qtdChocolate = qtdChocolate;
	}

	public double getQtdLeite() {
		return qtdLeite;
	}

	public void setQtdLeite(double qtdLeite) {
		this.qtdLeite = qtdLeite;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreço(double preco) {
		this.preco = preco;
	}
	

	
}
