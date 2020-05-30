package controller;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.sun.javafx.embed.swing.Disposer;

import view.JFramePrincipal;
import view.JPanelLogin;
import view.JPanelPrincipal;
import view.TelConf;

public class ControlJPanelLogin implements ComponentListener, MouseListener {
	
	// ### Inicio declara��o de vari�veis ###
	
	private ControlJPanelPrincipal controlJPanelPrincipal;

	private JPanelPrincipal jPanelPrincipal;
	private JPanelLogin jPanelLogin;
	private JFramePrincipal jFramePricipal;
	
	// ### Fim dlecara��o de  vari�veis ###
    // ------------------------------------
	// ### Inicio de cria��o de objetos ###
    
    TelConf telConf = new TelConf();
    
    // ### Fim  da  cria��o  de objetos ###


    private final String img = "/images/funTel1.jpg";
    private final String img1 = "/images/funLogin.png";
    private final String img2 = "/images/iconPrj.png";
    
    
	public ControlJPanelLogin(JFramePrincipal jFramePricipal, JPanelLogin jPanelLogin) {		
		this.jPanelLogin = jPanelLogin;
		this.jFramePricipal = jFramePricipal;
		
		telConf.iconRender(getjFramePricipal(), getjPanelLogin()
				.getjLabelImageFundoPainelPrincipal(), img); // seta imagem no tamanho do jFrame
		getjPanelLogin().repaint();
		
		telConf.iconRender(getjPanelLogin().getjLabelImagemCentroHead(), img1); // seta imagem no tamanho da jLabel
		getjPanelLogin().repaint();
		
		telConf.iconRender(getjPanelLogin().getjLabelIcon(), img2); // seta imagem no tamanho da jLabel
		getjPanelLogin().repaint();
		
		AddEvent();
	}


	private void AddEvent() {
		getjFramePricipal().addComponentListener(this);	
		getjPanelLogin().getjButtonEntrar().addMouseListener(this);
	}
	
	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void componentResized(ComponentEvent evt) {
		// TODO Auto-generated method stub	

		if((evt.getSource() == getjFramePricipal()) // Quando a JFrame for redimencionada...
					&&  (getjFramePricipal().getjPanelAnterior() == getjPanelLogin())) { // E o JPanel setado na JFrame for "JPanelLogin"...
			telConf.iconRender(getjFramePricipal(), getjPanelLogin()
					.getjLabelImageFundoPainelPrincipal(), img); // Seta imagem no tamanho do jFrame.
			getjPanelLogin().repaint();			
		}		
	}
	

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
		
		if(evt.getSource() == getjPanelLogin().getjButtonEntrar()) {
			getjFramePricipal().alterarJPanel(getjPanelPrincipal());
			getControlJPanelPrincipal();
			
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
	
	



	public ControlJPanelPrincipal getControlJPanelPrincipal() {
		if(controlJPanelPrincipal == null){
			controlJPanelPrincipal = new ControlJPanelPrincipal(getjFramePricipal(),getjPanelPrincipal());
		}
		return controlJPanelPrincipal;
	}


	public JPanelPrincipal getjPanelPrincipal() {
		if(jPanelPrincipal == null){
			jPanelPrincipal = new JPanelPrincipal();
		}
		return jPanelPrincipal;
	}


	public JPanelLogin getjPanelLogin() {
		if(jPanelLogin == null){
			jPanelLogin = new JPanelLogin();
		}
		return jPanelLogin;
	}


	public JFramePrincipal getjFramePricipal() {
		if(jFramePricipal == null){
			jFramePricipal = new JFramePrincipal();
		}
		return jFramePricipal;
	}


}
