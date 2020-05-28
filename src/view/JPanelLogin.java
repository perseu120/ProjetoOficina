



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

/**
 *
 * @author willi
 */
public class JPanelLogin extends JPanel {

	
    // declaracao de variaveis inicio
    private JButton jButonEntrar = null;

    
    
    private JPanel jPanelCentroLogin;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanelLogin;
     
    private JLabel jLabel2;
    private JLabel jLabelIcon;
    private JLabel jLabelImageFundoPainelPrincipal;
    private JLabel jLabelImagemPnl;
    private JLabel jLabelSenha;
    private JLabel jLabelSenhaErro;
    private JLabel jLabelUsuario;
    
    
   
    
    private JTextField jTextFieldUsuario;
    
    private JPasswordField jPasswordFieldSenha;
    // declaracao de variaveis final
	
    // Cria objeto da classe TelConf.
    private TelConf telaConf;
    
    /** Creates new form TelaLogin */
    // Inicializando atributos com os caminhos das imagens na pasta.
    private final String img = "/images/funTel1.jpg";
    private final String img1 = "/images/funLogin.png";
    private final String img2 = "/images/iconPrj.png";
    
    
    
    public JPanelLogin() { // metodo construtor.
        initComponents(); // inicializa os componentes da JFrame.
        // Chama o metodo a baixo para renderização da imagem de fundo da tela
        // login.
        //this.imgJFrameLogin(true);
        // Metodo para configurar preferencias de componentes de JFrame.
        //this.inicializeAplication();
    }

 
    
    private void initComponents() {

        //this.setOpaque(false);
    	// this.add( getTelaConf().imageLabelRend( this , getjLabelImageFundoPainelPrincipal(), img) );
        
    	this.setLayout(new OverlayLayout(this));
        this.setPreferredSize(new java.awt.Dimension(800, 600));
        getjLabelImageFundoPainelPrincipal().setIcon(new ImageIcon(getClass().getResource(img)));
        this.add( getjLabelImageFundoPainelPrincipal() );
        this.add(getjPanelLogin());

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
        jLabelUsuario.setText("Usuário:");

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
        jLabelSenhaErro.setText("Usuário e/ou senha iconrretos");
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

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // Quando o btnEntrar for Clicado.
       // this.dispose();
        new JPanelPrincipal().setVisible(true);
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // Quando a JFrame for redimencionada pelo usuário durante a exucução
        // da aplicação.
        // Chama Classe para redimencionamento da imagem de fundo da JFrame.
        this.imgJFrameLogin(false);
    }//GEN-LAST:event_formComponentResized

   
    
    // Metodo para inicializar a aplica��o java.
    private void inicializeAplication(){
        // As linhas abaixo setam as dimensoes dos icones das JLabel's.
       // telaConf.fullScree(JPanelLogin.this);
        telaConf.imageRend(this.jLabelIcon, img2, 100, 100);
        telaConf.imageLabelRend(this.jPanelLogin, this.jLabelImagemPnl, img1);
        this.imgJFrameLogin(true);
    }
    
    // Variavel seta imagem na tela princiapal de acordo com a etapa de execução.
    // true Para inicialização no construtor da classe.
    // false Para redimensionamento e minimização de JFrame.
    private void imgJFrameLogin(boolean notIsInicial){
        if(notIsInicial){
            
            telaConf.imageLabelRend(this.jLabelImageFundoPainelPrincipal, img);
        }else{
            //telaConf.imageLabelRend(TelaLogin.this, this.lblImageFrame, img);
            telaConf.imageLabelRend(this, this.jLabelImageFundoPainelPrincipal, img);
        }
       
    }
    
    
    //inicio dos gets dos bot�es
    public JButton getjButtonEntrar() {
    	
    	if(jButonEntrar == null) {
    		jButonEntrar = new JButton();
    		jButonEntrar.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
            jButonEntrar.setText("Entrar");
            jButonEntrar.setBorder(null);
    	}
    	
    	return jButonEntrar;
    }

	//final dos gets dos botoes
	
	//inicio dos get dos label
	public JLabel getjLabel2() {
		if(jLabel2 == null){
	
			jLabel2 = new JLabel();
		}
	
		return jLabel2;
	}
	

	public JLabel getjLabelIcon() {
		if(jLabelIcon == null){
	
			jLabelIcon = new JLabel();
		}
	
		return jLabelIcon;
	}

	public JLabel getjLabelImageFundoPainelPrincipal() {
		if(jLabelImageFundoPainelPrincipal == null){
	
			jLabelImageFundoPainelPrincipal = new JLabel();
		
			jLabelImageFundoPainelPrincipal.setBounds(0, 0, 800, 600);
			jLabelImageFundoPainelPrincipal.setIcon(new ImageIcon(getClass().getResource("/images/images_1.png")));
			jLabelImageFundoPainelPrincipal.setHorizontalTextPosition(SwingConstants.CENTER);
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

	//fim dos gets dos label
	
	//inicio dos gets do painel
	
	public JPanel getjPanelCentroLogin() {
		if(jPanelCentroLogin == null){
	
			jPanelCentroLogin = new JPanel();
			jPanelCentroLogin.setLayout(new OverlayLayout(jPanelCentroLogin));
			//jPanelCentroLogin.setSize(375, 500);
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
			
			GridBagConstraints variavelGrid = new GridBagConstraints();
			variavelGrid.gridx = 2; //seta a posi��o no eixo das coordenadas
			variavelGrid.gridy = 2; //seta a posi��o no eixo das abissisas
			variavelGrid.gridheight = GridBagConstraints.REMAINDER;
			variavelGrid.gridwidth = GridBagConstraints.REMAINDER;
			variavelGrid.insets = new Insets(5, 5, 5, 5);
			variavelGrid.fill = GridBagConstraints.BOTH;
			variavelGrid.ipadx = 375;
			variavelGrid.ipady = 500;
			
			jPanelLogin.add(getjPanelCentroLogin(), variavelGrid);
			
			//adiciona o painel que fica no centro
			
		}
	
		return jPanelLogin;
	}
	
	
	public JPanel getjPanel2() {
		if(jPanel2 == null){
	
			jPanel2 = new JPanel();
		}
	
		return jPanel2;
	}

	public JPanel getjPanel3() {
		if(jPanel3 == null){
	
			jPanel3 = new JPanel();
		}
	
		return jPanel3;
	}

	public JPanel getjPanel4() {
		if(jPanel4 == null){
	
			jPanel4 = new JPanel();
		}
	
		return jPanel4;
	}


	
	//fim dos gets dos paineis
	
	//inicios dos gets textfild e derivados

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

	//fim dos gets textfild e derivados
	public TelConf getTelaConf() {
		if(telaConf == null){
	
			telaConf = new TelConf();
		}
	
		return telaConf;
	}
    
    
    


}