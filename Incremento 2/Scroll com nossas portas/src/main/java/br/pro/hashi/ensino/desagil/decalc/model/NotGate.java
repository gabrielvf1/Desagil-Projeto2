package br.pro.hashi.ensino.desagil.decalc.model;

public class NotGate extends Gate{
	
	private NandGate nand1;
		
	public NotGate(){
		super("NotGate", 1);
		nand1 = new NandGate();
	}

	@Override
	public void connect(int pinIndex, Emitter emitter) {
		nand1.connect(0,emitter);
		nand1.connect(1, emitter);
		
	} 
	@Override
	public boolean read() {	
		return nand1.read();
	}

	@Override
	public boolean calculate(boolean IN1Box, boolean IN2Box) {
		NotGate not = new NotGate();
		Source source = new Source();
		source.turn(IN1Box);
		not.connect(0,  source);
		
		
		
		return not.read();
	}
}