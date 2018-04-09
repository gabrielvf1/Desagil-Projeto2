package br.pro.hashi.ensino.desagil.decalc;

import java.util.LinkedList;

import javax.swing.JFrame;

import br.pro.hashi.ensino.desagil.decalc.model.AndGate;
import br.pro.hashi.ensino.desagil.decalc.model.CCCCalculator;
import br.pro.hashi.ensino.desagil.decalc.model.CFCCalculator;
import br.pro.hashi.ensino.desagil.decalc.model.Calculator;
import br.pro.hashi.ensino.desagil.decalc.model.NandGate;
import br.pro.hashi.ensino.desagil.decalc.model.NotGate;
import br.pro.hashi.ensino.desagil.decalc.model.OrGate;
import br.pro.hashi.ensino.desagil.decalc.model.XorGate;
import br.pro.hashi.ensino.desagil.decalc.view.View;

public class Decalc {
	public static void main(String[] args) {

		// Estrutura básica de um programa Swing, já usada no Projeto 1.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {

				// Constrói o modelo.
				LinkedList<Calculator> model = new LinkedList<>();
				model.add(new AndGate());
				model.add(new NotGate());
				model.add(new NandGate());
				model.add(new OrGate());
				model.add(new XorGate());

				// Constrói a visão.
				View view = new View(model);

				// Configuração básica de uma janela Swing, já usada no Projeto 1.
				JFrame frame = new JFrame();
            	frame.setContentPane(view);
            	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	frame.setResizable(false);
            	frame.pack();
            	frame.setVisible(true);
			}
		});
	}
}
