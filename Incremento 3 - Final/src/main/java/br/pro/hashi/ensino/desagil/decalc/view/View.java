package br.pro.hashi.ensino.desagil.decalc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.pro.hashi.ensino.desagil.decalc.model.Gate;

public class View extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;


	// As duas componentes do painel principal:
	// o menu e o subpainel de uma calculadora.
	private JComboBox<Gate> menu;
	private CalculatorView calculatorView;


	public View(LinkedList<Gate> model) {

		
		menu = new JComboBox<>();


		for(Gate gate: model) {
			menu.addItem(gate);
		}


		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		add(menu);

		addCalculatorView(0);

		menu.addActionListener(this);
	}



	private void addCalculatorView(int index) {
		Gate gate = menu.getItemAt(index);
		calculatorView = new CalculatorView(gate);
		add(calculatorView);
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		remove(calculatorView);
		int index = menu.getSelectedIndex();
		addCalculatorView(index);

		((JFrame) SwingUtilities.getRoot(this)).pack();
	}
}
