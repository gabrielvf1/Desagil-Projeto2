package br.pro.hashi.ensino.desagil.decalc.model;

public class CFCCalculator extends Calculator {
	public CFCCalculator() {
		super("CFC");
	}

	@Override
	public double calculate(double weight, double radius) {
		double side = 2 * radius * Math.sqrt(2);

		double volume = side * side * side;

		return 4 * weight / (602.2 * volume);
	}
}
