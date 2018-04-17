package br.pro.hashi.ensino.desagil.decalc.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.pro.hashi.ensino.desagil.decalc.model.Gate;

public class CalculatorView extends SimplePanel implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;


	private Gate gate;
	private JCheckBox IN1Box;
	private JCheckBox IN2Box;
	private boolean result;
	private Color color2;
	private Color color;
	private Image image;

	public CalculatorView(Gate gate) {
		super(320, 200);
		this.gate = gate;
		color2=Color.RED;
		JLabel entradas = new JLabel("Entradas");

		
		IN1Box = new JCheckBox(""); 
		IN1Box.setSelected(true);
		IN2Box = new JCheckBox("");
		IN1Box.setSelected(false);
		//resultBox = new JCheckBox("");
		
		if (gate.size==1){			
			add(entradas, 10, 10, 75, 25);
			add(IN1Box, 10, 80, 25, 25);
			//add(resultBox, 280, 120, 25, 25);
		}
		else{
			add(entradas, 10, 10, 75, 25);
			add(IN1Box, 10, 58, 25, 25);
			add(IN2Box, 10, 105, 25, 25);
			//add(resultBox, 211, 81, 25, 25);
			
		}
		
		IN1Box.addActionListener(this);
		IN2Box.addActionListener(this);
		
		//resultBox.setEnabled(false);

		update();
		
//		color = Color.BLACK;
		
		
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
		result = gate.calculate(IN1, IN2);
		//resultBox.setSelected(result);
		if(result==false){
			color=Color.BLACK;
			
			
		}
		else{
			color=color2;
			
		}
		repaint();
	}
	


	
	@Override
	public void actionPerformed(ActionEvent event) {
		update();
	}

	@Override
	public void mouseClicked(MouseEvent event) {

		// Descobre em qual posição o clique ocorreu.
		int x = event.getX();
		int y = event.getY();
		double comparando;
		int a = 215+15;
		int b = 79+15;
		comparando = Math.pow((x-a), 2)+ Math.pow((y-b), 2);
		
		//if(x >= 195&& x < 235 && y >= 80 && y < 255 && result == true) {
		if(comparando < 225 && result == true) {
			
			color = JColorChooser.showDialog(this, null, color);
			if (color == null){
				color=color2;
			}
			color2 = color;
					// ...e atualizamos a tela.
			repaint();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(image, 36, 44, 175, 100, null);
		g.setColor(color);
		g.fillOval(215,79, 30, 30);
		getToolkit().sync();
    }
}
