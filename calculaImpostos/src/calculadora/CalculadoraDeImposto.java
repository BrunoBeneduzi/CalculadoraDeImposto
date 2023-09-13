package calculadora;

import dinheiroAtual.Dinheiro;
import interfaces.Imposto;

public class CalculadoraDeImposto {

	public double calculadora(Dinheiro dinheiro, Imposto tipo) {
		return tipo.calcula(dinheiro);
	}
}