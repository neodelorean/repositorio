package br.com.caelum.investimento;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class RealizadorDeInvestimentosTest {

	@Test
	public void test() {
        ContaBancaria conta = new ContaBancaria(10000.0);

        Investimento conservador = new Conservador();
        Investimento moderado = new Moderado();
        Investimento arrojado = new Arrojado();

        RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();
        
        realizador.realizaInvestimento(conta, conservador);
		assertThat(conta.getSaldo(), equalTo(10600.0));

		realizador.realizaInvestimento(conta, moderado);
		assertThat(conta.getSaldo(), equalTo(10798.75));

		realizador.realizaInvestimento(conta, arrojado);
		assertThat(conta.getSaldo(), equalTo(11203.703125));
		
	}

}
