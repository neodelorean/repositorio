package br.com.caelum.bissexto;

public class AnoBissexto {

	public boolean ehBissexto(int ano) {
		
		if ((ano % 400) == 0) {
			return true;
		}
		if ((ano % 100 == 0)) {
			return false;
		}
		if ((ano % 4) == 0) {
			return true;
		}
		
		return false;
	}

}
