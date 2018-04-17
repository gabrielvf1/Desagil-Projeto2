package br.pro.hashi.ensino.desagil.decalc.model;

public class Source implements Emitter {
    private boolean on;

    public Source() {
        on = false;
    }

    public void turn(boolean on) {
        this.on = on;
    }

    @Override
    public boolean read() {
        return on;
    }
}