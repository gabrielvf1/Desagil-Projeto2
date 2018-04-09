package br.pro.hashi.ensino.desagil.decalc.model;

public class AndGate extends Calculator{
	public AndGate() {
		super("AndGate");
	}
	private NandGate nand1;
	private NandGate nand2;

	@Override
	public double calculate(double weight, double radius) {
		return 0;
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