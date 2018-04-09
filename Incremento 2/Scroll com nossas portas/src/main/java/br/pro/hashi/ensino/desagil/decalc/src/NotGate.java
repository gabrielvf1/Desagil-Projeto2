package br.pro.hashi.ensino.desagil.decalc.src;

public class NotGate extends Gate{
	
	private NandGate nand1;
		
	public NotGate(){
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
}