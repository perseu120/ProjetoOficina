package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class JScrollPaneGerarOS extends JScrollPane {
	
	// ### Início declaração de variáveis ###
	
	private Color corIntermediaria = new Color(100, 132, 147); // Azul marinho
	private Color corEscura = new Color(51,51,51); // Cinza escuro
	private Color corClara = new Color(235,235,235); // Cinza claro
	private Color foregroudJButtonClaro = new Color(204,204,204); // Cinza
	private Color foregroudJButtonEscuro = new Color(0,0,0); // Preto
	private Font fontJButton = new Font("Arial",1,24); // Fonte dos jButons da classe
	private Font fontJTextField = new Font("Arial", 1, 24); // Fonte dos jTextField da classe
    private Font fontJLabel = new Font("Arial", 1, 24); // Font dos jLabel da classe
	
	private String iconGerarOS = "/icons/OS_48.png";
	private String iconVeiculoBlue = "/icons/car_48_blue.png";
	private String iconClienteBlue = "/icons/users_48_blue.png";
	private String iconServico = "/icons/OS_48_blue.png";
	
	private JPanel jPanelGerarOS;
	private JPanel jPanelCentroGerarOS;
	private JPanel jPanelBuscarVeiculo;
	private JPanel jPanelBaseInformacaoVeiculo;
	private JPanel jPanelInformacaoVeiculo;
	
	private JButton jButtonVeiculo;
	private JButton jButtonCliente;
	private JButton jButtonServico;	     

	private JLabel jLabelVin;
    private JLabel jLabelNum;
    private JLabel jLabelPlaca;
    private JLabel jLabelMarca;
    private JLabel jLabelMotor;
    private JLabel jLabelModelo;
    private JLabel jLabelCombustivel;
    private JLabel jLabelAno;
    private JLabel jLabelKm;
    
    
    private JTextField jTextFieldVin;     
    private JTextField jTextFieldNum;     
    private JTextField jTextFieldPlaca;
    private JTextField jTextFieldMarca;
    private JTextField jTextFieldModelo;
    private JTextField jTextFieldMotor;
    private JTextField jTextFieldCombustivel;
    private JTextField jTextFieldAno;
    private JTextField jTextFieldKm;
    
    private String stringTitulo = "Gerar ordem de serviço";
    
    // ### Fim dlecaração de  variáveis ###
    // ------------------------------------
	// ### Inicio de criação de objetos ###
    
	private ImageIcon iconTitulo = new ImageIcon(getClass().getResource(iconGerarOS));
	
	// ### Fim  da  criação  de objetos ###

	public JScrollPaneGerarOS() {
		this.getjPanelInformacaoVeiculo();
		this.addComponentesJPanelInformacaoVeiculo();
		this.getjPanelBaseInformacaoVeiculo();
		this.addComponentesJPanelBaseInformacaoVeiculo();
		this.getjPanelBuscarVeiculo();
		this.addComponentesJPanelBuscarVeiculo();
		this.getjPanelCentroGerarOS();
		this.addComponentesJPanelCentroGerarOS();
		this.getjPanelGerarOS();
		this.addComponentesJPanelGerarOS();
		this.getjScrollPaneOS();
		this.addComponentesJScrollPaneGerarOS();
    }
	
    // ### Inicio dos gets dos jButtons ###
	
	public JButton getjButtonVeiculo() {
		if(jButtonVeiculo == null){
			jButtonVeiculo = new JButton();
			jButtonVeiculo.setBackground(corEscura);
	        jButtonVeiculo.setFont(fontJButton);
	        jButtonVeiculo.setForeground(foregroudJButtonClaro);
	        jButtonVeiculo.setIcon(new ImageIcon(getClass().getResource(iconVeiculoBlue)));
	        jButtonVeiculo.setText(" Veículo");
	        jButtonVeiculo.setContentAreaFilled(false);
	        jButtonVeiculo.setOpaque(true);
	        jButtonVeiculo.setSize(190,61);
	        jButtonVeiculo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
		}
		return jButtonVeiculo;
	}


	public JButton getjButtonCliente() {
		if(jButtonCliente == null){
			jButtonCliente = new JButton();
			jButtonCliente.setBackground(corEscura);
	        jButtonCliente.setFont(fontJButton);
	        jButtonCliente.setForeground(foregroudJButtonClaro);
	        jButtonCliente.setIcon(new ImageIcon(getClass().getResource(iconClienteBlue)));
	        jButtonCliente.setText(" Cliente");
	        jButtonCliente.setContentAreaFilled(false);
	        jButtonCliente.setOpaque(true);
	        jButtonCliente.setSize(190,58);
	        jButtonCliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
		}
		return jButtonCliente;
	}


	public JButton getjButtonServico() {
		if(jButtonServico == null){
			jButtonServico = new JButton();
			jButtonServico.setBackground(corEscura);
	        jButtonServico.setFont(fontJButton);
	        jButtonServico.setForeground(foregroudJButtonClaro);
	        jButtonServico.setIcon(new ImageIcon(getClass().getResource(iconServico)));
	        jButtonServico.setText(" Serviço");
	        jButtonServico.setContentAreaFilled(false);
	        jButtonServico.setOpaque(true);
	        jButtonServico.setSize(190,58);
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
	        jLabelVin.setForeground(foregroudJButtonClaro);
	        jLabelVin.setText("Vin :");
	        jLabelVin.setSize(80,29);
		}
		return jLabelVin;
	}


	public JLabel getjLabelNum() {
		if(jLabelNum == null){
			jLabelNum = new JLabel();
			jLabelNum.setFont(fontJLabel);
	        jLabelNum.setForeground(foregroudJButtonClaro);
	        jLabelNum.setText("Nº");
	        jLabelNum.setSize(26,29);
		}
		return jLabelNum;
	}


	public JLabel getjLabelPlaca() {
		if(jLabelPlaca == null){
			jLabelPlaca = new JLabel();
			jLabelPlaca.setFont(fontJLabel);
	        jLabelPlaca.setForeground(foregroudJButtonClaro);
	        jLabelPlaca.setText("Placa :");
	        jLabelPlaca.setSize(80,29);
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
	
	public JScrollPaneGerarOS getjScrollPaneOS() {
		this.setBorder(null);
		//this.setPreferredSize(new Dimension(870,600));
		return this;
	}


	public JPanel getjPanelGerarOS() {
		if(jPanelGerarOS == null){
			jPanelGerarOS = new JPanel();
			jPanelGerarOS.setBackground(corIntermediaria);
			jPanelGerarOS.setBorder(null);
			jPanelGerarOS.setPreferredSize(new Dimension(1000,1000));
		}
		return jPanelGerarOS;
	}


	public JPanel getjPanelCentroGerarOS() {
		if(jPanelCentroGerarOS == null){
			jPanelCentroGerarOS = new JPanel();
	        jPanelCentroGerarOS.setLayout(null);
			jPanelCentroGerarOS.setBackground(corIntermediaria);
	        jPanelCentroGerarOS.setBorder(null);
	        jPanelCentroGerarOS.setPreferredSize(new Dimension(850, 950));
		}
		return jPanelCentroGerarOS;
	}


	public JPanel getjPanelBuscarVeiculo() {
		if(jPanelBuscarVeiculo == null){
			jPanelBuscarVeiculo = new JPanel();
			jPanelBuscarVeiculo.setBackground(corEscura);
	        jPanelBuscarVeiculo.setLayout(null);
	        jPanelBuscarVeiculo.setSize(850,58);
		}
		return jPanelBuscarVeiculo;
	}


	public JPanel getjPanelBaseInformacaoVeiculo() {
		if(jPanelBaseInformacaoVeiculo == null){
			jPanelBaseInformacaoVeiculo = new JPanel();
	        jPanelBaseInformacaoVeiculo.setLayout(null);
			jPanelBaseInformacaoVeiculo.setBackground(corEscura);
			jPanelBaseInformacaoVeiculo.setSize(850,578);
		}
		return jPanelBaseInformacaoVeiculo;
	}


	public JPanel getjPanelInformacaoVeiculo() {
		if(jPanelInformacaoVeiculo == null){
			jPanelInformacaoVeiculo = new JPanel();
			jPanelInformacaoVeiculo.setBackground(new Color(100,132,147)); 
	        jPanelInformacaoVeiculo.setSize(838, 510);
	        jPanelInformacaoVeiculo.setLayout(null);
		}
		return jPanelInformacaoVeiculo;
	}
	
	// ### Fim    dos     gets    dos    paineis ###
	// ---------------------------------------------
	// ### Inicios dos gets textfild e derivados ###
	
	// --------------Início tela veículo--------------
	
	public JTextField getjTextFieldVin() {
		if(jTextFieldVin == null){
			jTextFieldVin = new JTextField();
			jTextFieldVin.setBackground(corClara);
	        jTextFieldVin.setFont(fontJTextField);
	        jTextFieldVin.setHorizontalAlignment(JTextField.RIGHT);
	        jTextFieldVin.setSize(250,34);
		}
		return jTextFieldVin;
	}


	public JTextField getjTextFieldNum() {
		if(jTextFieldNum == null){
			jTextFieldNum = new JTextField();
			jTextFieldNum.setBackground(corClara);
	        jTextFieldNum.setFont(fontJTextField);
	        jTextFieldNum.setHorizontalAlignment(JTextField.RIGHT);
	        jTextFieldNum.setSize(100,34);
		}
		return jTextFieldNum;
	}


	public JTextField getjTextFieldPlaca() {
		if(jTextFieldPlaca == null){
			jTextFieldPlaca = new JTextField();
			jTextFieldPlaca.setBackground(corClara);
	        jTextFieldPlaca.setFont(fontJTextField);
	        jTextFieldPlaca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
	        jTextFieldPlaca.setSize(200,34);
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
	        jTextFieldMarca.setBorder(new javax.swing.border.LineBorder(corEscura, 3, true));
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
		    jTextFieldModelo.setBorder(new javax.swing.border.LineBorder(corEscura, 3, true));
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
		    jTextFieldMotor.setBorder(new javax.swing.border.LineBorder(corEscura, 3, true));
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
		    jTextFieldCombustivel.setBorder(new javax.swing.border.LineBorder(corEscura, 3, true));
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
		    jTextFieldAno.setBorder(new javax.swing.border.LineBorder(corEscura, 3, true));
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
		    jTextFieldKm.setBorder(new javax.swing.border.LineBorder(corEscura, 3, true));
		    jTextFieldKm.setMargin(new java.awt.Insets(0, 20, 0, 0));
		    jTextFieldKm.setSize(240,40);
		}
		return jTextFieldKm;
	}
	
	
	// --------------Final tela veículo--------------	
	
	
	// ### Fim   dos   gets   textfild   e   derivados ###
	// ---------------------------------------------------
	// ### Inicio dos métodos de adição de componentes ###
	
	// --------------Inicio tela veículo--------------


	public void addComponentesJScrollPaneGerarOS() {
		this.setViewportView(getjPanelGerarOS());// seta o jpanel dentro do jscroll
	}
	
	
	public void addComponentesJPanelGerarOS() {		
		getjPanelGerarOS().add(getjPanelCentroGerarOS());// seta o jpanel no centro
	}
	
     
	public void addComponentesJPanelCentroGerarOS() {
		
		getjButtonVeiculo().setLocation(0, 48);
		getjPanelCentroGerarOS().add(getjButtonVeiculo());
		
		getjButtonCliente().setLocation(193, 48);
		getjPanelCentroGerarOS().add(getjButtonCliente());
		
		getjButtonServico().setLocation(386, 48);
		getjPanelCentroGerarOS().add(getjButtonServico());
		
		getjPanelBaseInformacaoVeiculo().setLocation(0, 109);
		getjPanelCentroGerarOS().add(getjPanelBaseInformacaoVeiculo());
		
		
	}
	
	
	public void addComponentesJPanelBuscarVeiculo() {
		
		getjLabelNum().setLocation(10, 12);
		getjPanelBuscarVeiculo().add(getjLabelNum());
		
		getjLabelPlaca().setLocation(160, 12);
		getjPanelBuscarVeiculo().add(getjLabelPlaca());
		
		getjLabelVin().setLocation(475, 12);
		getjPanelBuscarVeiculo().add(getjLabelVin());
		
		getjTextFieldNum().setLocation(42, 12);
		getjPanelBuscarVeiculo().add(getjTextFieldNum());
		
		getjTextFieldPlaca().setLocation(242, 12);
		getjPanelBuscarVeiculo().add(getjTextFieldPlaca());
		
		getjTextFieldVin().setLocation(532, 12);
		getjPanelBuscarVeiculo().add(getjTextFieldVin());
	}
	
	public void addComponentesJPanelBaseInformacaoVeiculo() {
		
		getjPanelBuscarVeiculo().setLocation(0, 0);
		getjPanelBaseInformacaoVeiculo().add(getjPanelBuscarVeiculo());
		
		getjPanelInformacaoVeiculo().setLocation(6, 62);
		getjPanelBaseInformacaoVeiculo().add(getjPanelInformacaoVeiculo());
		
	}
	
	
	public void addComponentesJPanelInformacaoVeiculo() {
		
		getjLabelMarca().setLocation(35,45);
		getjPanelInformacaoVeiculo().add(getjLabelMarca());
		
		getjLabelModelo().setLocation(480, 45);
		getjPanelInformacaoVeiculo().add(getjLabelModelo());
		
		getjLabelMotor().setLocation(35, 179);
		getjPanelInformacaoVeiculo().add(getjLabelMotor());
		
		getjLabelCombustivel().setLocation(480, 179);
		getjPanelInformacaoVeiculo().add(getjLabelCombustivel());
		
		getjLabelAno().setLocation(35, 313);
		getjPanelInformacaoVeiculo().add(getjLabelAno());
		
		getjLabelKm().setLocation(480, 313);
		getjPanelInformacaoVeiculo().add(getjLabelKm());
		
		getjTextFieldMarca().setLocation(35,79);
		getjPanelInformacaoVeiculo().add(getjTextFieldMarca());
		
		getjTextFieldModelo().setLocation(480, 79);
		getjPanelInformacaoVeiculo().add(getjTextFieldModelo());
		
		getjTextFieldMotor().setLocation(35, 213);
		getjPanelInformacaoVeiculo().add(getjTextFieldMotor());
		
		getjTextFieldCombustivel().setLocation(480, 213);
		getjPanelInformacaoVeiculo().add(getjTextFieldCombustivel());
		
		getjTextFieldAno().setLocation(35, 347);
		getjPanelInformacaoVeiculo().add(getjTextFieldAno());
		
		getjTextFieldKm().setLocation(480, 347);
		getjPanelInformacaoVeiculo().add(getjTextFieldKm());
	}
	
	// --------------Final tela veículo--------------

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
}
