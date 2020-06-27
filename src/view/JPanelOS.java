package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.border.MatteBorder;


import javax.swing.SwingConstants;
import javax.swing.UIManager;

import model.CoresPrograma;
import javax.swing.DefaultComboBoxModel;


public class JPanelOS extends JPanel {
	
	// ### Início de instânceamento de objetos ###
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	CoresPrograma CoresPrograma = new CoresPrograma();
	
	
	// ### Início declaração de variáveis ###
	
	//private Color corIntermediaria = CoresPrograma.getCorIntermediaria();  // cor de jpanel sobre a cor de fundo
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
    private JLabel jlabelNumeroRua;
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
	
	
	// ### Fim  da  criação  de objetos ###

	public JPanelOS() {
		setBackground(Color.RED);
		
		
		
		telaAtualBusca = getjPanelBuscarVeiculo();
		
		this.addComponentesJPanelDadosCliente();
		this.addComponentesJPanelBuscarCliente();
		
		this.getjPanelDadosVeiculo();
		this.addComponentesJPanelDadosVeiculo();
		this.getjPanelCenterCenter();
		this.addComponentesJPanelCenterCenter();
		this.getjPanelBuscarVeiculo();
		this.addComponentesJPanelBuscarVeiculo();
		//this.getjPanelCenterOS();
		//this.addComponentesJPanelCenterOS();
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
			jLabelNumCliente = new JLabel();
			jLabelNumCliente.setFont(fontJLabel);
			jLabelNumCliente.setForeground(foregroundClic);
			jLabelNumCliente.setText("N\u00BA : ");
			jLabelNumCliente.setPreferredSize(new Dimension(45, 34));
	
		}
		return jLabelNumCliente;
	}

	public JLabel getjLabelCPF() {
		
		if(jLabelCPF == null){
	
			jLabelCPF = new JLabel();
			jLabelCPF.setFont(fontJLabel);
			jLabelCPF.setForeground(foregroundClic);
			jLabelCPF.setText("  CPF :");
			jLabelCPF.setPreferredSize(new Dimension(73, 34));
	
		}
		return jLabelCPF;
	}

	public JLabel getjLabelNomeCliente() {
		
		if(jLabelNomeCliente == null){
	
			jLabelNomeCliente = new JLabel();
			jLabelNomeCliente.setFont(fontJLabel);
			jLabelNomeCliente.setForeground(foregroundClic);
			jLabelNomeCliente.setText("  Nome :");
			jLabelNomeCliente.setPreferredSize(new Dimension(88, 34));
	
		}
		return jLabelNomeCliente;
	}

	public JLabel getjLabelEmail() {
		
		if(jLabelEmail == null){
	
			jLabelEmail = new JLabel();
			jLabelEmail.setFont(fontJLabel);
			jLabelEmail.setForeground(foregroundClic);
			jLabelEmail.setText("Email");
			jLabelEmail.setSize(170, 34);
	
		}
		return jLabelEmail;
	}

	public JLabel getjLabelTelefone() {
		
		if(jLabelTelefone == null){
	
			jLabelTelefone = new JLabel();
			jLabelTelefone.setFont(fontJLabel);
			jLabelTelefone.setForeground(foregroundClic);
			jLabelTelefone.setText("Telefone");
			jLabelTelefone.setSize(170, 34);
	
		}
		return jLabelTelefone;
	}

	public JLabel getjLabelCidade() {
		
		if(jLabelCidade == null){
	
			jLabelCidade = new JLabel();
			jLabelCidade.setFont(fontJLabel);
			jLabelCidade.setForeground(foregroundClic);
			jLabelCidade.setText("Cidade");
			jLabelCidade.setSize(170, 34);
	
		}
		return jLabelCidade;
	}

	public JLabel getjLabelBairro() {
		
		if(jLabelBairro == null){
	
			jLabelBairro = new JLabel();
			jLabelBairro.setFont(fontJLabel);
			jLabelBairro.setForeground(foregroundClic);
			jLabelBairro.setText("Bairro");
			jLabelBairro.setSize(170, 34);
	
		}
		return jLabelBairro;
	}

	public JLabel getjLabelRua() {
		
		if(jLabelRua == null){
	
			jLabelRua = new JLabel();
			jLabelRua.setFont(fontJLabel);
			jLabelRua.setForeground(foregroundClic);
			jLabelRua.setText("Rua");
			jLabelRua.setSize(170, 34);
	
		}
		return jLabelRua;
	}
	
	
	public JLabel getjlabelNumeroRua() {
		
		if(jlabelNumeroRua == null){
	
			jlabelNumeroRua = new JLabel();
			jlabelNumeroRua.setFont(fontJLabel);
			jlabelNumeroRua.setForeground(foregroundClic);
			jlabelNumeroRua.setText("N\u00BA Casa");
			jlabelNumeroRua.setSize(170, 34);
	
		}
		return jlabelNumeroRua;
	}
	

	public JLabel getjLabelVeiculoCliente() {
		
		if(jLabelVeiculoCliente == null){
	
			jLabelVeiculoCliente = new JLabel();
			jLabelVeiculoCliente.setFont(fontJLabel);
			jLabelVeiculoCliente.setForeground(foregroundClic);
			jLabelVeiculoCliente.setText("Motorista");
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
		//this.setPreferredSize(new Dimension(800, 500));
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
	
	// Método desnecessária

	/*public JPanel getjPanelCenterOS() {
		if(jPanelCenterOS == null){
			jPanelCenterOS = new JPanel();
			jPanelCenterOS.setLayout(new BorderLayout());
			//jPanelCenterOS.setPreferredSize(new Dimension(800, 70));
		}
		return jPanelCenterOS;
	}	*/
	
	
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
			jPanelBuscarCliente.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
			jPanelBuscarCliente.setBackground(corFundo);
			jPanelBuscarCliente.setLayout(null);
			jPanelBuscarCliente.setPreferredSize(new Dimension(800,58));
			jPanelBuscarCliente.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
		}
		return jPanelBuscarCliente;
	}
	
	
	public JPanel getjPanelDadosCliente() {
		if(jPanelDadosCliente == null){
			jPanelDadosCliente = new JPanel();
			jPanelDadosCliente.setBackground(new Color(0, 0, 0, 0));
			jPanelDadosCliente.setLayout(null);
			jPanelDadosCliente.setPreferredSize(new Dimension(600, 360));
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
			jComboBoxCombustivel.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecione opção", "Diesel", "Flex", "Gasolina", "GLP", "TetaFuel"}));
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

			jTextFieldNomeCliente = new JTextField();
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

	public JTextField getjTextFieldNumero() {
		
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
			
			jTextFieldCPF = new JTextField();
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
	
	
	public void addComponentesJPanelOS() {	
		
		this.add(BorderLayout.NORTH, getjPanelNorthOS());
		
		this.add(BorderLayout.CENTER, getjPanelBuscarVeiculo());
		
		this.add(BorderLayout.SOUTH, getjPanelDadosVeiculo());
		
		//this.add(BorderLayout.CENTER, getjPanelCenterOS()); Metodo desnecessário
		 
	}
	
	
	public void addComponentesJPanelNorthOS() {
		
		getjPanelNorthOS().add(getjButtonVeiculo());
		getjPanelNorthOS().add(getjButtonCliente());
		getjPanelNorthOS().add(getjButtonServico());
		
	}
	
	
	/*public void addComponentesJPanelCenterOS() {	
		
		getjPanelCenterOS().add(BorderLayout.NORTH, getjPanelBuscarVeiculo());
		
		getjPanelCenterOS().add(BorderLayout.CENTER, getjPanelCenterCenter());
		
	}*/
	
	
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
		
		getjPanelBuscarCliente().add(getjLabelNumCliente());
		getjPanelBuscarCliente().add(getjTextFieldNumCliente());
		
		getjPanelBuscarCliente().add(getjLabelCPF());
		getjPanelBuscarCliente().add(getjTextFieldCPF());

		getjPanelBuscarCliente().add(getjLabelNomeCliente());
		getjPanelBuscarCliente().add(getjTextFieldNomeCliente());
	}
	
	
	public void addComponentesJPanelDadosCliente() {

		getjLabelEmail().setLocation(35,15);
		getjPanelDadosCliente().add(getjLabelEmail());
		
		getjLabelTelefone().setLocation(330, 15);
		getjPanelDadosCliente().add(getjLabelTelefone());
		
		getjLabelCidade().setLocation(35, 109);
		getjPanelDadosCliente().add(getjLabelCidade());
		
		getjLabelBairro().setLocation(330, 109);
		getjPanelDadosCliente().add(getjLabelBairro());
		
		getjLabelRua().setLocation(35, 203);
		getjPanelDadosCliente().add(getjLabelRua());
		
		getjlabelNumeroRua().setLocation(330, 203);
		getjPanelDadosCliente().add(getjlabelNumeroRua());
		
		getjLabelVeiculoCliente().setLocation(35,281);
		getjPanelDadosCliente().add(getjLabelVeiculoCliente());
		
		
		getjTextFielEmail().setLocation(35,49);
		getjPanelDadosCliente().add(getjTextFielEmail());
		
		getjTextFielTelefone().setLocation(330, 49);
		getjPanelDadosCliente().add(getjTextFielTelefone());
		
		getjTextFielCidade().setLocation(35, 143);
		getjPanelDadosCliente().add(getjTextFielCidade());
		
		getjTextFielBairro().setLocation(330, 143);
		getjPanelDadosCliente().add(getjTextFielBairro());
		
		getjTextFielRua().setLocation(35, 237);
		getjPanelDadosCliente().add(getjTextFielRua());
		
		getjTextFieldNumero().setLocation(330, 237);
		getjPanelDadosCliente().add(getjTextFieldNumero());
		
		
		
	}

	// --------------Final tela cliente--------------

	// ### Final dos métodos de adição de componentes ###
	// --------------------------------------------------
	// ### Métodos              da             classe ###
	
	public void alteraJPanelTela(JPanel jPanelNorth, JPanel jPanelCenter) { // Método que faz os tratamentos nessessários
		//		para trocar a tela do centro da classe
		
		if(telaAtualBusca != null) { 	// Se estiver na tela incial e for trocar para outra tela
			
			this.remove(telaAtualBusca);
			this.add(BorderLayout.CENTER, jPanelNorth);
			this.remove(telaAtualDados);
			this.add(BorderLayout.SOUTH, jPanelCenter);
			
			telaAtualBusca = jPanelNorth;
			telaAtualDados = jPanelCenter;
		}
		
		this.repaint();
		this.validate();
		getjPanelOS().repaint();
		getjPanelOS().validate();
		/*this.getjPanelNorthOS().repaint();
		this.getjPanelNorthOS().validate();
		this.getjPanelCenterOS().repaint();
		this.getjPanelCenterOS().validate();*/
		
		System.out.println("Foi alterado a tela os");
	}	
	
	
	public String getStringTitulo() {
		return stringTitulo;
	}
	
	public ImageIcon getIconTitulo() {
		return iconTitulo;
	}
	
	// ### Final dos métodos da classe ###
	private JPanel jPanel1;
	
	public JPanel getjPanel1() {
		if(jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setVisible(true);
			jPanel1.setBackground(Color.BLUE);
		}
		return jPanel1;
	}
	
}
