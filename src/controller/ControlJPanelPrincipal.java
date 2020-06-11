package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import view.*;

public class ControlJPanelPrincipal implements MouseListener, ComponentListener, WindowStateListener  {
	
	// ### Início declaração de variáveis ###
	
	private JFramePrincipal jFramePrincipal;
	private JPanelPrincipal jPanelPrincipal;
	private JScrollPaneGerarOS jScrollPaneGerarOS;
	
	private JButton jButtonAnterior; // Variável para guardar o jButton que foi clicado pela ultima vez
	private JButton jButtonAnteriorEntered; // Variavel que quada o jButton que o mouse entrou pela ultima vez
	private String telaAnterior; // Variavel que contem o titulo da ultima tela que foi aberta.
	
	private int cor1 = 103, cor2 = 103, cor3 = 103; // Cor dos jButtons quando e acionado algum evento de click ou entered.
	
	private final String img = "/images/fundoPreto2.jpg"; //imagem de fundo do jpanelCenterPrincipal(verificar se esta correto).
	
	// ### Fim dlecaração de  variáveis ###
    // ------------------------------------
	// ### Inicio de criação de objetos ###
    
    TelConf telConf = new TelConf();
    
    // ### Fim  da  criação  de objetos ###
    
	public ControlJPanelPrincipal(JFramePrincipal jFramePrincipal, JPanelPrincipal jPanelPrincipal) {		
				
		this.jFramePrincipal = jFramePrincipal;
		this.jPanelPrincipal = jPanelPrincipal;
		
		reajustaFrame(83); // Reajusta os jpanel para ocuparem completamente o jFrame
		
		AddEvent();
		
		this.jButtonAnterior = getjPanelPrincipal().getjButtonHome();
		
	}
	
	
	private void AddEvent() { // Método para adição de enventos aos componentes
		this.getjFramePrincipal().addComponentListener(this);
		this.getjFramePrincipal().addWindowStateListener(this);
		this.getjPanelPrincipal().getjScrollPaneButtonsWest().addMouseListener(this);
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
	
	
	public JScrollPaneGerarOS getjScrollPaneGerarOS() {
		if(jScrollPaneGerarOS == null){
			jScrollPaneGerarOS = new JScrollPaneGerarOS();
		}
		return jScrollPaneGerarOS;
	}	
	
	
	
	
	
	// --------------------------------------------------
	// ### Início  métodos de sobreposição utilizados ###
	
	@Override
	public void windowStateChanged(WindowEvent e) { // Quando o botão maximixar/restaurar tamanho for clicado.
		reajustaFrame(getjPanelPrincipal().getjPanelWestPrincipal().getWidth());		
	}
	
	
	@Override
	public void componentResized(ComponentEvent evt) { // Quando o jFrame for redimencionado.
		// TODO Auto-generated method stub
		
		if(evt.getSource() == getjFramePrincipal()) { // Quando a JFrame for redimencionada...
			reajustaFrame(getjPanelPrincipal().getjPanelWestPrincipal().getWidth());	
		}
		
	}
	
	
	@Override
	public void mouseExited(MouseEvent evt) { // Quando o ponteiro do mouse sair de um componente.
		// TODO Auto-generated method stub		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonMenuBar()) { // Qando o JButton jButtonMenuBar for clicado:
			getjPanelPrincipal().getjButtonMenuBar().setBackground(getjPanelPrincipal().getCorDaBarraMenuEButton());
		}		
		
		
		if(jButtonAnteriorEntered != null) {
			this.jButtonAnteriorEntered.setBackground(getjPanelPrincipal().getCorDosBotoesEMenuLateral());
			this.jButtonAnterior.setBackground(new Color(cor1,cor2,cor3));
		}		
		
		
		if(evt.getSource() == getjPanelPrincipal().getjScrollPaneButtonsWest()) {
			//getjPanelPrincipal().getjScrollPaneButtonsWest().setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
			//JOptionPane.showMessageDialog(null, "Deu certo");
		}
	}
	
	
	@Override
	public void mouseEntered(MouseEvent evt) { // Quando o ponteiro do mouse entrar em algum componente.
		// TODO Auto-generated method stub
		if(evt.getSource() == getjPanelPrincipal().getjButtonMenuBar()) { // Qando o JButton jButtonMenuBar for clicado:
			getjPanelPrincipal().getjButtonMenuBar().setBackground(new Color(0, 0, 85));
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
		
		
		if(evt.getSource() == getjPanelPrincipal().getjScrollPaneButtonsWest()) {
			//getjPanelPrincipal().getjScrollPaneButtonsWest().setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		}
	}
	
	
	@Override
	public void mouseClicked(MouseEvent evt) { // Quando algum componente for clicado.
		// TODO Auto-generated method stub		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonMenuBar()) { // Qando o JButton jButtonMenuBar for clicado:
			
			JPanel_Open_Close(getjPanelPrincipal().getjPanelWestPrincipal(), 83, 265, getjFramePrincipal()
					.getHeight()); // Abre ou fecha o jPanelWestMenuLateral			
		}
									
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonHome()) { // Qando o JButton jbuttonHome for clicado:
			
			questionar(getjPanelPrincipal().getjButtonHome(),null, "Deseja sair mesmo?", 
						getjPanelPrincipal().getjPanelHome(), null,null,null);			
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
			questionar(getjPanelPrincipal().getjButtonOS(), getjScrollPaneGerarOS().getStringTitulo(), "Deseja sair mesmo?", 
					null, getjScrollPaneGerarOS(),getjScrollPaneGerarOS().getStringTitulo(), getjScrollPaneGerarOS().getIconTitulo());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonConsultarOS()) { // Qando o JButton jButtonConsultarOS for clicado:
			
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonOrcamento()) { // Qando o JButton jButtonOrcamento for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonOrcamento());
		}
		
		
		if(evt.getSource() == getjPanelPrincipal().getjButtonVeiculos()) { // Qando o JButton jButtonVeiculos for clicado:
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

	// ### Final dos métodos de sobreposição  utilizados ###
	// --------------------------------------------------
	// ### Inicio    de     métodos     da     classe ###
	
	private void mudarCorJButton(JButton jButton) {
    	jButton.setBackground(new Color(cor1,cor2,cor3));
    	if((jButtonAnterior != null)&&(jButtonAnterior != jButton)) {
    		jButtonAnterior.setBackground(getjPanelPrincipal().getCorDosBotoesEMenuLateral());
    	}
    	this.jButtonAnterior = jButton;
    }    
    
    
    private void mudarCorJButtonEntered(JButton jButton) { // Modifica a cor do jButton que o mouse "entrou"
    	jButton.setBackground(new Color(cor1,cor2,cor3));
    	getjPanelPrincipal().getjPanelJButtonOS().setVisible(false);
    	getjPanelPrincipal().getjPanelJButtonConfiguracao().setVisible(false);
    	if((jButtonAnteriorEntered != null)&&(jButtonAnteriorEntered != jButtonAnterior)) {
    		jButtonAnteriorEntered.setBackground(getjPanelPrincipal().getCorDosBotoesEMenuLateral());
    	}
    	this.jButtonAnteriorEntered = jButton;
    }
    
    
    private void questionar(JButton jButton, String titulo, String mensagem, JPanel jPanel, JScrollPane jScrollPane, String string, ImageIcon icon) {
    	
    	if(getjPanelPrincipal().getAlteraJScrollPaneCentral() != null) {
    		
			Object[] options = { "Sim", "Não" }; // Texto dos botões da tela de alerta.
			
			int confimacao = JOptionPane.showOptionDialog(null, mensagem, this.telaAnterior,
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			if(confimacao == 0) { // se for confirmada a mensagem de alerta.
				
				if(jPanel == null) { // se foi passado um JScrollPane
					
					getjPanelPrincipal().alteraJScrollPaneCentral(jScrollPane, string, icon);
					
				}else { // Se foi passado um JPanel
					
					getjPanelPrincipal().alteraJScrollPaneCentral(jPanel);
					
				}
				
				mudarCorJButton(jButton); // Altera cor do JButtonHome, quando clicado.	
			}
			
			telaAnterior = titulo;
			
    	}else {
    		getjPanelPrincipal().alteraJScrollPaneCentral(jScrollPane, string, icon);
			mudarCorJButton(jButton); // Altera cor do JButtonHome, quando clicado.	

			JPanel_Open_Close(getjPanelPrincipal().getjPanelWestPrincipal(), 83, 265, 1100);
    	}
    }
    

    private void reajustaFrame(int width_menuLateral) { // Metodo para reajustar os jpanel da classe JPanelPrincipal
    	getjFramePrincipal().repaint();
    	getjFramePrincipal().invalidate();
    	
    	int width = getjFramePrincipal().getWidth();
    	int height = getjFramePrincipal().getHeight();
    	
    	getjPanelPrincipal().getjPanelWestPrincipal().setSize(width_menuLateral,height);
    	getjPanelPrincipal().getjPanelCenterPrincipal().setSize(width - width_menuLateral,height);
    	
		getjPanelPrincipal().validate();
		
    	telConf.iconRender(getjPanelPrincipal().getjLabelFundojPanelHome(), img); // seta imagem no tamanho da jLabel
    	
		getjPanelPrincipal().repaint();
		getjPanelPrincipal().validate();
    }
    
    
    private void JPanel_Open_Close(JPanel panel, int width_close, int width_open, int height) {		
		 
		if(panel.getWidth() > width_close) {
			
			getjPanelPrincipal().getjLabelIconeUsuario().setVisible(false);
			getjPanelPrincipal().getjLabelNomeUsuario().setVisible(false);
			
		    panel.setSize(width_open, height);		    
			Thread thread = new Thread() {
								
				@Override
				public void run() {					
					try {
						
						int iAnterior = width_open; // Guada o valor da variavel do for;
						
						for (int i = width_open; i >= width_close; i--) {
							
							Thread.sleep(1);
							
							if(iAnterior - i > 20) { // Faz a rederização da imagem de fundo a cada 20 pixels.
								telConf.iconRender(getjPanelPrincipal().getjLabelFundojPanelHome(), img); // seta imagem no tamanho da jLabel
								iAnterior = i;
							}	
							
							panel.setSize(i, height);
							
							getjPanelPrincipal().getjPanelCenterPrincipal().setBounds(panel.getWidth(), 0, getjFramePrincipal()
										.getWidth() - panel.getWidth(), height); // Seta a posião e o tamanho do jPanelCenterPrincipal a cada loop do for
							
							panel.repaint();
							getjPanelPrincipal().getjPanelCenterPrincipal().repaint();
							
							panel.validate();
							getjPanelPrincipal().getjPanelCenterPrincipal().validate();
							
						}
						
						telConf.iconRender(getjPanelPrincipal().getjLabelFundojPanelHome(), img); // seta imagem no tamanho da jLabel
						getjPanelPrincipal().getjScrollPaneButtonsWest().setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
						mudarCorTodosJButtons(new Color(5,5,5,0));						
						getjPanelPrincipal().getjPanelCenterPrincipal().repaint();
						getjPanelPrincipal().getjPanelCenterPrincipal().validate();
						
					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null, e);
						
					}					
				}
			};
			thread.start();
		
		}else {			
			
			panel.setSize(width_close, height);					
			Thread thread = new Thread() {	
				@Override
				public void run() {
					try {
						
						int iAnterior = width_close; // Guada o valor da variavel do for;
						
						for (int i = width_close; i <= width_open; i++) {
							
							Thread.sleep(1);
							
							if(i - iAnterior > 20) { // Faz a rederização da imagem de fundo a cada 20 pixels.
								telConf.iconRender(getjPanelPrincipal().getjLabelFundojPanelHome(), img); // seta imagem no tamanho da jLabel
								iAnterior = i;
							}	
							
							panel.setSize(i, height);
							
							getjPanelPrincipal().getjPanelCenterPrincipal().setBounds(panel.getWidth(), 0, getjFramePrincipal()
										.getWidth() - panel.getWidth(), height); // Seta a posião e o tamanho do jPanelCenterPrincipal a cada loop do for
							
							panel.repaint();
							getjPanelPrincipal().getjPanelCenterPrincipal().repaint();
							
							panel.validate();
							getjPanelPrincipal().getjPanelCenterPrincipal().validate();
							
						}
						
						telConf.iconRender(getjPanelPrincipal().getjLabelFundojPanelHome(), img); // seta imagem no tamanho da jLabel
						getjPanelPrincipal().getjScrollPaneButtonsWest().setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
						getjPanelPrincipal().getjLabelIconeUsuario().setVisible(true);
						getjPanelPrincipal().getjLabelNomeUsuario().setVisible(true);
						mudarCorTodosJButtons(new Color(204,204,204));
						getjPanelPrincipal().getjPanelCenterPrincipal().repaint();
						getjPanelPrincipal().getjPanelCenterPrincipal().validate();
						

					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			};
			thread.start();			
		}
	}	
    
    
    private void mudarCorTodosJButtons(Color color) {
    	getjPanelPrincipal().getjButtonHome().setForeground(color);
    	getjPanelPrincipal().getjButtonOS().setForeground(color);
    	getjPanelPrincipal().getjButtonGerarOS().setForeground(color);
    	getjPanelPrincipal().getjButtonConsultarOS().setForeground(color);
    	getjPanelPrincipal().getjButtonOrcamento().setForeground(color);
    	getjPanelPrincipal().getjButtonVeiculos().setForeground(color);
    	getjPanelPrincipal().getjButtonClientes().setForeground(color);
    	getjPanelPrincipal().getjButtonAddUsuarios().setForeground(color);
    	getjPanelPrincipal().getjButtonFaturamento().setForeground(color);
    	getjPanelPrincipal().getjButtonConfiguracao().setForeground(color);
    }
    
    // ### Final de métodos da classe ###
    // -------------------------------
    // ### Início dos métodos de sobreposião, não utilizados ###
    
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	} 
    
    // ### Final dos métodos de sobreposição não utilizados ###
    
}
