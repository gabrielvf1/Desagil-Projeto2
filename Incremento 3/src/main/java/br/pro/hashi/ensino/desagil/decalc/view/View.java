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

// A classe JPanel representa um painel da interface gráfica,
// onde você pode adicionar componentes como menus e botões.
// Esta classe especificamente representa o painel principal.
// A interface ActionListener é explicada melhor mais abaixo.
public class View extends JPanel implements ActionListener {

	// Não é necessário entender esta linha, mas se você estiver curioso
	// pode ler http://blog.caelum.com.br/entendendo-o-serialversionuid/.
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
