package impostos;

import dinheiroAtual.Dinheiro;
import interfaces.Imposto;

public class Pis implements Imposto {

	@Override
	public double calcula(Dinheiro dinheiro) {
		return dinheiro.getSaldo() * 0.20;
	}

	
}