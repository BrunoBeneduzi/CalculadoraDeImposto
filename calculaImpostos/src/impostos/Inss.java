package impostos;

import dinheiroAtual.Dinheiro;
import interfaces.Imposto;

public class Inss implements Imposto {

	@Override
	public double calcula(Dinheiro dinheiro) {
		return dinheiro.getSaldo() * 0.1;
	}

}
