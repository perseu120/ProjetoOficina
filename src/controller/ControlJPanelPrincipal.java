package controller;

import static java.awt.Frame.MAXIMIZED_BOTH;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import view.*;

public class ControlJPanelPrincipal implements MouseListener, MouseMotionListener, ComponentListener, WindowStateListener  {
	
	// ### Início declaração de variáveis ###
	
	private JFramePrincipal jFramePrincipal;
	private JPanelPrincipal jPanelPrincipal;
	private JPanelOS jPanelOS;
	
	private Color corJButtonEntered = new Color(79,79,79);
	
	private JButton jButtonAnterior; // Variável para guardar o jButton que foi clicado pela ultima vez
	private JButton jButtonAnteriorEntered; // Variavel que quada o jButton que o mouse entrou pela ultima vez
	private String telaAnterior; // Variavel que contem o titulo da ultima tela que foi aberta.
	private boolean isReset_Tamaho ; // Variavel que recebe true quando o jbutton reset tamanho é clicado
	private int xMouseTela; // Recebe a posição x do ponteiro do mouse no JFrame
	private int yMouseTela; // Recebe a posição y do ponteiro do mouse no JFrame
	private int x; // Recebe a posição x do ponteiro do mouse na tela
	private int y; // Recebe a posição y do ponteiro do mouse na tela
	int wdhx = 0;
	int hgty = 0;
	
	private int cor1 = 79, cor2 = 79, cor3 = 79; // Cor dos jButtons quando e acionado algum evento de click ou entered.
	
	private final String img = "/images/fundoPreto2.jpg"; //imagem de fundo do jpanelCenterPrincipal(verificar se esta correto).
	
	// ### Fim dlecaração de  variáveis ###
    // ------------------------------------
	// ### Inicio de criação de objetos ###
    
    TelConf telConf = new TelConf();
    
    // ### Fim  da  criação  de objetos ###
    
	public ControlJPanelPrincipal(JFramePrincipal jFramePrincipal, JPanelPrincipal jPanelPrincipal) {		
				
		this.jFramePrincipal = jFramePrincipal;
		this.jPanelPrincipal = jPanelPrincipal;
		
		telConf.iconRender(getjPanelPrincipal().getjLabelLogoProjeto(), "/images/iconPrj.png", 55, 55);
		
		reajustaFrame(83); // Reajusta os jpanel para ocuparem completamente o jFrame
		
		AddEvent();
		
		this.jButtonAnterior = getjPanelPrincipal().getjButtonHome();
		this.isReset_Tamaho = false;
		this.xMouseTela = 0;
		this.yMouseTela = 0;
		
	}
	
	
	private void AddEvent() { // Método para adição de enventos aos componentes
		this.getjFramePrincipal().addComponentListener(this);
		this.getjFramePrincipal().addWindowStateListener(this);
		this.getjFramePrincipal().addMouseMotionListener(this);
		this.getjPanelPrincipal().getjScrollPaneButtonsWest().addMouseListener(this);
		this.getjPanelPrincipal().getjPanelNorthCenter().addMouseListener(this);
		this.getjPanelPrincipal().getjPanelNorthCenter().addMouseMotionListener(this);
		this.getjPanelPrincipal().getjButtonMenuBar().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonMinimiza().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonRedimenciona().addMouseListener(this);
		this.getjPanelPrincipal().getjButtonFecharPrograma().addMouseListener(this);
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
	
	
	public JPanelOS getjPanelOS() {
		if(jPanelOS == null){
			jPanelOS = new JPanelOS();
		}
		return jPanelOS;
	}	
	
	
	
	
	
	// --------------------------------------------------
	// ### Início  métodos de sobreposição utilizados ###
	
	@Override
	public void windowStateChanged(WindowEvent e) { // Quando o botão maximixar/restaurar tamanho for clicado.
		reajustaFrame(getjPanelPrincipal().getjPanelWestPrincipal().getWidth());		
	}
	
	
	@Override
	public void componentResized(ComponentEvent e) { // Quando o jFrame for redimencionado.
		// TODO Auto-generated method stub
		
		if(e.getSource() == getjFramePrincipal()) { // Quando a JFrame for redimencionada...
			reajustaFrame(getjPanelPrincipal().getjPanelWestPrincipal().getWidth());	
		}
		
	}
	
	
	@Override
	public void mouseExited(MouseEvent e) { // Quando o ponteiro do mouse sair de um componente.
		// TODO Auto-generated method stub		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonMenuBar()) { // Qando o JButton jButtonMenuBar for clicado:
			getjPanelPrincipal().getjButtonMenuBar().setBackground(getjPanelPrincipal().getCorDaBarraMenuEButton());
		}	
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonMinimiza()) {
			getjPanelPrincipal().getjButtonMinimiza().setBackground(getjPanelPrincipal().getCorDaBarraMenuEButton());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonRedimenciona()) {
			getjPanelPrincipal().getjButtonRedimenciona().setBackground(getjPanelPrincipal().getCorDaBarraMenuEButton());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonFecharPrograma()) {
			getjPanelPrincipal().getjButtonFecharPrograma().setBackground(getjPanelPrincipal().getCorDaBarraMenuEButton());
		}
		
		
		if(jButtonAnteriorEntered != null) { // Método que desmarca cor do jButton que o ponteiro do mouse entrou anteriormente
			this.jButtonAnteriorEntered.setBackground(getjPanelPrincipal().getCorDosBotoesEMenuLateral());
			this.jButtonAnterior.setBackground(new Color(cor1,cor2,cor3));
		}		
		
		
		if(e.getSource() == getjPanelPrincipal().getjScrollPaneButtonsWest()) {
			//getjPanelPrincipal().getjScrollPaneButtonsWest().setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
			//JOptionPane.showMessageDialog(null, "Deu certo");
		}
	}
	
	
	@Override
	public void mouseEntered(MouseEvent e) { // Quando o ponteiro do mouse entrar em algum componente.
		// TODO Auto-generated method stub
		
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonMenuBar()) { // Qando o JButton jButtonMenuBar for clicado:
			getjPanelPrincipal().getjButtonMenuBar().setBackground(corJButtonEntered);
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonMinimiza()) {
			getjPanelPrincipal().getjButtonMinimiza().setBackground(corJButtonEntered);
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonRedimenciona()) {
			getjPanelPrincipal().getjButtonRedimenciona().setBackground(corJButtonEntered);
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonFecharPrograma()) {
			getjPanelPrincipal().getjButtonFecharPrograma().setBackground(corJButtonEntered);
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonHome()) { // Qando o JButton jbuttonHome for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonHome());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonOS()) { // Qando o JButton jButtonOS for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonOS());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonGerarOS()) { // Qando o JButton jButtonGerarOS for clicado:
			
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonConsultarOS()) { // Qando o JButton jButtonConsultarOS for clicado:
			
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonOrcamento()) { // Qando o JButton jButtonOrcamento for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonOrcamento());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonVeiculos()) { // Qando o JButton jButtonVeiculos for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonVeiculos());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonClientes()) { // Qando o JButton jButtonClientes for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonClientes());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonFaturamento()) { // Qando o JButton jButtonFaturamento for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonFaturamento());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonAddUsuarios()) { // Qando o JButton jButtonAddUsuarios for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonAddUsuarios());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonConfiguracao()) { // Qando o JButton jButtonConfiguracao for clicado:
			mudarCorJButtonEntered(getjPanelPrincipal().getjButtonConfiguracao());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjScrollPaneButtonsWest()) {
			//getjPanelPrincipal().getjScrollPaneButtonsWest().setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		}
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) { // Quando algum componente for clicado.
		// TODO Auto-generated method stub		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonMenuBar()) { // Qando o JButton jButtonMenuBar for clicado:
			
			JPanel_Open_Close(getjPanelPrincipal().getjPanelWestPrincipal(), 83, 265, getjFramePrincipal()
					.getHeight()); // Abre ou fecha o jPanelWestMenuLateral			
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonMinimiza()) {
			getjFramePrincipal().setState(JFrame.ICONIFIED);
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonRedimenciona()) {
			
			if(!isReset_Tamaho) { // quando o jButtonRedimenciona for clicado para restaurar tamanho
				
				getjPanelPrincipal().getjButtonRedimenciona().setIcon(new ImageIcon(JPanelPrincipal
						.class.getResource("/icons/square_50.png")));
				getjFramePrincipal().setSize(getjFramePrincipal().getMinimumSize());
				getjFramePrincipal().setLocationRelativeTo(null);
				getjFramePrincipal().setExtendedState(JFrame.NORMAL);
				isReset_Tamaho = true;
				
			}else { // quando o jButtonRedimenciona for clicado para maximizar tela
				
				getjPanelPrincipal().getjButtonRedimenciona().setIcon(new ImageIcon(JPanelPrincipal
						.class.getResource("/icons/rest_tamanho.png")));
				getjFramePrincipal().setExtendedState(MAXIMIZED_BOTH);
				isReset_Tamaho = false;
			}
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonFecharPrograma()) { // Quando o jButtonFecharPrograma
				// for clicado o programa é encerrado.
			System.exit(0);
		}
									
		
		if(e.getSource() == getjPanelPrincipal().getjButtonHome()) { // Qando o JButton jbuttonHome for clicado:
			
			questionar(getjPanelPrincipal().getjButtonHome(),null, "Deseja sair mesmo?", 
						getjPanelPrincipal().getjPanelHome(), null,null,null);			
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonOS()) { // Qando o JButton jButtonOS for clicado:
			
			if(getjPanelPrincipal().getjPanelWestPrincipal().getWidth() <= 83) {
				JPanel_Open_Close(getjPanelPrincipal().getjPanelWestPrincipal(), 83, 265, getjFramePrincipal().getHeight());
			}
			if(getjPanelPrincipal().getjPanelJButtonOS().isVisible()) { // Deixa visivel ou não o jPanelJButtonOS
				getjPanelPrincipal().getjPanelJButtonOS().setVisible(false);
			}else {
				getjPanelPrincipal().getjPanelJButtonOS().setVisible(true);
				getjPanelPrincipal().getjPanelJButtonOS().repaint();
				getjPanelPrincipal().getjPanelJButtonOS().validate();
			}
			
			mudarCorJButton(getjPanelPrincipal().getjButtonOS());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonGerarOS()) { // Qando o JButton jButtonGerarOS for clicado:
			getjPanelPrincipal().alteraJScrollPaneCentral(getjPanelOS(), null);
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonConsultarOS()) { // Qando o JButton jButtonConsultarOS for clicado:
			
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonOrcamento()) { // Qando o JButton jButtonOrcamento for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonOrcamento());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonVeiculos()) { // Qando o JButton jButtonVeiculos for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonVeiculos());

		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonClientes()) { // Qando o JButton jButtonClientes for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonClientes());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonFaturamento()) { // Qando o JButton jButtonFaturamento for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonFaturamento());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonAddUsuarios()) { // Qando o JButton jButtonAddUsuarios for clicado:
			mudarCorJButton(getjPanelPrincipal().getjButtonAddUsuarios());
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjButtonConfiguracao()) { // Qando o JButton jButtonConfiguracao for clicado:
			
			if(getjPanelPrincipal().getjPanelJButtonConfiguracao().isVisible()) { // Deixa visivel ou não o jPanelJButtonConfiguração
				getjPanelPrincipal().getjPanelJButtonConfiguracao().setVisible(false);
			}else {
				getjPanelPrincipal().getjPanelJButtonConfiguracao().setVisible(true);
			}	
			
			mudarCorJButton(getjPanelPrincipal().getjButtonConfiguracao());
		}
		
	}	
	
	int var = 0;
	@Override
	public void mouseDragged(MouseEvent e) {
		
		if(e.getY() < 50) {
			getjPanelPrincipal().getjPanelNorthCenter().setCursor(new Cursor(Cursor.MOVE_CURSOR));
			Point point = new Point(e.getXOnScreen() - xMouseTela, e.getYOnScreen() - yMouseTela);
			getjFramePrincipal().setLocation(point);
		}
		
		
		if((e.getX() > (getjFramePrincipal().getWidth()-25)) && (e.getX() < (getjFramePrincipal().getWidth()+25))) {
			
			getjFramePrincipal().setCursor(new Cursor(Cursor.W_RESIZE_CURSOR));				
				
			System.out.println(e.getXOnScreen() +"/"+x+";"+(e.getXOnScreen() -x));
			
		}
	
	}


	@Override
	public void mouseMoved(MouseEvent e) { // Pega a posição do ponteiro do mouse quando tenta mover um componente
		
		xMouseTela = e.getX();
		yMouseTela = e.getY();
		x = e.getXOnScreen();
		y = e.getYOnScreen();
		wdhx = getjFramePrincipal().getWidth();
		hgty = getjFramePrincipal().getHeight();
		
	} 

	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == getjPanelPrincipal().getjPanelNorthCenter()) {
			getjPanelPrincipal().getjPanelNorthCenter().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			getjPanelPrincipal().getjPanelCenterPrincipal().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		
		
		if(e.getSource() == getjPanelPrincipal().getjPanelCenterPrincipal()) {
			
			getjPanelPrincipal().getjPanelCenterPrincipal().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
							
							//Thread.sleep(1);
							
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
						
						Thread.sleep(50);
						
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
							
							//Thread.sleep(0, 50);
							
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
						
						Thread.sleep(50);
						
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
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void componentHidden(ComponentEvent e) {
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
