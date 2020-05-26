package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.JFramePrincipal;
import view.JPanelPrincipal;

public class ControlJPanelPrincipal implements MouseListener {
	
	private JFramePrincipal jFramePrincipal;
	private JPanelPrincipal jPanelPrincipal;
	
	private int cor1 = 103, cor2 = 103, cor3 = 103;
	
	public ControlJPanelPrincipal(JFramePrincipal jFramePrincipal, JPanelPrincipal jPanelPrincipal) {
		this.jFramePrincipal = jFramePrincipal;
		this.jPanelPrincipal = jPanelPrincipal;
		AddEvent();
		jButtonAnterior = getjPanelPrincipal().getjButtonHome();
	}
	
	
	private void AddEvent() {
		this.getjPanelPrincipal().getjButtonMenuBar().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonHome().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonOS().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonGerarOS().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonConsultarOS().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonOrcamento().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonVeiculos().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonClientes().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonFaturamento().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonAddUsuarios().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonConfiguracao().addMouseListener(this);
	}
	


	public JFramePrincipal getjFramePrincipal() {
		if(jFramePrincipal == null){
			jFramePrincipal = new JFramePrincipal();
		}
		return jFramePrincipal;
	}
	

	public JPanelPrincipal getjPanelPrincipal() {
		if(jPanelPrincipal == null){
			jPanelPrincipal = new JPanelPrincipal();
		}
		return jPanelPrincipal;
	}
	
	
	private void JPanel_Open_Close(JPanel panel, int width_close, int width_open, int height) {
		
		if(panel.getWidth() > 0) {			
		    panel.setSize(width_open, height);		    
			Thread thread = new Thread() {
								
				@Override
				public void run() {
					try {
						for (int i = width_open; i >= width_close; i--) {
							Thread.sleep(1);
							panel.setSize(i, height);
						}						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}					
				}
			};thread.start();
		
		}else {			
		    panel.setSize(width_close, height);		    
			Thread thread = new Thread() {	
				@Override
				public void run() {
					try {
						for (int i = width_close; i <= width_open; i++) {
							Thread.sleep(1);
							panel.setSize(i, height);
						}
						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			};thread.start();			
		}
	}


	@Override
	public void mouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonMenuBar()) { // Qando o JButton jButtonMenuBar for clicado:
			JPanel_Open_Close(getjPanelPrincipal().getjPanelWestMenuLateral(), 0, 265, 1100); // Abre ou fecha o jPanelWestMenuLateral
			//mudarCorJButton(getjPanelPrincipal().getjButtonMenuBar());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonHome()) { // Qando o JButton jbuttonHome for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonHome());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonOS()) { // Qando o JButton jButtonOS for clicado:
			if(getjPanelPrincipal().getjPanelJButtonOS().isVisible()) { // Deixa visivel ou não o jPanelJButtonOS
				getjPanelPrincipal().getjPanelJButtonOS().setVisible(false);
			}else {
				getjPanelPrincipal().getjPanelJButtonOS().setVisible(true);
			}
			mudarCorJButton(getjPanelPrincipal().getjButtonOS());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonGerarOS()) { // Qando o JButton jButtonGerarOS for clicado:
			
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonConsultarOS()) { // Qando o JButton jButtonConsultarOS for clicado:
			
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonOrcamento()) { // Qando o JButton jButtonOrcamento for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonOrcamento());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonVeiculos()) { // Qando o JButton jButtonVeiculos for clicado:
			JOptionPane.showMessageDialog(null, "deu ruim");
			mudarCorJButton(getjPanelPrincipal().getjButtonVeiculos());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonClientes()) { // Qando o JButton jButtonClientes for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonClientes());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonFaturamento()) { // Qando o JButton jButtonFaturamento for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonFaturamento());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonAddUsuarios()) { // Qando o JButton jButtonAddUsuarios for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonAddUsuarios());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonConfiguracao()) { // Qando o JButton jButtonConfiguracao for clicado:
			if(getjPanelPrincipal().getjPanelJButtonConfiguracao().isVisible()) { // Deixa visivel ou não o jPanelJButtonConfiguração
				getjPanelPrincipal().getjPanelJButtonConfiguracao().setVisible(false);
			}else {
				getjPanelPrincipal().getjPanelJButtonConfiguracao().setVisible(true);
			}	
			mudarCorJButton(getjPanelPrincipal().getjButtonConfiguracao());
		}
		
	}


	@Override
	public void mouseEntered(MouseEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getSource() == getjPanelPrincipal().getjButtonMenuBar()) { // Qando o JButton jButtonMenuBar for clicado:
			getjPanelPrincipal().getjButtonMenuBar().setBackground(new Color(109, 65, 0));
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonHome()) { // Qando o JButton jbuttonHome for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonHome());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonOS()) { // Qando o JButton jButtonOS for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonOS());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonGerarOS()) { // Qando o JButton jButtonGerarOS for clicado:
			
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonConsultarOS()) { // Qando o JButton jButtonConsultarOS for clicado:
			
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonOrcamento()) { // Qando o JButton jButtonOrcamento for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonOrcamento());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonVeiculos()) { // Qando o JButton jButtonVeiculos for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonVeiculos());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonClientes()) { // Qando o JButton jButtonClientes for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonClientes());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonFaturamento()) { // Qando o JButton jButtonFaturamento for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonFaturamento());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonAddUsuarios()) { // Qando o JButton jButtonAddUsuarios for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonAddUsuarios());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonConfiguracao()) { // Qando o JButton jButtonConfiguracao for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonConfiguracao());
		}
	}


	@Override
	public void mouseExited(MouseEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getSource() == getjPanelPrincipal().getjButtonMenuBar()) { // Qando o JButton jButtonMenuBar for clicado:
			getjPanelPrincipal().getjButtonMenuBar().setBackground(new Color(219, 131, 0));
		}
		
		
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	private JButton jButtonAnterior;
	
    private void mudarCorJButton(JButton jButton) {
    	jButton.setBackground(new Color(cor1,cor2,cor3));
    	if((jButtonAnterior != null)&&(jButtonAnterior != jButton)) {
    		jButtonAnterior.setBackground(new Color(51,51,51));
    	}
    	this.jButtonAnterior = jButton;
    }
    
    private JButton jButtonAnteriorEntered;
    
    private void mudarCorJButtonEntered(JButton jButton) { // Modifica a cor do jButton que o mouse "entrou"
    	jButton.setBackground(new Color(cor1,cor2,cor3));
    	getjPanelPrincipal().getjPanelJButtonOS().setVisible(false);
    	getjPanelPrincipal().getjPanelJButtonConfiguracao().setVisible(false);
    	if((jButtonAnteriorEntered != null)&&(jButtonAnteriorEntered != jButtonAnterior)) {
    		jButtonAnteriorEntered.setBackground(new Color(51,51,51));
    	}
    	this.jButtonAnteriorEntered = jButton;
    }


	/*private void btnClick(int num) {
		this.num = num;
		if (num != 1)
			this.setColor(51, 51, 51);
		int c = 103;
		int c1 = 103;
		int c2 = 103;
		switch (num) {
		case 1:
			this.JButtonMenuBar.setBackground(new Color(109, 65, 0));
			break;
		case 2:
			this.JButtonHome.setBackground(new Color(c, c1, c2));
			break;
		case 3:
			this.JButtonOS.setBackground(new Color(c, c1, c2));
			break;
		case 4:
			this.JButtonOrcamento.setBackground(new Color(c, c1, c2));
			break;
		case 5:
			this.JButtonVeiculos.setBackground(new Color(c, c1, c2));
			break;
		case 6:
			this.JButtonClientes.setBackground(new Color(c, c1, c2));
			break;
		case 7:
			this.JButtonAddUsuarios.setBackground(new Color(c, c1, c2));
			break;
		case 8:
			this.JButtonFaturamento.setBackground(new Color(c, c1, c2));
			break;

		case 9:
			this.JButtonConfiguracao.setBackground(new Color(c, c1, c2));
			break;
		}
	}

	private void setColor(int c, int c1, int c2) {
		this.JButtonHome.setBackground(new Color(c, c1, c2));
		this.JButtonOS.setBackground(new Color(c, c1, c2));
		this.JButtonOrcamento.setBackground(new Color(c, c1, c2));
		this.JButtonVeiculos.setBackground(new Color(c, c1, c2));
		this.JButtonClientes.setBackground(new Color(c, c1, c2));
		this.JButtonAddUsuarios.setBackground(new Color(c, c1, c2));
		this.JButtonFaturamento.setBackground(new Color(c, c1, c2));
		this.JButtonConfiguracao.setBackground(new Color(c, c1, c2));
	}

	private void mouseExited(JButton btn, int numEx) {
	
		if (num != numEx) {
			btn.setBackground(new Color(sc, sc1, sc2));
		}
	}
	*/
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
}
