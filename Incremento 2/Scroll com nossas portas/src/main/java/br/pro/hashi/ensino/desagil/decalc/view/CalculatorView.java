package br.pro.hashi.ensino.desagil.decalc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.pro.hashi.ensino.desagil.decalc.model.Gate;

public class CalculatorView extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;


	private Gate gate;
	private JCheckBox IN1Box;
	private JCheckBox IN2Box;
	private JCheckBox resultBox;

	public CalculatorView(Gate gate) {
		this.gate = gate;
		JLabel entradas = new JLabel("Entradas");
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		if (gate.size==1){
			IN1Box = new JCheckBox("Entrada 1"); 
			IN1Box.setSelected(true);
			IN2Box = new JCheckBox("Entrada 2");
			IN1Box.setSelected(false);
			
			
			add(entradas);
			add(IN1Box);
			IN1Box.addActionListener(this);
			resultBox = new JCheckBox("Resulto");
			add(resultBox);
			resultBox.setEnabled(false);
		}
		else{
			IN1Box = new JCheckBox("Entrada 1"); 
			IN1Box.setSelected(false);
			IN2Box = new JCheckBox("Entrada 2");
			IN1Box.setSelected(false);
			add(entradas);
			add(IN1Box);
			add(IN2Box);
			IN1Box.addActionListener(this);
			IN2Box.addActionListener(this);
			resultBox = new JCheckBox("Resulto");
			add(resultBox);
			resultBox.setEnabled(false);
			
		}
	

		update();
	}
	
	private void update(){
		boolean IN1 ;
		boolean IN2;

		
		try {
			IN1=IN1Box.isSelected();
			IN2=IN2Box.isSelected();
			
				
			}
			
		catch(NumberFormatException exception) {
			return;
		}

		boolean result = gate.calculate(IN1, IN2);
		resultBox.setSelected(result);
	}


	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		update();
	}
	
}
