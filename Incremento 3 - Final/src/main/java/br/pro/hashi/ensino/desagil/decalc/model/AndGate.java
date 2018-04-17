package br.pro.hashi.ensino.desagil.decalc.model;

public class AndGate extends Gate{
	public AndGate() {
		super("AndGate", 2);
		nand1 = new NandGate();
		nand2 = new NandGate();
	}
	private NandGate nand1;
	private NandGate nand2;

	@Override
	public void connect(int pinIndex, Emitter emitter) {
			nand1.connect(pinIndex,emitter);
			nand1.connect(pinIndex,emitter);
		

		nand2.connect(0,nand1);
		nand2.connect(1,nand1);

	} 
	@Override
	public boolean read() {	
		return nand2.read();
	}
//	public boolean calculate(boolean IN1Box, boolean IN2Box) {
//		return IN1Box;
//	}
	@Override
	public boolean calculate(boolean IN1Box, boolean IN2Box) {
		AndGate and = new AndGate();
		Source source = new Source();
		Source source2 = new Source();
		source.turn(IN1Box);
		source2.turn(IN2Box);
		and.connect(0,  source);
		and.connect(1,  source2);
			return and.read();
	}
}