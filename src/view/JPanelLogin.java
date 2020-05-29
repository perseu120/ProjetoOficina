



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Color;
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

/**
 *
 * @author willi
 */
public class JPanelLogin extends JPanel {

	
	// ### Inicio declaração de variáveis ###
    private JButton jButonEntrar = null;    
    
    private JPanel jPanelCentroHead;
    private JPanel jPanelHead;    
    private JPanel jPanelImagemFundoTela; 
    
    private JLabel jLabelIcon;
    private JLabel jLabelUsuario;
    private JLabel jLabelSenha;    
    private JLabel jLabelSenhaErro;
    private JLabel jLabelImagemPnl;
    private JLabel jLabelImageFundoPainelPrincipal; 
    
    private JTextField jTextFieldUsuario;    
    private JPasswordField jPasswordFieldSenha;
    
    // ### Fim dlecaração de variáveis ###
    
        
    
 
    public JPanelLogin() {
		// TODO Auto-generated constructor stub
    	this.getjPanelImagemFundoTela();
    	this.addComponentesjPanelImagemFundoTela();
    	this.getjPanelCentroHead();
    	this.addComponentesjPanelCentroHead();
    	this.getjPanelHead();
    	this.addComponentesjPanelHead();
    	this.getJPanelLgoin();
    	this.addComponetesJPanelLogin();
	}

	private void initComponents() {
    }
       /*     

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconPrj.png"))); // NOI18N
        jLabelIcon.setToolTipText("");
        jLabelIcon.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setInheritsPopupMenu(false);
        jLabelIcon.setMinimumSize(new java.awt.Dimension(110, 110));
        jLabelIcon.setPreferredSize(new java.awt.Dimension(380, 110));
        jLabelIcon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelCentroHead.add(jLabelIcon);
      

        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUsuario.setText("UsuÃ¡rio:");

        txfUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txfUsuario.setPreferredSize(new java.awt.Dimension(205, 55));

        jLabelSenha.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(204, 204, 204));
        jLabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSenha.setText("Senha:");

        jPasswordFieldSenha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPasswordFieldSenha.setPreferredSize(new java.awt.Dimension(205, 55));
      


        jLabelSenhaErro.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelSenhaErro.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSenhaErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSenhaErro.setText("UsuÃ¡rio e/ou senha iconrretos");
        jLabelSenhaErro.setToolTipText("");
        jLabelSenhaErro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSenhaErro.setPreferredSize(new java.awt.Dimension(380, 35));
        jLabelSenhaErro.setVisible(false);

       

     


       



       ;*/
    //     
    
    // ### Inicio dos gets dos botões ###
    
    public JButton getjButtonEntrar() {
    	
    	if(jButonEntrar == null) {
    		jButonEntrar = new JButton();
    		jButonEntrar.setFont(new java.awt.Font("Arial", 1, 26));
            jButonEntrar.setText("Entrar");
            jButonEntrar.setSize(100,37);
            jButonEntrar.setBorder(null);
    	}
    	
    	return jButonEntrar;
    }

	// ### Final dos gets dos botoes ###
    // ---------------------------------	
	// ### Inicio  dos get dos label ###
    
	public JLabel getjLabelIcon() {
		if(jLabelIcon == null){	
			jLabelIcon = new JLabel();
		}	
		return jLabelIcon;
	}
	

	public JLabel getjLabelImageFundoPainelPrincipal() {
		if(jLabelImageFundoPainelPrincipal == null){
			jLabelImageFundoPainelPrincipal = new JLabel();
			jLabelImageFundoPainelPrincipal.setOpaque(true);
		}	
		return jLabelImageFundoPainelPrincipal;
	}
	

	public JLabel getjLabelImagemPnl() {
		if(jLabelImagemPnl == null){	
			jLabelImagemPnl = new JLabel();
		}	
		return jLabelImagemPnl;
	}
	

	public JLabel getjLabelSenha() {
		if(jLabelSenha == null){	
			jLabelSenha = new JLabel();
		}	
		return jLabelSenha;
	}

	
	public JLabel getjLabelSenhaErro() {
		if(jLabelSenhaErro == null){
	
			jLabelSenhaErro = new JLabel();
		}	
		return jLabelSenhaErro;
	}
	
	
	public JLabel getjLabelUsuario() {
		if(jLabelUsuario == null){	
			jLabelUsuario = new JLabel();
		}	
		return jLabelUsuario;
	}
	
	// ### Fim  dos  gets dos  label ###
	// ---------------------------------
	// ### Inicio dos gets do painel ###
	
	public JPanelLogin getJPanelLgoin() {
		this.setLayout(new OverlayLayout(this));
        this.setPreferredSize(new java.awt.Dimension(800, 600));        
		return this;
	}
	
	
	public JPanel getjPanelImagemFundoTela() {
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
			jPanelCentroHead.setBackground(Color.BLUE);			
			jPanelCentroHead.setLayout(null);
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
		}	
		return jTextFieldUsuario;
	}
	

	public JPasswordField getjPasswordFieldSenha() {
		if(jPasswordFieldSenha == null){	
			jPasswordFieldSenha = new JPasswordField();
		}	
		return jPasswordFieldSenha;
	}

	// ### Fim   dos   gets   textfild   e   derivados ###
	// ---------------------------------------------------
	// ### Inicio dos métodos de adição de componentes ###
	
	public void addComponetesJPanelLogin() {
		this.add(this.getjPanelHead());
		this.add(this.getjPanelImagemFundoTela());					
	}
	
	
	public void addComponentesjPanelImagemFundoTela() {		
		this.getjPanelImagemFundoTela().add(BorderLayout
				.CENTER,this.getjLabelImageFundoPainelPrincipal()); // Add da jLabel no JPanel.
	}
	
	
	public void addComponentesjPanelHead() {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.ipadx = 350;
		constraints.ipady = 475;
		jPanelHead.add(this.getjPanelCentroHead(), constraints);
	}
	
	
	public void addComponentesjPanelCentroHead() {
		this.getjButtonEntrar().setLocation(220, 425);
		this.getjPanelCentroHead().add(this.getjButtonEntrar());
		
	}	

	
}