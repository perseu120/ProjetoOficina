package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFramePrincipal extends JFrame{
	
	
	private JPanel jPanelAnterior;
	
	TelConf telConf = new TelConf();
	
	
	public JFramePrincipal() {
		telConf.fullScree(this);
		initicomponents();
	}
	
	
	public void initicomponents() {
		this.setTitle("Oficina 1.0");
		this.getContentPane().setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(800,600));
		this.setLocationRelativeTo(null);
		this.setBackground(Color.RED);
		this.setVisible(true);
	}
	
	
	public void alterarJPanel(JPanel jPanel) {
		if(getjPanelAnterior() != null) { // Condi��o para retirar jPanel do JFrame, caso haja algum.
			this.remove(getjPanelAnterior());
		}
		this.getContentPane().add(BorderLayout.CENTER,jPanel);
		this.repaint();
		this.validate();
		setjPanelAnterior(jPanel); // Guarda o jPanel que esta setado no jFrame.
	}
	
	
	public JPanel getjPanelAnterior() {
		return jPanelAnterior;
	}
	
	
	public void setjPanelAnterior(JPanel jPanel) {
		this.jPanelAnterior = jPanel;
	}

}
