package br.pro.hashi.ensino.desagil.decalc.model;

public class NotGate extends Calculator{
	
	private NandGate nand1;
		
	public NotGate(){
		super("NotGate");
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
	public double calculate(double weight, double radius) {
		return 0;
	}
}