package com.indice.exameTecnico;

public class PooIndice {

	private int indice;
	private int soma;
	private int k;

	public PooIndice(int indice, int soma, int k) {
		super();
		this.indice = indice;
		this.soma = soma;
		this.k = k;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public void calcularSoma() {
		while (k < indice) {
		    k = k + 1;
		    soma = soma + k;
		}
           System.out.println("Soma total= " + soma);
	}

	public static void main(String[] args) {

		PooIndice indice = new PooIndice(13, 0, 0);
		indice.calcularSoma();

	}

}
