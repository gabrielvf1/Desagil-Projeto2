package br.pro.hashi.ensino.desagil.decalc.model;

public class NandGate extends Gate {
	private Emitter[] emitters;

	public NandGate() {
		super("NandGate", 2);
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
	public boolean calculate(boolean IN1Box, boolean IN2Box) {
		NandGate nand = new NandGate();
		Source source = new Source();
		Source source2 = new Source();
		source.turn(IN1Box);
		source2.turn(IN2Box);
		nand.connect(0,  source);
		nand.connect(1,  source2);
			return nand.read();
	}
}
