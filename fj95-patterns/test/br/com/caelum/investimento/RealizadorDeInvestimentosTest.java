package br.com.caelum.investimento;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class RealizadorDeInvestimentosTest {

	ContaBancaria conta = new ContaBancaria(10000.0);

	@Before
	public void setUp() {
		conta = new ContaBancaria(10000.0);
	}

	@Test
	public void testeDoInvestimentoConservador() {

		Investimento conservador = new Conservador();

		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();

		realizador.realizaInvestimento(conta, conservador);
		assertThat(conta.getSaldo(), equalTo(10600.0));
	}

	@Test
	public void testeDoInvestimentoModerado() {

		Investimento moderado = new Moderado();

		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();

		double menor = 10000 * (1 + 0.025 * 0.75);
		double maior = 10000 * (1 + 0.070 * 0.75);

		realizador.realizaInvestimento(conta, moderado);
		assertThat(conta.getSaldo(), anyOf(equalTo(menor), equalTo(maior)));

	}

	@Test
	public void testeDoInvestimentoArrojado() {

		Investimento arrojado = new Arrojado();

		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();

		double menor = 10000 * (1 + 0.03 * 0.75);
		double medio = 10000 * (1 + 0.05 * 0.75);
		double maior = 10000 * (1 + 0.06 * 0.75);

		realizador.realizaInvestimento(conta, arrojado);

		assertThat(conta.getSaldo(),
				anyOf(equalTo(menor), equalTo(medio), equalTo(maior)));

	}

}
