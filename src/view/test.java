package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class test extends JPanel{
	

	JPanel jPanelJButtonOS;
	JButton jButtonGerarOS;
	JButton jButtonConsultarOS;
	public test() {
		
		this.getjButtonGerarOS();
		this.getjButtonConsultarOS();
		this.getjPanelJButtonOS();
		this.getJPanelButtonOSAddComponentes();
		this.setLayout(null);
		this.setBackground(Color.blue);
		this.setVisible(true);
		this.setPreferredSize(new Dimension(500,400));
		this.add(this.getjPanelJButtonOS());
		
	}
	
	public JButton getjButtonGerarOS() {
		if(jButtonGerarOS == null){
			jButtonGerarOS = new JButton();
			jButtonGerarOS.setBackground(new Color(204, 204, 204));
			jButtonGerarOS.setFont(new Font("Trebuchet MS", 1, 18)); 
			jButtonGerarOS.setText(" Gerar O.S.");
			jButtonGerarOS.setBorder(null);
			jButtonGerarOS.setBorderPainted(false);
			jButtonGerarOS.setContentAreaFilled(false);
			jButtonGerarOS.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonGerarOS.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonGerarOS.setOpaque(true);
		}
		return jButtonGerarOS;
	}



	public JButton getjButtonConsultarOS() {
		if(jButtonConsultarOS == null){
			jButtonConsultarOS = new JButton();
			jButtonConsultarOS.setBackground(new Color(204, 204, 204));
			jButtonConsultarOS.setFont(new Font("Trebuchet MS", 1, 18)); 
			jButtonConsultarOS.setText(" Consultar O.S.");
			jButtonConsultarOS.setBorder(null);
			jButtonConsultarOS.setBorderPainted(false);
			jButtonConsultarOS.setContentAreaFilled(false);
			jButtonConsultarOS.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonConsultarOS.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonConsultarOS.setOpaque(true);
		}
		return jButtonConsultarOS;
	}
	
	
	public void getJPanelButtonOSAddComponentes() {
		GroupLayout JPanelButtonOS_Layout = new GroupLayout(this.getjPanelJButtonOS());
		this.getjPanelJButtonOS().setLayout(JPanelButtonOS_Layout);
		JPanelButtonOS_Layout.setHorizontalGroup(
				JPanelButtonOS_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(JPanelButtonOS_Layout.createSequentialGroup().addGap(1, 1, 1)
								.addGroup(JPanelButtonOS_Layout
										.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.getjButtonGerarOS(), GroupLayout.PREFERRED_SIZE, 219,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(this.getjButtonConsultarOS(), GroupLayout.PREFERRED_SIZE, 219,
												GroupLayout.PREFERRED_SIZE))
								.addGap(1, 1, 1)));
		
		
		JPanelButtonOS_Layout.setVerticalGroup(
				JPanelButtonOS_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(JPanelButtonOS_Layout.createSequentialGroup().addGap(1, 1, 1)
								.addComponent(this.getjButtonGerarOS(), GroupLayout.PREFERRED_SIZE, 42,
										GroupLayout.PREFERRED_SIZE)
								.addGap(1, 1, 1).addComponent(this.getjButtonConsultarOS(), GroupLayout.PREFERRED_SIZE, 42,
										GroupLayout.PREFERRED_SIZE)
								.addGap(1, 1, 1)));
	}
	
	public JPanel getjPanelJButtonOS() {
		if(jPanelJButtonOS == null){
			jPanelJButtonOS = new JPanel();
			jPanelJButtonOS.setBackground(new Color(0, 0, 0));
			jPanelJButtonOS.setSize(220,86);
			jPanelJButtonOS.setRequestFocusEnabled(false);
			jPanelJButtonOS.setVisible(true);
		}
		return jPanelJButtonOS;
	}	

}
