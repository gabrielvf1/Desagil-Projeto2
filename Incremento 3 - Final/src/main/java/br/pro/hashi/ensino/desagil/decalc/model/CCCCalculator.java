package br.pro.hashi.ensino.desagil.decalc.model;

public class CCCCalculator extends Calculator {
	public CCCCalculator() {
		super("CCC");
	}

	@Override
	public double calculate(double weight, double radius) {
		double side = 4 * radius / Math.sqrt(3);

		double volume = side * side * side;

		return 2 * weight / (602.2 * volume);
	}
}
