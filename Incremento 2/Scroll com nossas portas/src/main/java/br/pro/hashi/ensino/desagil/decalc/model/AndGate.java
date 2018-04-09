package br.pro.hashi.ensino.desagil.decalc.model;

public class AndGate extends Gate{
	public AndGate() {
		super("AndGate", 2);
	}
	private NandGate nand1;
	private NandGate nand2;

	@Override
	public boolean calculate(boolean IN1Box, boolean IN2Box) {
		return IN1Box;
	}
	@Override
	public void connect(int pinIndex, Emitter emitter) {
		if (pinIndex == 0){

			nand1.connect(0,emitter);
		}else{

			nand1.connect(1,emitter);
		}

		nand2.connect(0,nand1);
		nand2.connect(1,nand1);

	} 
	@Override
	public boolean read() {	
		return nand2.read();
	}
}