package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Border;
import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.SwingConstants;


public class JPanelOS extends JPanel {
	
	// ### Início declaração de variáveis ###
	
	private Color corIntermediaria = new Color(0,151,172); // Azul marinho
	private Color corEscura = new Color(45,45,45); // Cinza escuro
	private Color corClara = new Color(79,79,79); // Cinza claro
	
	private Color foregroudJButtonClaro = new Color(150,150,150); // Cinza
	private Color foregroudJButtonEscuro = new Color(0,0,0); // Preto
	
	private Font fontJButton = new Font("Arial",1,20); // Fonte dos jButons da classe
	private Font fontJTextField = new Font("Arial", 1, 24); // Fonte dos jTextField da classe
    private Font fontJLabel = new Font("Arial", 1, 20); // Font dos jLabel da classe
	
	private String iconGerarOS = "/icons/OS_48.png";
	private String iconVeiculoBlue = "/icons/car_48_blue.png";
	private String iconClienteBlue = "/icons/users_48_blue.png";
	private String iconServico = "/icons/OS_48_blue.png";
	private String stringTitulo = "Gerar ordem de serviço"; // Titulo da tela, para aparecer na classe JPanelPrincipal
	
	
	
	private JPanel jPanelNorthOS;
	private JPanel jPanelCenterOS;
	
	private JPanel jPanelBuscarVeiculo;
	private JPanel jPanelBuscarCliente;
	private JPanel jPanelServico;
	
	private JPanel jPanelCenterCenter;
	
	private JPanel jPanelDadosVeiculo;
	private JPanel jPanelDadosCliente;
	private JPanel jPanelDadosServico;
	
	private JButton jButtonVeiculo;
	private JButton jButtonCliente;
	private JButton jButtonServico;	
	

	private JLabel jLabelVin;
    private JLabel jLabelNumVeiculo;
    private JLabel jLabelPlaca;
    private JLabel jLabelMarca;
    private JLabel jLabelMotor;
    private JLabel jLabelModelo;
    private JLabel jLabelCombustivel;
    private JLabel jLabelAno;
    private JLabel jLabelKm;
    
    private JLabel jLabelNumCliente;
    private JLabel jLabelNomeCliente;
    private JLabel jLabelEmail;
    private JLabel jLabelTelefone;
    private JLabel jLabelCidade;
    private JLabel jLabelBairro;
    private JLabel jLabelRua;
    private JLabel jLabelNumero;
    private JLabel jLabelVeiculoCliente;
    
    
    private JTextField jTextFieldVin;     
    private JTextField jTextFieldNum;     
    private JTextField jTextFieldPlaca;
    private JTextField jTextFieldMarca;
    private JTextField jTextFieldModelo;
    private JTextField jTextFieldMotor;
    private JTextField jTextFieldCombustivel;
    private JTextField jTextFieldAno;
    private JTextField jTextFieldKm;
    
    private JTextField jTextFieldNumCliente;
    private JTextField jTextFieldNomeCliente;
    private JTextField jTextFielEmail;
    private JTextField jTextFielTelefone;
    private JTextField jTextFielCidade;
    private JTextField jTextFielBairro;
    private JTextField jTextFielRua;
    private JTextField jTextFielNumero;
    
    
    
    
    // ### Fim dlecaração de  variáveis ###
    // ------------------------------------
	// ### Inicio de criação de objetos ###
    
	private ImageIcon iconTitulo = new ImageIcon(getClass().getResource(iconGerarOS));
	private JLabel label;
	private JLabel label_1;
	private JPanel panel;
	
	// ### Fim  da  criação  de objetos ###

	public JPanelOS() {
		this.getjPanelDadosVeiculo();
		this.addComponentesJPanelDadosVeiculo();
		this.getjPanelCenterCenter();
		this.addComponentesJPanelCenterCenter();
		this.getjPanelBuscarVeiculo();
		this.addComponentesJPanelBuscarVeiculo();
		this.getjPanelCenterOS();
		this.addComponentesJPanelCenterOS();
		this.getjPanelNorthOS();
		this.addComponentesJPanelNorthOS();
		this.getjPanelOS();
		this.addComponentesJPanelOS();
    }
	
    // ### Inicio dos gets dos jButtons ###
	
	public JButton getjButtonVeiculo() {
		if(jButtonVeiculo == null){
			jButtonVeiculo = new JButton();
			jButtonVeiculo.setLocation(15, 13);
			jButtonVeiculo.setSize(180, 58);
			jButtonVeiculo.setBackground(corClara);
	        jButtonVeiculo.setFont(fontJButton);
	        jButtonVeiculo.setForeground(foregroudJButtonClaro);
	        jButtonVeiculo.setIcon(new ImageIcon(getClass().getResource(iconVeiculoBlue)));
	        jButtonVeiculo.setText(" Veículo");
	        jButtonVeiculo.setContentAreaFilled(false);
	        jButtonVeiculo.setOpaque(true);
	        jButtonVeiculo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
		}
		return jButtonVeiculo;
	}


	public JButton getjButtonCliente() {
		if(jButtonCliente == null){
			jButtonCliente = new JButton();
			jButtonCliente.setLocation(210, 13);
			jButtonCliente.setSize(180, 58);
			jButtonCliente.setBackground(corEscura);
	        jButtonCliente.setFont(fontJButton);
	        jButtonCliente.setForeground(foregroudJButtonClaro);
	        jButtonCliente.setIcon(new ImageIcon(getClass().getResource(iconClienteBlue)));
	        jButtonCliente.setText(" Cliente");
	        jButtonCliente.setContentAreaFilled(false);
	        jButtonCliente.setOpaque(true);
	        jButtonCliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
		}
		return jButtonCliente;
	}


	public JButton getjButtonServico() {
		if(jButtonServico == null){
			jButtonServico = new JButton();
			jButtonServico.setLocation(402, 13);
			jButtonServico.setSize(180, 58);
			jButtonServico.setBackground(corEscura);
	        jButtonServico.setFont(fontJButton);
	        jButtonServico.setForeground(foregroudJButtonClaro);
	        jButtonServico.setIcon(new ImageIcon(getClass().getResource(iconServico)));
	        jButtonServico.setText(" Serviço");
	        jButtonServico.setContentAreaFilled(false);
	        jButtonServico.setOpaque(true);
	        jButtonServico.setVerticalAlignment(javax.swing.SwingConstants.TOP);
		}
		return jButtonServico;
	}
	
	// ### Final dos gets dos botoes ###
    // ---------------------------------	
	// ### Inicio  dos get dos label ### 
	
	// --------------Início tela veículo--------------

	public JLabel getjLabelVin() {
		if(jLabelVin == null){
			jLabelVin = new JLabel();
			jLabelVin.setFont(fontJLabel);
	        jLabelVin.setForeground(Color.BLACK);
	        jLabelVin.setText("  Vin :");
		}
		return jLabelVin;
	}


	public JLabel getjLabelNumVeiculo() {
		if(jLabelNumVeiculo == null){
			jLabelNumVeiculo = new JLabel();
			jLabelNumVeiculo.setFont(fontJLabel);
	        jLabelNumVeiculo.setForeground(Color.BLACK);
	        jLabelNumVeiculo.setText("N\u00BA :");
		}
		return jLabelNumVeiculo;
	}


	public JLabel getjLabelPlaca() {
		if(jLabelPlaca == null){
			jLabelPlaca = new JLabel();
			jLabelPlaca.setFont(fontJLabel);
	        jLabelPlaca.setForeground(Color.BLACK);
	        jLabelPlaca.setText("  Placa :");
		}
		return jLabelPlaca;
	}
	
	
	public JLabel getjLabelMarca() {
		if(jLabelMarca == null){
			jLabelMarca = new JLabel();
			jLabelMarca.setFont(fontJLabel);
			jLabelMarca.setForeground(foregroudJButtonEscuro);
			jLabelMarca.setText("Marca");
			jLabelMarca.setSize(170, 34);
		}
		return jLabelMarca;
	}

	
	public JLabel getjLabelModelo() {
		if(jLabelModelo == null){
			jLabelModelo = new JLabel();
			jLabelModelo.setFont(fontJLabel);
			jLabelModelo.setForeground(foregroudJButtonEscuro);
	        jLabelModelo.setText("Modelo");
	        jLabelModelo.setSize(170, 34);
		}
		return jLabelModelo;
	}
	
	
	public JLabel getjLabelMotor() {
		if(jLabelMotor == null){
			jLabelMotor = new JLabel();
			jLabelMotor.setFont(fontJLabel);
			jLabelMotor.setForeground(foregroudJButtonEscuro);
			jLabelMotor.setText("Motor");
			jLabelMotor.setSize(170, 34);
		}
		return jLabelMotor;
	}
	

	public JLabel getjLabelCombustivel() {
		if(jLabelCombustivel == null){
			jLabelCombustivel = new JLabel();
			jLabelCombustivel.setFont(fontJLabel);
			jLabelCombustivel.setForeground(foregroudJButtonEscuro);
			jLabelCombustivel.setText("Combustível");
			jLabelCombustivel.setSize(170, 34);
		}
		return jLabelCombustivel;
	}
	

	public JLabel getjLabelAno() {
		if(jLabelAno == null){
			jLabelAno = new JLabel();
			jLabelAno.setFont(fontJLabel);
			jLabelAno.setForeground(foregroudJButtonEscuro);
			jLabelAno.setText("Ano");
			jLabelAno.setSize(170, 34);
		}
		return jLabelAno;
	}
	

	public JLabel getjLabelKm() {
		if(jLabelKm == null){
			jLabelKm = new JLabel();
			jLabelKm.setFont(fontJLabel);
			jLabelKm.setForeground(foregroudJButtonEscuro);
			jLabelKm.setText("Km");
			jLabelKm.setSize(170, 34);
		}
		return jLabelKm;
	}	
	
	// --------------Final tela veículo--------------
	
	// ### Fim  dos  gets dos  jLabel ###
	// ---------------------------------
	// ### Inicio dos gets do jPanel ###
	
	public JPanelOS getjPanelOS() {
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(800, 500));
		return this;
	}

	
	public JPanel getjPanelNorthOS() {
		if(jPanelNorthOS == null){
			jPanelNorthOS = new JPanel();
			jPanelNorthOS.setLayout(null);
			jPanelNorthOS.setBorder(null);
			jPanelNorthOS.setBackground(corEscura);
			jPanelNorthOS.setPreferredSize(new Dimension(800, 70));
		}
		return jPanelNorthOS;
	}
	

	public JPanel getjPanelCenterOS() {
		if(jPanelCenterOS == null){
			jPanelCenterOS = new JPanel();
			jPanelCenterOS.setLayout(new BorderLayout());
		}
		return jPanelCenterOS;
	}	
	
	
	public JPanel getjPanelCenterCenter() {
		if(jPanelCenterCenter == null){
			jPanelCenterCenter = new JPanel();
			jPanelCenterCenter.setBackground(corClara);
			jPanelCenterCenter.setLayout(new FlowLayout());
			jPanelCenterCenter.setPreferredSize(new Dimension(800, 370));
		}
		return jPanelCenterCenter;
	}

	// --------------Início tela veículo--------------

	public JPanel getjPanelBuscarVeiculo() {
		if(jPanelBuscarVeiculo == null){
			jPanelBuscarVeiculo = new JPanel();
			jPanelBuscarVeiculo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
			jPanelBuscarVeiculo.setBackground(corClara);
	        jPanelBuscarVeiculo.setLayout(null);
	        jPanelBuscarVeiculo.setPreferredSize(new Dimension(800,58));
	        jPanelBuscarVeiculo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
	        
	        getjPanelBuscarVeiculo().add(getjTextFieldPlaca());
		}
		return jPanelBuscarVeiculo;
	}
	

	public JPanel getjPanelDadosVeiculo() {
		if(jPanelDadosVeiculo == null){
			jPanelDadosVeiculo = new JPanel();
			jPanelDadosVeiculo.setBackground(new Color(0, 0, 0, 0));
			jPanelDadosVeiculo.setLayout(null);
			jPanelDadosVeiculo.setPreferredSize(new Dimension(600, 300));			
		}
		return jPanelDadosVeiculo;
	}	
	
	// --------------Final tela veículo--------------
	// --------------Início tela cliente--------------
	
	public JPanel getjPanelBuscarCliente() {
		if(jPanelBuscarCliente == null){
			jPanelBuscarCliente = new JPanel();
		}
		return jPanelBuscarCliente;
	}
	
	
	public JPanel getjPanelDadosCliente() {
		if(jPanelDadosCliente == null){
			jPanelDadosCliente = new JPanel();
		}
		return jPanelDadosCliente;
	}

	// --------------Final tela cliete--------------
	
	public JPanel getjPanelServico() {
		if(jPanelServico == null){
			jPanelServico = new JPanel();
		}
		return jPanelServico;
	}
	
	public JPanel getjPanelDadosServico() {
		if(jPanelDadosServico == null){
			jPanelDadosServico = new JPanel();
		}
		return jPanelDadosServico;
	}
	
	// ### Fim    dos     gets    dos    paineis ###
	// ---------------------------------------------
	// ### Inicios dos gets textfild e derivados ###
	
	// --------------Início tela veículo--------------
	
	public JTextField getjTextFieldVin() {
		if(jTextFieldVin == null){
			jTextFieldVin = new JTextField();
			jTextFieldVin.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
			jTextFieldVin.setBackground(corClara);
	        jTextFieldVin.setFont(fontJTextField);
	        jTextFieldVin.setHorizontalAlignment(SwingConstants.LEFT);
	        jTextFieldVin.setPreferredSize(new Dimension(180, 31));
		}
		return jTextFieldVin;
	}


	public JTextField getjTextFieldNum() {
		if(jTextFieldNum == null){
			jTextFieldNum = new JTextField();
			jTextFieldNum.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
			jTextFieldNum.setBackground(corClara);
	        jTextFieldNum.setFont(fontJTextField);
	        jTextFieldNum.setHorizontalAlignment(JTextField.RIGHT);
	        jTextFieldNum.setPreferredSize(new Dimension(95, 31));
		}
		return jTextFieldNum;
	}


	public JTextField getjTextFieldPlaca() {
		if(jTextFieldPlaca == null){
			jTextFieldPlaca = new JTextField();
			jTextFieldPlaca.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
			jTextFieldPlaca.setBackground(corClara);
	        jTextFieldPlaca.setFont(fontJTextField);
	        jTextFieldPlaca.setHorizontalAlignment(SwingConstants.LEFT);
	        jTextFieldPlaca.setPreferredSize(new Dimension(150, 31));
		}
		return jTextFieldPlaca;
	}
	

	public JTextField getjTextFieldMarca() {
		if(jTextFieldMarca == null){
			jTextFieldMarca = new JTextField();
			jTextFieldMarca.setBackground(corClara);
	        jTextFieldMarca.setFont(fontJTextField);
	        jTextFieldMarca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
	        jTextFieldMarca.setText("");
	        jTextFieldMarca.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
	        jTextFieldMarca.setMargin(new java.awt.Insets(0, 20, 0, 0));
	        jTextFieldMarca.setSize(240,40);
		}
		return jTextFieldMarca;
	}

	
	public JTextField getjTextFieldModelo() {
		if(jTextFieldModelo == null) {
			jTextFieldModelo = new JTextField();
			jTextFieldModelo.setBackground(corClara);
		    jTextFieldModelo.setFont(fontJTextField);
		    jTextFieldModelo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFieldModelo.setText("");
		    jTextFieldModelo.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFieldModelo.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFieldModelo.setSize(240,40);
		}
		return jTextFieldModelo;
	}
	
	
	public JTextField getjTextFieldMotor() {
		if(jTextFieldMotor == null){
			jTextFieldMotor = new JTextField();
			jTextFieldMotor.setBackground(corClara);
		    jTextFieldMotor.setFont(fontJTextField);
		    jTextFieldMotor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFieldMotor.setText("");
		    jTextFieldMotor.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFieldMotor.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFieldMotor.setSize(240,40);
		}
		return jTextFieldMotor;
	}
	

	public JTextField getjTextFieldCombustivel() {
		if(jTextFieldCombustivel == null){
			jTextFieldCombustivel = new JTextField();
			jTextFieldCombustivel.setBackground(corClara);
		    jTextFieldCombustivel.setFont(fontJTextField);
		    jTextFieldCombustivel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFieldCombustivel.setText("");
		    jTextFieldCombustivel.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFieldCombustivel.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFieldCombustivel.setSize(240,40);
		}
		return jTextFieldCombustivel;
	}

	
	public JTextField getjTextFieldAno() {
		if(jTextFieldAno == null){
			jTextFieldAno = new JTextField();
			jTextFieldAno.setBackground(corClara);
		    jTextFieldAno.setFont(fontJTextField);
		    jTextFieldAno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFieldAno.setText("");
		    jTextFieldAno.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFieldAno.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFieldAno.setSize(240,40);
		}
		return jTextFieldAno;
	}
	

	public JTextField getjTextFieldKm() {
		if(jTextFieldKm == null){
			jTextFieldKm = new JTextField();
			jTextFieldKm.setBackground(corClara);
		    jTextFieldKm.setFont(fontJTextField);
		    jTextFieldKm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFieldKm.setText("");
		    jTextFieldKm.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFieldKm.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFieldKm.setSize(240,40);
		}
		return jTextFieldKm;
	}
	
	
	// --------------Final tela veículo--------------	
	
	
	// ### Fim   dos   gets   textfild   e   derivados ###
	// ---------------------------------------------------
	// ### Inicio dos métodos de adição de componentes ###	
	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout());
			panel.setPreferredSize(new Dimension( 800,90));
			panel.add(BorderLayout.CENTER, new JButton());
		}
		return panel;
	}
	
	public void addComponentesJPanelOS() {	
		
		this.add(BorderLayout.NORTH, getjPanelNorthOS());
		
		this.add(BorderLayout.CENTER, getjPanelCenterOS());
		
	}
	
	
	public void addComponentesJPanelNorthOS() {
		
		getjPanelNorthOS().add(getjButtonVeiculo());
		getjPanelNorthOS().add(getjButtonCliente());
		getjPanelNorthOS().add(getjButtonServico());
		
	}
	
	
	public void addComponentesJPanelCenterOS() {	
		
		getjPanelCenterOS().add(BorderLayout.NORTH, getjPanelBuscarVeiculo());
		
		getjPanelCenterOS().add(BorderLayout.CENTER, getjPanelCenterCenter());
		
	}
	
	
	public void addComponentesJPanelCenterCenter() {	
		
		getjPanelCenterCenter().add(getjPanelDadosVeiculo());
		
	}
	
	// --------------Inicio tela veículo--------------
	
	public void addComponentesJPanelBuscarVeiculo() {
		
		getjPanelBuscarVeiculo().add(getjLabelNumVeiculo());
		getjPanelBuscarVeiculo().add(getjTextFieldNum());
		
		getjPanelBuscarVeiculo().add(getjLabelPlaca());
		getjPanelBuscarVeiculo().add(getjTextFieldPlaca());

		getjPanelBuscarVeiculo().add(getjLabelVin());
		getjPanelBuscarVeiculo().add(getjTextFieldVin());
	}
	
		
	public void addComponentesJPanelDadosVeiculo() {
		
		
		getjPanelDadosVeiculo().add(getjLabelMarca());
		getjLabelMarca().setLocation(35,15);
		
		getjLabelModelo().setLocation(330, 15);
		getjPanelDadosVeiculo().add(getjLabelModelo());
		
		getjLabelMotor().setLocation(35, 109);
		getjPanelDadosVeiculo().add(getjLabelMotor());
		
		getjLabelCombustivel().setLocation(330, 109);
		getjPanelDadosVeiculo().add(getjLabelCombustivel());
		
		getjLabelAno().setLocation(35, 203);
		getjPanelDadosVeiculo().add(getjLabelAno());
		
		getjLabelKm().setLocation(330, 203);
		getjPanelDadosVeiculo().add(getjLabelKm());
		
		getjTextFieldMarca().setLocation(35,49);
		getjPanelDadosVeiculo().add(getjTextFieldMarca());
		
		getjTextFieldModelo().setLocation(330, 49);
		getjPanelDadosVeiculo().add(getjTextFieldModelo());
		
		getjTextFieldMotor().setLocation(35, 143);
		getjPanelDadosVeiculo().add(getjTextFieldMotor());
		
		getjTextFieldCombustivel().setLocation(330, 143);
		getjPanelDadosVeiculo().add(getjTextFieldCombustivel());
		
		getjTextFieldAno().setLocation(35, 237);
		getjPanelDadosVeiculo().add(getjTextFieldAno());
		
		getjTextFieldKm().setLocation(330, 237);
		getjPanelDadosVeiculo().add(getjTextFieldKm());
	}
	
	// --------------Final tela veículo--------------
	// --------------Inicio tela cliente--------------
	
	public void addComponentesJPanelBuscarCliente() {
		
	}
	
	
	public void addComponentesJPanelBaseInformacaoCliente() {
		
	}

	// --------------Final tela cliente--------------

	// ### Final dos métodos de adição de componentes ###
	// --------------------------------------------------
	// ### Métodos              da             classe ###
	
	public String getStringTitulo() {
		return stringTitulo;
	}
	
	public ImageIcon getIconTitulo() {
		return iconTitulo;
	}
	
	// ### Final dos métodos da classe ###
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
		}
		return label_1;
	}
	
}
