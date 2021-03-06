package br.com.caelum.investimento;

import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public double calculaRendimento(ContaBancaria conta) {
		Random r = new Random();

		boolean escolhido = r.nextDouble() > 0.50;
		if (escolhido) {
			return conta.getSaldo() * 0.025 * 0.75;
		} else {
			return conta.getSaldo() * 0.07 * 0.75;
		}
	}

}
