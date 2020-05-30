



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
    private JLabel jLabelDescricao;
    private JLabel jLabelUsuario;
    private JLabel jLabelSenha;    
    private JLabel jLabelSenhaErro;
    private JLabel jLabelImagemCentroHead;
    private JLabel jLabelImageFundoPainelPrincipal; 
    
    private JTextField jTextFieldUsuario;    
    private JPasswordField jPasswordFieldSenha;
    
    // ### Fim dlecaração de variáveis ###
    
        
    
<<<<<<< HEAD
    public JPanelLogin() { // metodo construtor.
        initComponents(); // inicializa os componentes da JFrame.
        // Chama o metodo a baixo para renderizaÃ§Ã£o da imagem de fundo da tela
        // login.
        //this.imgJFrameLogin(true);
        // Metodo para configurar preferencias de componentes de JFrame.
        //this.inicializeAplication();
        this.add( getjLabelImageFundoPainelPrincipal() );
        
    }

 
    
    private void initComponents() {

        //this.setOpaque(false);
    	// this.add( getTelaConf().imageLabelRend( this , getjLabelImageFundoPainelPrincipal(), img) );
        
    	this.setLayout(new OverlayLayout(this));
        this.setPreferredSize(new java.awt.Dimension(800, 600));
        getjLabelImageFundoPainelPrincipal().setIcon(new ImageIcon(getClass().getResource(img)));
        this.add(getjPanelLogin());
        
        this.getjPanelLogin();
        this.addComponentesJPanelLogin();
        
        

        //this.add(getjButtonEntrar() );

    }
       /* jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(390, 500));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(null);

        jPanelLogin.setBackground(new java.awt.Color(28, 178, 188));
        jPanelLogin.setForeground(new java.awt.Color(168, 168, 168));
        jPanelLogin.setAutoscrolls(true);
        jPanelLogin.setOpaque(false);
        jPanelLogin.setPreferredSize(new java.awt.Dimension(390, 440));
        jPanelLogin.setLayout(new java.awt.BorderLayout());

        jPanelCentroLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelCentroLogin.setOpaque(false);

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconPrj.png"))); // NOI18N
        jLabelIcon.setToolTipText("");
        jLabelIcon.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setInheritsPopupMenu(false);
        jLabelIcon.setMinimumSize(new java.awt.Dimension(110, 110));
        jLabelIcon.setPreferredSize(new java.awt.Dimension(380, 110));
        jLabelIcon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelCentroLogin.add(jLabelIcon);

        jPanelLogin.add(jPanelCentroLogin, java.awt.BorderLayout.NORTH);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(380, 220));
        jPanel2.setRequestFocusEnabled(false);

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
      

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelSenha))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha))
                .addGap(32, 32, 32))
        );

        jPanelLogin.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(380, 105));

        jLabelSenhaErro.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelSenhaErro.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSenhaErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSenhaErro.setText("UsuÃ¡rio e/ou senha iconrretos");
        jLabelSenhaErro.setToolTipText("");
        jLabelSenhaErro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelSenhaErro.setPreferredSize(new java.awt.Dimension(380, 35));
        jLabelSenhaErro.setVisible(false);

       

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelSenhaErro, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(getJButtonEntrar(), javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelSenhaErro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getJButtonEntrar(), javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelLogin.add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel4.add(jPanelLogin);
        jPanelLogin.setBounds(0, 0, 390, 433);
        jPanelLogin.getAccessibleContext().setAccessibleName("");
        pnlPrincipalFrame.setLayout(null); //coloca o get do painelprincipal

        jLabelImagemPnl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funLogin.png"))); // NOI18N
        jPanel4.add(jLabelImagemPnl);
        jLabelImagemPnl.setBounds(0, 0, 130, 120);

        pnlPrincipalFrame.add(jPanel4);//coloca o get do painelprincipal

        getContentPane().add(pnlPrincipalFrame); //coloca o get do painelprincipal
        pnlPrincipalFrame.getAccessibleContext().setAccessibleDescription("");

        jLabelImageFundoPainelPrincipal.setRequestFocusEnabled(false);
        getContentPane().add(jLabelImageFundoPainelPrincipal);

        getAccessibleContext().setAccessibleParent(pnlPrincipalFrame); //coloca o get do painelprincipal

        setSize(new java.awt.Dimension(1260, 801));
        setLocationRelativeTo(null);*/
    // </editor-fold>//GEN-END:initComponents
    
    //inicio dos gets dos botões
=======
 
    public JPanelLogin() {
    	initComponents(); // inicializa os componentes da JFrame.
	}

	private void initComponents() {
		this.getjPanelImagemFundoTela();
    	this.addComponentesjPanelImagemFundoTela();
    	this.getjPanelCentroHead();
    	this.addComponentesjPanelCentroHead();
    	this.getjPanelHead();
    	this.addComponentesjPanelHead();
    	this.getJPanelLgoin();
    	this.addComponetesJPanelLogin();
    }
	
    // ### Inicio dos gets dos jButtons ###
    
>>>>>>> 644c780d5031f09e91fc70cc2ad090bd02217793
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
	
	public JLabel getjLabelImageFundoPainelPrincipal() {
		if(jLabelImageFundoPainelPrincipal == null){
			jLabelImageFundoPainelPrincipal = new JLabel();
			jLabelImageFundoPainelPrincipal.setOpaque(true);
		}	
		return jLabelImageFundoPainelPrincipal;
	}
	

	public JLabel getjLabelImagemCentroHead() {
		if(jLabelImagemCentroHead == null){	
			jLabelImagemCentroHead = new JLabel();
			jLabelImagemCentroHead.setSize(348,473);
		}	
		return jLabelImagemCentroHead;
	}
	
	
	public JLabel getjLabelIcon() {
		if(jLabelIcon == null){	
			jLabelIcon = new JLabel();
			jLabelIcon.setSize(110,110);
		}	
		return jLabelIcon;
	}
		
<<<<<<< HEAD
			jLabelImageFundoPainelPrincipal.setBounds(0, 0, 800, 800);
			//jLabelImageFundoPainelPrincipal.setIcon(new ImageIcon(getClass().getResource("/images/images_1.png")));
			//jLabelImageFundoPainelPrincipal.setHorizontalTextPosition(SwingConstants.LEADING);
			jLabelImageFundoPainelPrincipal.setOpaque(true);
			
=======

	public JLabel getjLabelDescricao() {
		if(jLabelDescricao == null) {
			jLabelDescricao = new JLabel();
			jLabelDescricao.setForeground(SystemColor.controlHighlight);
			jLabelDescricao.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
			jLabelDescricao.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelDescricao.setText("Workshop Manager");
			jLabelDescricao.setSize(344,35);
>>>>>>> 644c780d5031f09e91fc70cc2ad090bd02217793
		}
		return jLabelDescricao;
	}
	
	
	public JLabel getjLabelSenha() {
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

	
	public JLabel getjLabelSenhaErro() {
		if(jLabelSenhaErro == null){	
			jLabelSenhaErro = new JLabel();
			jLabelSenhaErro.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelSenhaErro.setFont(new Font("Tahoma", Font.PLAIN, 19));
			jLabelSenhaErro.setForeground(Color.RED);
			jLabelSenhaErro.setText("Usuário ou senha incorretos");
			jLabelSenhaErro.setSize(344,28);
		}	
		return jLabelSenhaErro;
	}
	
	
	public JLabel getjLabelUsuario() {
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
<<<<<<< HEAD

	//fim dos gets dos label
	
	//inicio dos gets do painel
	
	public JPanel getjPanelCentroLogin() {
		if(jPanelCentroLogin == null){
	
			jPanelCentroLogin = new JPanel();
			jPanelCentroLogin.setLayout(new OverlayLayout(jPanelCentroLogin));
			jPanelCentroLogin.setBackground(Color.BLUE);
			
		}
	
		return jPanelCentroLogin;
	}
	
	
	public JPanel getjPanelLogin() {
		
		
		if(jPanelLogin == null){
	
			jPanelLogin = new JPanel();
			jPanelLogin.setLayout(new GridBagLayout());
			jPanelLogin.setPreferredSize(null);
			jPanelLogin.setOpaque(false);
			
		}
=======
	
	// ### Fim  dos  gets dos  jLabel ###
	// ---------------------------------
	// ### Inicio dos gets do jPanel ###
>>>>>>> 644c780d5031f09e91fc70cc2ad090bd02217793
	
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

<<<<<<< HEAD
	//fim dos gets textfild e derivados
	
	
	//####METODOS####
	public TelConf getTelaConf() {
		if(telaConf == null){
=======
	// ### Fim   dos   gets   textfild   e   derivados ###
	// ---------------------------------------------------
	// ### Inicio dos métodos de adição de componentes ###
	
	public void addComponetesJPanelLogin() {
		this.add(this.getjPanelHead());
		this.add(this.getjPanelImagemFundoTela());					
	}
>>>>>>> 644c780d5031f09e91fc70cc2ad090bd02217793
	
	
	public void addComponentesjPanelImagemFundoTela() {		
		this.getjPanelImagemFundoTela().add(BorderLayout
				.CENTER,this.getjLabelImageFundoPainelPrincipal()); // Add da jLabel no JPanel.
	}
<<<<<<< HEAD
    
	public void addComponentesJPanelLogin() {
		
		GridBagConstraints variavelGrid = new GridBagConstraints();
		variavelGrid.gridx = 0; //seta a posição no eixo das coordenadas
		variavelGrid.gridy = 0; //seta a posição no eixo das abissisas
		//variavelGrid.gridheight = GridBagConstraints.REMAINDER; // redimensiona o componete verticalmente
		//variavelGrid.gridwidth = GridBagConstraints.REMAINDER; // redimensiona o componente horizontalmente
		//variavelGrid.insets = new Insets(5, 5, 5, 5); // valores em pixel que vai fica na borda
		variavelGrid.fill = GridBagConstraints.BOTH;
		variavelGrid.ipadx = 375;
		variavelGrid.ipady = 500;
		this.getjPanelLogin().add(this.getjPanelCentroLogin(), variavelGrid);
		
	}
    
    

=======
	
	
	public void addComponentesjPanelHead() {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.ipadx = 350;
		constraints.ipady = 475;
		jPanelHead.add(this.getjPanelCentroHead(), constraints);
	}
	
	
	public void addComponentesjPanelCentroHead() {
				
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
>>>>>>> 644c780d5031f09e91fc70cc2ad090bd02217793

	// ### Final dos métodos de adição de componentes ###
}