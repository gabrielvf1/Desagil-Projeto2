package br.pro.hashi.ensino.desagil.decalc.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import br.pro.hashi.ensino.desagil.decalc.model.Gate;

public class CalculatorView extends SimplePanel implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;


	private Gate gate;
	private JCheckBox IN1Box;
	private JCheckBox IN2Box;
	private JCheckBox resultBox;
	private Color color;
	private Image image;

	public CalculatorView(Gate gate) {
		super(245, 300);
		this.gate = gate;
		JLabel entradas = new JLabel("Entradas");

		if (gate.size==1){
			IN1Box = new JCheckBox(""); 
			IN1Box.setSelected(true);
			IN2Box = new JCheckBox("");
			IN1Box.setSelected(false);
			
			
			add(entradas);
			add(IN1Box, 10, 10, 75, 25);
			IN1Box.addActionListener(this);
			resultBox = new JCheckBox("Resulto");
			add(resultBox, 10, 27, 75, 25);
			resultBox.setEnabled(false);
		}
		else{
			IN1Box = new JCheckBox(""); 
			IN1Box.setSelected(false);
			IN2Box = new JCheckBox("");
			IN1Box.setSelected(false);
			add(entradas);
			add(IN1Box, 10, 10, 75, 25);
			add(IN2Box, 10, 45, 75, 25);
			IN1Box.addActionListener(this);
			IN2Box.addActionListener(this);
			resultBox = new JCheckBox("Resulto");
			add(resultBox, 10, 27, 75, 25);
			resultBox.setEnabled(false);
			
		}
	

		update();
		color = Color.BLACK;
		String path = "/" + gate.toString() + ".png";
		URL url = getClass().getResource(path);
		image = new ImageIcon(url).getImage();
		addMouseListener(this);
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

	@Override
	public void mouseClicked(MouseEvent event) {

		int x = event.getX();
		int y = event.getY();

		if(x >= 195 && x < 235 && y >= 80 && y < 255) {

			color = JColorChooser.showDialog(this, null, color);

			
			repaint();
		}}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paintComponent(Graphics g) {

		// Não podemos esquecer desta linha, pois não somos os
		// únicos responsáveis por desenhar o painel, como era
		// o caso no Projeto 1. Agora é preciso desenhar também
		// componentes internas, e isso é feito pela superclasse.
		super.paintComponent(g);

		// Desenha a imagem passando posição e tamanho.
		// O último parâmetro pode ser sempre null.
		g.drawImage(image, 10, 80, 175, 175, null);

		// Desenha um retângulo cheio.
		g.setColor(color);
		g.fillRect(195, 80, 40, 175);

		// Evita bugs visuais em alguns sistemas operacionais.
		getToolkit().sync();
    }
	
}
