package br.pro.hashi.ensino.desagil.decalc.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CFCCalculatorTest {
	private CFCCalculator calculator;

	@Before
	public void setUp() {
		calculator = new CFCCalculator();
	}

	@Test
	public void aluminium() {
		double result = calculator.calculate(26.98, 0.143);
		assertEquals(2.71, result, 0.01);
	}

	@Test
	public void calcium() {
		double result = calculator.calculate(40.08, 0.197);
		assertEquals(1.54, result, 0.01);
	}

	@Test
	public void copper() {
		double result = calculator.calculate(63.55, 0.128);
		assertEquals(8.89, result, 0.01);
	}

	@Test
	public void gold() {
		double result = calculator.calculate(196.97, 0.144);
		assertEquals(19.36, result, 0.01);
	}

	@Test
	public void lead() {
		double result = calculator.calculate(207.2, 0.175);
		assertEquals(11.35, result, 0.01);
	}

	@Test
	public void nickel() {
		double result = calculator.calculate(58.69, 0.125);
		assertEquals(8.82, result, 0.01);
	}

	@Test
	public void platinum() {
		double result = calculator.calculate(195.08, 0.139);
		assertEquals(21.32, result, 0.01);
	}

	@Test
	public void silver() {
		double result = calculator.calculate(107.87, 0.144);
		assertEquals(10.6, result, 0.01);
	}
}
