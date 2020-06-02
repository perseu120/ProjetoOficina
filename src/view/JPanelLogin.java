
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author willi
 */
public class JPanelLogin extends JPanel {

	
	// ### Inicio declara��o de vari�veis ###
    private JButton jButonEntrar = null;    
    
    private JPanel jPanelCentroHead;
    private JPanel jPanelHead;    
    private JPanel jPanelImagemFundoTela; 
    
    private JLabel jLabelIcon;
    private JLabel jLabelDescricao;
    private JLabel jLabelUsuario;
    private JLabel jLabelSenha;    
    private JLabel jLabelSenhaErro;
    private JLabel jLabelImagemCentroHead;
    private JLabel jLabelImageFundoPainelPrincipal; 
    
    private JTextField jTextFieldUsuario;    
    private JPasswordField jPasswordFieldSenha;
    
    // ### Fim dlecara��o de vari�veis ###
    
 
    public JPanelLogin() {
    	initComponents(); // inicializa os componentes da JFrame.
	}

	private void initComponents() {
		this.getjPanelImagemFundoTela();//imagem do fundo
    	this.addComponentesjPanelImagemFundoTela(); // adiciona componentes da imagem de fundo do jpanellogin
    	this.getjPanelCentroHead(); // painel do centro da tela de login
    	this.addComponentesjPanelCentroHead(); // adicionas os componentes no painel do centro
    	this.getjPanelHead(); //retorna o painel que armazena o painel da imagem do fundo setado com gridbeglayout
    	this.addComponentesjPanelHead();//adiciona os componentes do painel do fundo ( o painel do centro � adicionado aqui )
    	this.getJPanelLgoin(); // inicializa��o dos componentes da classe atual
    	this.addComponetesJPanelLogin(); // adiciona os paineis na classe atual
    }
	
    // ### Inicio dos gets dos jButtons ###
    
    public JButton getjButtonEntrar() {
    	
    	if(jButonEntrar == null) {
    		jButonEntrar = new JButton();
    		jButonEntrar.setFont(new Font("Arial", Font.BOLD, 24));
            jButonEntrar.setText("Entrar");
            jButonEntrar.setSize(118,37);
            jButonEntrar.setBorder(UIManager.getBorder("CheckBox.border"));
    	}
    	
    	return jButonEntrar;
    }

	// ### Final dos gets dos botoes ###
    // ---------------------------------	
	// ### Inicio  dos get dos label ###    
	
	public JLabel getjLabelImageFundoPainelPrincipal() { // imagem do fundo
		if(jLabelImageFundoPainelPrincipal == null){
			jLabelImageFundoPainelPrincipal = new JLabel();
			jLabelImageFundoPainelPrincipal.setOpaque(true);
		}	
		return jLabelImageFundoPainelPrincipal;
	}
	

	public JLabel getjLabelImagemCentroHead() { // imagem do painel do centro
		if(jLabelImagemCentroHead == null){	
			jLabelImagemCentroHead = new JLabel();
			jLabelImagemCentroHead.setSize(348,473);
		}	
		return jLabelImagemCentroHead;
	}
	
	
	public JLabel getjLabelIcon() { // incone do painel do centro ( ou incone do projeto )
		if(jLabelIcon == null){	
			jLabelIcon = new JLabel();
			jLabelIcon.setSize(110,110);
		}	
		return jLabelIcon;
	}
		
	public JLabel getjLabelDescricao() { // titulo do projeto
		if(jLabelDescricao == null) {
			jLabelDescricao = new JLabel();
			jLabelDescricao.setForeground(SystemColor.controlHighlight);
			jLabelDescricao.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
			jLabelDescricao.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelDescricao.setText("Workshop Manager");
			jLabelDescricao.setSize(344,35);
		}
		return jLabelDescricao;
	}
	
	
	public JLabel getjLabelSenha() { // nome do campo "senha "
		if(jLabelSenha == null){	
			jLabelSenha = new JLabel();
			jLabelSenha.setForeground(SystemColor.controlHighlight);
			jLabelSenha.setHorizontalAlignment(SwingConstants.TRAILING);
			jLabelSenha.setFont(new Font("Arial", Font.BOLD, 24));
			jLabelSenha.setText("Senha :");
			jLabelSenha.setSize(110,37);
		}	
		return jLabelSenha;
	}

	
	public JLabel getjLabelSenhaErro() { // nome com erro de senha que ficara invisivel ate a senha ser errada
		
		if(jLabelSenhaErro == null){
			
			jLabelSenhaErro = new JLabel();
			jLabelSenhaErro.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelSenhaErro.setFont(new Font("Tahoma", Font.PLAIN, 19));
			jLabelSenhaErro.setForeground(Color.RED);
			jLabelSenhaErro.setText("Usu�rio ou senha incorretos");
			jLabelSenhaErro.setSize(344,28);
			jLabelSenhaErro.setVisible(false);
		}
		
		return jLabelSenhaErro;
	}
	
	
	public JLabel getjLabelUsuario() { // nome do campo que esta com "usuario"
		if(jLabelUsuario == null){	
			jLabelUsuario = new JLabel();
			jLabelUsuario.setForeground(SystemColor.controlHighlight);
			jLabelUsuario.setHorizontalAlignment(SwingConstants.TRAILING);
			jLabelUsuario.setFont(new Font("Arial", Font.BOLD, 24));
			jLabelUsuario.setText("Usu\u00E1rio :");
			jLabelUsuario.setSize(110,37);
		}	
		return jLabelUsuario;
	}

	
	// ### Fim  dos  gets dos  jLabel ###
	// ---------------------------------
	// ### Inicio dos gets do jPanel ###
	
	public JPanelLogin getJPanelLgoin() { //setando a propria tela
		this.setLayout(new OverlayLayout(this));
        this.setPreferredSize(new java.awt.Dimension(800, 600));        
		return this;
	}
	
	
	public JPanel getjPanelImagemFundoTela() {// paienl que tem a imagem dentro
		if(jPanelImagemFundoTela == null) {
			jPanelImagemFundoTela = new JPanel();
			jPanelImagemFundoTela.setLayout(new BorderLayout(0,0));			
			jPanelImagemFundoTela.setOpaque(false);
		}
		return jPanelImagemFundoTela;
	}
	
	
	public JPanel getjPanelCentroHead() {
		if(jPanelCentroHead == null){	
			jPanelCentroHead = new JPanel();			
			jPanelCentroHead.setLayout(null);
			jPanelCentroHead.setOpaque(false);
		}	
		return jPanelCentroHead;
	}
	
	
	public JPanel getjPanelHead() {		
		if(jPanelHead == null){	
			jPanelHead = new JPanel();
			GridBagLayout layout = new GridBagLayout();
			jPanelHead.setLayout(layout);
			jPanelHead.setBackground(Color.CYAN);
			jPanelHead.setPreferredSize(null);
			jPanelHead.setOpaque(false);		
			
		}	
		return jPanelHead;
	}	

	
	// ### Fim    dos     gets    dos    paineis ###
	// ---------------------------------------------
	// ### Inicios dos gets textfild e derivados ###

	public JTextField getjTextFieldUsuario() {
		if(jTextFieldUsuario == null){	
			jTextFieldUsuario = new JTextField();
			jTextFieldUsuario.setFont(new Font("Arial", Font.BOLD, 25));
			jTextFieldUsuario.setSize(178,37);
		}	
		return jTextFieldUsuario;
	}
	

	public JPasswordField getjPasswordFieldSenha() {
		if(jPasswordFieldSenha == null){	
			jPasswordFieldSenha = new JPasswordField();
			jPasswordFieldSenha.setFont(new Font("Arial", Font.BOLD, 24));
			jPasswordFieldSenha.setSize(178,37);
		}	
		return jPasswordFieldSenha;
	}

	// ### Fim   dos   gets   textfild   e   derivados ###
	// ---------------------------------------------------
	// ### Inicio dos m�todos de adi��o de componentes ###
	
	public void addComponetesJPanelLogin() {
		this.add(this.getjPanelHead());
		this.add(this.getjPanelImagemFundoTela());					
	}
	
	
	public void addComponentesjPanelImagemFundoTela() {		
		this.getjPanelImagemFundoTela().add(BorderLayout
				.CENTER,this.getjLabelImageFundoPainelPrincipal()); // Add da jLabel no JPanel.
	}

	
	public void addComponentesjPanelHead() {
		GridBagConstraints constraints = new GridBagConstraints(); // variavel que coloca as posi�oes e componentes do Gridbeglayout
		constraints.ipadx = 350;
		constraints.ipady = 475;
		jPanelHead.add(this.getjPanelCentroHead(), constraints);// adicionando o componente no centro da gridbeg 
	}
	
	
	public void addComponentesjPanelCentroHead() { //inicializa��o dos compontes da tela
				
		this.getjLabelIcon().setLocation(120, 20);
		this.getjPanelCentroHead().add(this.getjLabelIcon());
		
		this.getjLabelDescricao().setLocation(3, 140);
		this.getjPanelCentroHead().add(this.getjLabelDescricao());
		
		this.getjLabelUsuario().setLocation(20, 240);
		this.getjPanelCentroHead().add(this.getjLabelUsuario());
		
		this.getjTextFieldUsuario().setLocation(147, 242);
		this.getjPanelCentroHead().add(this.getjTextFieldUsuario());
		
		this.getjLabelSenha().setLocation(20,305);
		this.getjPanelCentroHead().add(this.getjLabelSenha());
		
		this.getjPasswordFieldSenha().setLocation(147, 308);
		this.getjPanelCentroHead().add(this.getjPasswordFieldSenha());
		
		this.getjLabelSenhaErro().setLocation(3,375);
		this.getjPanelCentroHead().add(this.getjLabelSenhaErro());
		
		this.getjButtonEntrar().setLocation(210, 418);
		this.getjPanelCentroHead().add(this.getjButtonEntrar());
		
		this.getjLabelImagemCentroHead().setLocation(1, 1);
		this.getjPanelCentroHead().add(this.getjLabelImagemCentroHead());
		
	}	

	// ### Final dos m�todos de adi��o de componentes ###
}