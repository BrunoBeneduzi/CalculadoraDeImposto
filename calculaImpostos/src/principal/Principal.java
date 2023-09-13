package principal;

import calculadora.CalculadoraDeImposto;
import dinheiroAtual.Dinheiro;
import impostos.Inss;
import impostos.Pis;

public class Principal {

	public static void main(String[] args) {
		Dinheiro saldo = new Dinheiro(1000);
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		System.out.println(calculadora.calculadora(saldo, new Pis()));
		System.out.println(calculadora.calculadora(saldo, new Inss()));
	}

}
