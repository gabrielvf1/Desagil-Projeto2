package br.pro.hashi.ensino.desagil.decalc.model;

public class OrGate extends Calculator {
	private NandGate nand1;
	private NandGate nand2;
	private NandGate nand3;

	public OrGate(){
		super("OrGate");
		nand1 = new NandGate();
		nand2 = new NandGate();
		nand3 = new NandGate();
			
	}
	@Override
	public void connect(int pinIndex, Emitter emitter) {
		if (pinIndex == 0){
			
			nand1.connect(0,emitter);
			nand1.connect(1, emitter);
		}else{
			
			nand2.connect(0,emitter);
			nand2.connect(1, emitter);
		}
		
		nand3.connect(0,nand1);
		nand3.connect(1,nand2);

	}
	@Override
	public boolean read() {
		return nand3.read();

	}
	@Override
	public double calculate(double weight, double radius) {
		// TODO Auto-generated method stub
		return 0;
	}




}