package br.pro.hashi.ensino.desagil.decalc.model;

public abstract class Gate implements Emitter, Receiver {
	private String name;
	public double size;

	protected Gate(String name,double size) {
		this.name = name;
		this.size = size;
	}

	// Quando você ler a classe View, vai entender o nome deste método.
	public String toString() {
		return name;
	}

	public abstract boolean calculate(boolean IN1Box, boolean IN2Box);
}
