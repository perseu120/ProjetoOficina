package view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFramePrincipal extends JFrame{
	
	public JFramePrincipal() {
		
	}
	
	public void initicomponents() {
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(800,600));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void alterarJPanel(JPanel jPanel) {
		this.getContentPane().add(jPanel);
		this.repaint();
		this.validate();
	}

}
