package br.upe.reforco;

import java.util.Random;

public class Maquina {

	private Random rand = new Random();

	// ingredientes
	private double cafe;
	private double agua;
	private double chocolate;
	private double leite;

	public double getCafe() {
		return cafe;
	}

	public void setCafe(double cafe) {
		this.cafe = cafe;
	}

	public double getAgua() {
		return agua;
	}

	public void setAgua(double agua) {
		this.agua = agua;
	}

	public double getChocolate() {
		return chocolate;
	}

	public void setChocolate(double chocolate) {
		this.chocolate = chocolate;
	}

	public double getLeite() {
		return leite;
	}

	public void setLeite(double leite) {
		this.leite = leite;
	}

	// credito
	private double credito;

	// status
	private boolean statusMoedor;
	private boolean statusBombaAgua;
	private boolean statusAquecedor;
	private boolean statusDosador;
	private boolean statusDispensadorCopo;

	private Receita expresso = new Receita("Café Expresso", 40, 40, 0, 0, 0.50);
	private Receita longo = new Receita("Café Longo", 80, 40, 0, 0, 0.50);
	private Receita pingado = new Receita("Café Pingado", 40, 40, 20, 0, 1);

	public Maquina() {
		this.rand = new Random();
		this.statusMoedor = this.rand.nextInt(10) > 0;
		this.statusBombaAgua = rand.nextInt(10) > 0;
		this.statusAquecedor = rand.nextInt(10) > 0;
		this.statusDosador = rand.nextInt(10) > 0;
		this.statusDispensadorCopo = rand.nextInt(10) > 0;

		this.expresso = new Receita("Café Expresso", 40, 40, 0, 0, 0.50);
		this.longo = new Receita("Café Longo", 80, 40, 0, 0, 0.50);
		this.pingado = new Receita("Café Pingado", 40, 40, 20, 0, 1);

	}

	public boolean EstaOK() {
		boolean status = this.statusAquecedor && this.statusBombaAgua && this.statusDispensadorCopo
				&& this.statusDosador && this.statusMoedor;

		return status;
	}

	public void depositarCredito(double valorDepositado) {
		double novoCredito = this.credito + valorDepositado;
		this.credito = novoCredito;
	}

	Receita receita = null;

	public void prepararBebida(int opcaoBebida) {

		// encontrar a receita da bebida
		if (opcaoBebida == 1) {
			receita = this.expresso;
		} else if (opcaoBebida == 2) {
			receita = this.longo;
		} else if (opcaoBebida == 3) {
			receita = this.pingado;
		}

		// preparar a bebida

		// debitar o credito
		this.credito = this.credito - receita.getPreco();

		// informar que a preparação está terminada
		System.out.println("Preparação do" + receita.getNome() + "terminado");
	}

}
