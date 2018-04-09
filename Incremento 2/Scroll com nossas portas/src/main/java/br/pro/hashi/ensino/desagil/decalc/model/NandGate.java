package br.pro.hashi.ensino.desagil.decalc.model;

public class NandGate extends Calculator {
	private Emitter[] emitters;

	public NandGate() {
		super("NandGate");
		emitters = new Emitter[2];
	}

	@Override
	public void connect(int pinIndex, Emitter emitter) {
		emitters[pinIndex] = emitter;
	}

	@Override
	public boolean read() {
		return !(emitters[0].read() && emitters[1].read());
	}

	@Override
	public double calculate(double weight, double radius) {
		// TODO Auto-generated method stub
		return 0;
	}
}
