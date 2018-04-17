package br.pro.hashi.ensino.desagil.decalc.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CCCCalculatorTest {
	private CCCCalculator calculator;

	@Before
	public void setUp() {
		calculator = new CCCCalculator();
	}

	@Test
	public void barium() {
		double result = calculator.calculate(137.33, 0.217);
		assertEquals(3.62, result, 0.01);
	}

	@Test
	public void cesium() {
		double result = calculator.calculate(132.91, 0.265);
		assertEquals(1.92, result, 0.01);
	}

	@Test
	public void chromium() {
		double result = calculator.calculate(52, 0.125);
		assertEquals(7.18, result, 0.01);
	}

	@Test
	public void iron() {
		double result = calculator.calculate(55.85, 0.124);
		assertEquals(7.9, result, 0.01);
	}

	@Test
	public void lithium() {
		double result = calculator.calculate(6.94, 0.152);
		assertEquals(0.53, result, 0.01);
	}

	@Test
	public void molybdenum() {
		double result = calculator.calculate(95.94, 0.136);
		assertEquals(10.28, result, 0.01);
	}

	@Test
	public void niobium() {
		double result = calculator.calculate(92.91, 0.143);
		assertEquals(8.56, result, 0.01);
	}

	@Test
	public void potassium() {
		double result = calculator.calculate(39.1, 0.231);
		assertEquals(0.85, result, 0.01);
	}

	@Test
	public void sodium() {
		double result = calculator.calculate(22.99, 0.186);
		assertEquals(0.96, result, 0.01);
	}

	@Test
	public void tungsten() {
		double result = calculator.calculate(183.84, 0.137);
		assertEquals(19.27, result, 0.01);
	}

	@Test
	public void vanadium() {
		double result = calculator.calculate(50.94, 0.132);
		assertEquals(5.97, result, 0.01);
	}
}
