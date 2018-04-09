package br.pro.hashi.ensino.desagil.decalc.src;

public class AndGate extends Gate{

	private NandGate nand1;
	private NandGate nand2;

	public AndGate(){
		nand1 = new NandGate();
		nand2 = new NandGate();
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