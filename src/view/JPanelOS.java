package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import javafx.scene.effect.ColorInput;

import java.awt.SystemColor;
import java.util.HashMap;
import java.util.Map;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import model.CoresPrograma;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;


public class JPanelOS extends JPanel {
	
	// ### Início de instânceamento de objetos ###
	
	CoresPrograma CoresPrograma = new CoresPrograma();
	
	
	// ### Início declaração de variáveis ###
	
	private Color corIntermediaria = CoresPrograma.getCorIntermediaria();  // cor de jpanel sobre a cor de fundo
	private Color corEscura = CoresPrograma.getCorEscura(); // cor contida também na barra de menu superior
	private Color corFundo = CoresPrograma.getCorFundo(); // cor de fundo dos jpanels
	
	private Color foreground = CoresPrograma.getForeground(); // foregroudo dos jbuttons
	private Color foregroundClic = CoresPrograma.getForegroundClic(); // foregroud de jbutton quando clicado ou ganhado foco
	
	private Font fontJButton = new Font("Arial",1,20); // Fonte dos jButons da classe
	private Font fontJTextField = new Font("Arial", 1, 24); // Fonte dos jTextField da classe
    private Font fontJLabel = new Font("Arial", 1, 20); // Font dos jLabel da classe
	
	private String iconGerarOS = "/icons/OS_48.png";
	private String iconVeiculoBlue = "/icons/car_48_blue.png";
	private String iconClienteBlue = "/icons/users_48_blue.png";
	private String iconServico = "/icons/OS_48_blue.png";
	private String stringTitulo = "Gerar ordem de serviço"; // Titulo da tela, para aparecer na classe JPanelPrincipal
	
	private JPanel telaAtualBusca; // recebe a tela que foi adicionada na parte north do JPanelCenterOS
	private JPanel telaAtualDados; // recebe a tela que foi adicionada na parte center do JPanelCenterOS
	
	
	
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
    private JLabel jLabelCPF;
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
    private JComboBox<String> jComboBoxCombustivel;
    private JComboBox<Integer> jComboBoxAno;
    private JTextField jTextFieldKm;
    
    private JTextField jTextFieldNumCliente;
    private JTextField jTextFieldCPF;
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
		
		
		
		telaAtualBusca = getjPanelBuscarVeiculo();
		
		this.getjPanelDadosCliente();
		this.getjPanelBuscarCliente();
		
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
		

		
		telaAtualDados = getjPanelDadosVeiculo();
    }
	
    // ### Inicio dos gets dos jButtons ###
	
	public JButton getjButtonVeiculo() {
		if(jButtonVeiculo == null){
			jButtonVeiculo = new JButton();
			jButtonVeiculo.setLocation(15, 13);
			jButtonVeiculo.setSize(180, 58);
			jButtonVeiculo.setBackground(corFundo);
	        jButtonVeiculo.setFont(fontJButton);
	        jButtonVeiculo.setForeground(foregroundClic);
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
	        jButtonCliente.setForeground(foreground);
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
	        jButtonServico.setForeground(foreground);
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
			jLabelMarca.setForeground(foregroundClic);
			jLabelMarca.setText("Marca");
			jLabelMarca.setSize(170, 34);
		}
		return jLabelMarca;
	}

	
	public JLabel getjLabelModelo() {
		if(jLabelModelo == null){
			jLabelModelo = new JLabel();
			jLabelModelo.setFont(fontJLabel);
			jLabelModelo.setForeground(foregroundClic);
	        jLabelModelo.setText("Modelo");
	        jLabelModelo.setSize(170, 34);
		}
		return jLabelModelo;
	}
	
	
	public JLabel getjLabelMotor() {
		if(jLabelMotor == null){
			jLabelMotor = new JLabel();
			jLabelMotor.setFont(fontJLabel);
			jLabelMotor.setForeground(foregroundClic);
			jLabelMotor.setText("Motor");
			jLabelMotor.setSize(170, 34);
		}
		return jLabelMotor;
	}
	

	public JLabel getjLabelCombustivel() {
		if(jLabelCombustivel == null){
			jLabelCombustivel = new JLabel();
			jLabelCombustivel.setFont(fontJLabel);
			jLabelCombustivel.setForeground(foregroundClic);
			jLabelCombustivel.setText("Combustível");
			jLabelCombustivel.setSize(170, 34);
		}
		return jLabelCombustivel;
	}
	

	public JLabel getjLabelAno() {
		if(jLabelAno == null){
			jLabelAno = new JLabel();
			jLabelAno.setFont(fontJLabel);
			jLabelAno.setForeground(foregroundClic);
			jLabelAno.setText("Ano");
			jLabelAno.setSize(170, 34);
		}
		return jLabelAno;
	}
	

	public JLabel getjLabelKm() {
		if(jLabelKm == null){
			jLabelKm = new JLabel();
			jLabelKm.setFont(fontJLabel);
			jLabelKm.setForeground(foregroundClic);
			jLabelKm.setText("Km");
			jLabelKm.setSize(170, 34);
		}
		return jLabelKm;
	}	
	
	// --------------Final tela veículo--------------
	// --------------Início tela cliente-------------
	
	public JLabel getjLabelNumCliente() {
		
		if(jLabelNumCliente == null){
			jLabelNumCliente.setFont(fontJLabel);
			jLabelNumCliente.setForeground(foregroundClic);
			jLabelNumCliente.setText("Ano");
			jLabelNumCliente.setSize(170, 34);
	
		}
		return jLabelNumCliente;
	}

	public JLabel getjLabelCPF() {
		
		if(jLabelCPF == null){
	
			jLabelCPF = new JLabel();
			jLabelCPF.setFont(fontJLabel);
			jLabelCPF.setForeground(foregroundClic);
			jLabelCPF.setText("Ano");
			jLabelCPF.setSize(170, 34);
	
		}
		return jLabelCPF;
	}

	public JLabel getjLabelNomeCliente() {
		
		if(jLabelNomeCliente == null){
	
			jLabelNomeCliente = new JLabel();
			jLabelNomeCliente.setFont(fontJLabel);
			jLabelNomeCliente.setForeground(foregroundClic);
			jLabelNomeCliente.setText("Ano");
			jLabelNomeCliente.setSize(170, 34);
	
		}
		return jLabelNomeCliente;
	}

	public JLabel getjLabelEmail() {
		
		if(jLabelEmail == null){
	
			jLabelEmail = new JLabel();
			jLabelEmail.setFont(fontJLabel);
			jLabelEmail.setForeground(foregroundClic);
			jLabelEmail.setText("Ano");
			jLabelEmail.setSize(170, 34);
	
		}
		return jLabelEmail;
	}

	public JLabel getjLabelTelefone() {
		
		if(jLabelTelefone == null){
	
			jLabelTelefone = new JLabel();
			jLabelTelefone.setFont(fontJLabel);
			jLabelTelefone.setForeground(foregroundClic);
			jLabelTelefone.setText("Ano");
			jLabelTelefone.setSize(170, 34);
	
		}
		return jLabelTelefone;
	}

	public JLabel getjLabelCidade() {
		
		if(jLabelCidade == null){
	
			jLabelCidade = new JLabel();
			jLabelCidade.setFont(fontJLabel);
			jLabelCidade.setForeground(foregroundClic);
			jLabelCidade.setText("Ano");
			jLabelCidade.setSize(170, 34);
	
		}
		return jLabelCidade;
	}

	public JLabel getjLabelBairro() {
		
		if(jLabelBairro == null){
	
			jLabelBairro = new JLabel();
			jLabelBairro.setFont(fontJLabel);
			jLabelBairro.setForeground(foregroundClic);
			jLabelBairro.setText("Ano");
			jLabelBairro.setSize(170, 34);
	
		}
		return jLabelBairro;
	}

	public JLabel getjLabelRua() {
		
		if(jLabelRua == null){
	
			jLabelRua = new JLabel();
			jLabelRua.setFont(fontJLabel);
			jLabelRua.setForeground(foregroundClic);
			jLabelRua.setText("Ano");
			jLabelRua.setSize(170, 34);
	
		}
		return jLabelRua;
	}

	public JLabel getjLabelVeiculoCliente() {
		
		if(jLabelVeiculoCliente == null){
	
			jLabelVeiculoCliente = new JLabel();
			jLabelVeiculoCliente.setFont(fontJLabel);
			jLabelVeiculoCliente.setForeground(foregroundClic);
			jLabelVeiculoCliente.setText("Ano");
			jLabelVeiculoCliente.setSize(170, 34);
	
		}
		return jLabelVeiculoCliente;
	}

	
	// --------------Final tela cliente--------------
	
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
			jPanelCenterCenter.setBackground(corFundo);
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
			jPanelBuscarVeiculo.setBackground(corFundo);
	        jPanelBuscarVeiculo.setLayout(null);
	        jPanelBuscarVeiculo.setPreferredSize(new Dimension(800,58));
	        jPanelBuscarVeiculo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));	        
	        
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
			jPanelBuscarVeiculo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
			jPanelBuscarVeiculo.setBackground(corFundo);
	        jPanelBuscarVeiculo.setLayout(null);
	        jPanelBuscarVeiculo.setPreferredSize(new Dimension(800,58));
	        jPanelBuscarVeiculo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
		}
		return jPanelBuscarCliente;
	}
	
	
	public JPanel getjPanelDadosCliente() {
		if(jPanelDadosCliente == null){
			jPanelDadosCliente = new JPanel();
			jPanelDadosCliente.setBackground(new Color(0, 0, 0, 0));
			jPanelDadosCliente.setLayout(null);
			jPanelDadosCliente.setPreferredSize(new Dimension(600, 300));
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
			jTextFieldVin.setBackground(corFundo);
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
			jTextFieldNum.setBackground(corFundo);
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
			jTextFieldPlaca.setBackground(corFundo);
	        jTextFieldPlaca.setFont(fontJTextField);
	        jTextFieldPlaca.setHorizontalAlignment(SwingConstants.LEFT);
	        jTextFieldPlaca.setPreferredSize(new Dimension(150, 31));
		}
		return jTextFieldPlaca;
	}
	

	public JTextField getjTextFieldMarca() {
		if(jTextFieldMarca == null){
			jTextFieldMarca = new JTextField();
			jTextFieldMarca.setBackground(corFundo);
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
			jTextFieldModelo.setBackground(corFundo);
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
			jTextFieldMotor.setBackground(corFundo);
		    jTextFieldMotor.setFont(fontJTextField);
		    jTextFieldMotor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFieldMotor.setText("");
		    jTextFieldMotor.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFieldMotor.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFieldMotor.setSize(240,40);
		}
		return jTextFieldMotor;
	}
	

	public JComboBox<String> getjComboBoxCombustivel() {
		if(jComboBoxCombustivel == null){
			UIManager.put("ComboBox.selectionBackground", corFundo);
			jComboBoxCombustivel = new JComboBox<String>();
			jComboBoxCombustivel.setModel(new DefaultComboBoxModel(new String[] {"Selecione opção", "Diesel", "Flex", "Gasolina", "GLP", "TetaFuel"}));
			jComboBoxCombustivel.setOpaque(false);
		    jComboBoxCombustivel.setFont(fontJTextField);
		    jComboBoxCombustivel.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jComboBoxCombustivel.setSize(240,40);
		}
		return jComboBoxCombustivel;
	}

	
	public JComboBox<Integer> getjComboBoxAno() {
		if(jComboBoxAno == null){
			jComboBoxAno = new JComboBox<Integer>();
			jComboBoxAno.setBackground(corFundo);
		    jComboBoxAno.setFont(fontJTextField);
		    jComboBoxAno.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jComboBoxAno.setSize(240,40);
		    
		}
		return jComboBoxAno;
	}
	

	public JTextField getjTextFieldKm() {
		if(jTextFieldKm == null){
			jTextFieldKm = new JTextField();
			jTextFieldKm.setBackground(corFundo);
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
	// --------------Final tela cliente--------------

	public JTextField getjTextFieldNumCliente() {
		
		if(jTextFieldNumCliente == null){
	
			jTextFieldNumCliente = new JTextField();
			jTextFieldNumCliente.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
			jTextFieldNumCliente.setBackground(corFundo);
			jTextFieldNumCliente.setFont(fontJTextField);
			jTextFieldNumCliente.setHorizontalAlignment(SwingConstants.LEFT);
			jTextFieldNumCliente.setPreferredSize(new Dimension(150, 31));
		}
		return jTextFieldNumCliente;
	}

	public JTextField getjTextFieldNomeCliente() {
		
		if(jTextFieldNomeCliente == null){
	
			jTextFieldNomeCliente.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
			jTextFieldNomeCliente.setBackground(corFundo);
			jTextFieldNomeCliente.setFont(fontJTextField);
			jTextFieldNomeCliente.setHorizontalAlignment(SwingConstants.LEFT);
			jTextFieldNomeCliente.setPreferredSize(new Dimension(150, 31));
		}
		return jTextFieldNomeCliente;
	}

	public JTextField getjTextFielEmail() {
		
		if(jTextFielEmail == null){
	
			jTextFielEmail = new JTextField();
			jTextFielEmail.setBackground(corFundo);
		    jTextFielEmail.setFont(fontJTextField);
		    jTextFielEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFielEmail.setText("");
		    jTextFielEmail.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFielEmail.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFielEmail.setSize(240,40);
		}
		return jTextFielEmail;
	}

	public JTextField getjTextFielTelefone() {
		
		if(jTextFielTelefone == null){
	
			jTextFielTelefone = new JTextField();
			jTextFielTelefone.setBackground(corFundo);
		    jTextFielTelefone.setFont(fontJTextField);
		    jTextFielTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFielTelefone.setText("");
		    jTextFielTelefone.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFielTelefone.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFielTelefone.setSize(240,40);
		}
		return jTextFielTelefone;
	}

	public JTextField getjTextFielCidade() {
		
		if(jTextFielCidade == null){
	
			jTextFielCidade = new JTextField();
			jTextFielCidade.setBackground(corFundo);
		    jTextFielCidade.setFont(fontJTextField);
		    jTextFielCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFielCidade.setText("");
		    jTextFielCidade.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFielCidade.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFielCidade.setSize(240,40);
		}
		return jTextFielCidade;
	}

	public JTextField getjTextFielBairro() {
		
		if(jTextFielBairro == null){
	
			jTextFielBairro = new JTextField();
			jTextFielBairro.setBackground(corFundo);
		    jTextFielBairro.setFont(fontJTextField);
		    jTextFielBairro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFielBairro.setText("");
		    jTextFielBairro.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFielBairro.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFielBairro.setSize(240,40);
		}
		return jTextFielBairro;
	}

	public JTextField getjTextFielRua() {
		
		if(jTextFielRua == null){
	
			jTextFielRua = new JTextField();
			jTextFielRua.setBackground(corFundo);
		    jTextFielRua.setFont(fontJTextField);
		    jTextFielRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFielRua.setText("");
		    jTextFielRua.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFielRua.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFielRua.setSize(240,40);
		}
		return jTextFielRua;
	}

	public JTextField getjTextFielNumero() {
		
		if(jTextFielNumero == null){
	
			jTextFielNumero = new JTextField();
			jTextFielNumero.setBackground(corFundo);
		    jTextFielNumero.setFont(fontJTextField);
		    jTextFielNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
		    jTextFielNumero.setText("");
		    jTextFielNumero.setBorder(new javax.swing.border.LineBorder(new Color(0,0,0), 3, true));
		    jTextFielNumero.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFielNumero.setSize(240,40);
		}
		return jTextFielNumero;
	}
	
	
	public JTextField getjTextFieldCPF() {
		
		if(jTextFieldCPF == null){
	
			jTextFieldCPF.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
			jTextFieldCPF.setBackground(corFundo);
			jTextFieldCPF.setFont(fontJTextField);
			jTextFieldCPF.setHorizontalAlignment(SwingConstants.LEFT);
			jTextFieldCPF.setPreferredSize(new Dimension(150, 31));
		}
		return jTextFieldCPF;
	}
	
	// --------------Final tela cliente--------------
	
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
		
		getjComboBoxCombustivel().setLocation(330, 143);
		getjPanelDadosVeiculo().add(getjComboBoxCombustivel());
		
		getjComboBoxAno().setLocation(35, 237);
		getjPanelDadosVeiculo().add(getjComboBoxAno());
		
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
	
	public void alteraJPanelTela(JPanel jPanelNorth, JPanel jPanelCenter) { // Método que faz os tratamentos nessessários
		//		para trocar a tela do centro da classe
		
		if(telaAtualBusca != null) { 	// Se estiver na tela incial e for trocar para outra tela
			//getjPanelOS().getjPanelCenterOS().remove(telaAtualBusca);
			//getjPanelOS().getjPanelCenterOS().add(BorderLayout.NORTH, jPanelNorth);
			getjPanelOS().getjPanelCenterOS().remove(getjPanelDadosVeiculo());
			getjPanelOS().getjPanelCenterOS().add(BorderLayout.CENTER, getjPanelDadosCliente());
			telaAtualBusca = jPanelNorth;
			telaAtualDados = jPanelCenter;
		}
		
		getjPanelOS().repaint();
		getjPanelOS().validate();
	}	
	
	
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
