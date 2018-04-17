package br.pro.hashi.ensino.desagil.decalc;

import java.util.LinkedList;

import javax.swing.JFrame;

import br.pro.hashi.ensino.desagil.decalc.model.AndGate;
import br.pro.hashi.ensino.desagil.decalc.model.Gate;
import br.pro.hashi.ensino.desagil.decalc.model.NandGate;
import br.pro.hashi.ensino.desagil.decalc.model.NotGate;
import br.pro.hashi.ensino.desagil.decalc.model.OrGate;
import br.pro.hashi.ensino.desagil.decalc.model.XorGate;
import br.pro.hashi.ensino.desagil.decalc.view.View;

public class Decalc {
	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {

			
				LinkedList<Gate> model = new LinkedList<>();
				model.add(new AndGate());
				model.add(new NotGate());
				model.add(new NandGate());
				model.add(new OrGate());
				model.add(new XorGate());


				View view = new View(model);


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
