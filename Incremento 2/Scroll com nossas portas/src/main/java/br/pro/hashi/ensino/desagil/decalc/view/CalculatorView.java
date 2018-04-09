package br.pro.hashi.ensino.desagil.decalc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.pro.hashi.ensino.desagil.decalc.model.Gate;

// A classe JPanel representa um painel da interface gráfica,
// onde você pode adicionar componentes como menus e botões.
// Esta em particular representa o subpainel de uma calculadora.
// A interface ActionListener é explicada melhor mais abaixo.
public class CalculatorView extends JPanel implements ActionListener {

	// Não é necessário entender esta linha, mas se você estiver curioso
	// pode ler http://blog.caelum.com.br/entendendo-o-serialversionuid/.
	private static final long serialVersionUID = 1L;


//	private static final boolean IN1Box = true;
//
//
//	private static final boolean IN2Box = true;


	private Gate gate;

	// A classe JTextField representa um componente usado para digitação de texto.
	// https://docs.oracle.com/javase/tutorial/uiswing/components/textfield.html


	public CalculatorView(Gate gate) {
		this.gate = gate;

		// A classe JLabel representa um componente que é simplesmente texto fixo.
		// https://docs.oracle.com/javase/tutorial/uiswing/components/label.html
		JLabel entradas = new JLabel("Entradas");
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		if (gate.size==1){
			JCheckBox IN1Box = new JCheckBox("Entrada 1"); 
			IN1Box.setSelected(true);
			add(entradas);
			add(IN1Box);
			IN1Box.addActionListener(this);
		}
		else{
			JCheckBox IN1Box = new JCheckBox("Entrada 1"); 
			IN1Box.setSelected(false);
			JCheckBox IN2Box = new JCheckBox("Entrada 2");
			IN1Box.setSelected(false);
			add(entradas);
			add(IN1Box);
			add(IN2Box);
			IN1Box.addActionListener(this);
			IN2Box.addActionListener(this);
			
		}
	
		

		// Estabelece que este subpainel reage ao usuário digitar nos dois
		// primeiros campos. Isso só pode ser feito se este subpainel for
		// do tipo ActionListener, por isso ele implementa essa interface.


		// Estabelece que o terceiro campo está desativado, não é digitável.


		// Não podemos esquecer de chamar update na inicialização,
		// caso contrário a interface só ficará consistente depois
		// da primeira interação do usuário com os campos de texto.
		// A definição exata do método update é dada logo abaixo.
		update();
	}
	

	// Método que lê o peso e o raio dos primeiros campos,
	// calcula a densidade e a escreve no terceiro campo.
	private void update(){
		boolean IN1 = false;
		boolean IN2 = false;
//		ItemEvent e;
//		ItemSelectable source = e.getItemSelectable();
		
		JCheckBox resultBox = new JCheckBox("Resulto");
		add(resultBox);
		resultBox.setEnabled(false);
		
//		if (IN1Box.isSelected()){
//			IN1Box=true;
//		}
		try {
				
			}
			
		catch(NumberFormatException exception) {
			return;
		}

		boolean result = gate.calculate(IN1, IN2);
		resultBox.setSelected(result);
	}


	// Método exigido pela interface ActionListener, que representa
	// a reação a uma digitação do usuário nos dois primeiros campos.
	@Override
	public void actionPerformed(ActionEvent event) {
		
		update();
	}
	public void itemStateChanged(ItemEvent e) {
	    Object source = e.getItemSelectable();

	    if (source == IN1Box.) {
	        //...make a note of it...
	    } else if (source == glassesButton) {
	        //...make a note of it...
	    } else if (source == hairButton) {
	        //...make a note of it...
	    } else if (source == teethButton) {
	        //...make a note of it...
	    }

	    if (e.getStateChange() == ItemEvent.DESELECTED)
	        //...make a note of it...
	    ...
	    updatePicture();
	}
}
