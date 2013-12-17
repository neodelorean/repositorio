package br.com.caelum.conta;

public class Conta {
	private String nome;
	private double saldo;
	private String agencia;
	private int numero;

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta() {
	}

	public Conta(String nome, double saldo) {
		this.setNome(nome);
		this.setSaldo(saldo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}