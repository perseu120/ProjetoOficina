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
	private JPanel jPanelBordaInformacaoVeiculo;
	private JPanel jPanelInformacaoVeiculo;
	
	private JButton jButtonVeiculo;
	private JButton jButtonCliente;
	private JButton jButtonServico;	 
     
    private JLabel jLabelTitulo;  
	private JLabel jLabelVin;
    private JLabel jLabelNum;
    private JLabel jLabelPlaca;
    
    private JTextField jTextFieldVin;     
    private JTextField jTextFieldNum;     
    private JTextField jTextFieldPlaca;
    
    private String stringTitulo = "Gerar ordem de serviço";
    
    // ### Fim dlecaração de  variáveis ###
    // ------------------------------------
	// ### Inicio de criação de objetos ###
    
	private ImageIcon iconTitulo = new ImageIcon(getClass().getResource(iconGerarOS));
	
	// ### Fim  da  criação  de objetos ###

	public JScrollPaneGerarOS() {
		this.getjPanelInformacaoVeiculo();
		this.getjPanelBordaInformacaoVeiculo();
		this.addComponentesJPanelBordaInformacaoVeiculo();
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


	public JPanel getjPanelBordaInformacaoVeiculo() {
		if(jPanelBordaInformacaoVeiculo == null){
			jPanelBordaInformacaoVeiculo = new JPanel();
	        jPanelBordaInformacaoVeiculo.setLayout(null);
			jPanelBordaInformacaoVeiculo.setBackground(corEscura);
			jPanelBordaInformacaoVeiculo.setSize(850,520);
		}
		return jPanelBordaInformacaoVeiculo;
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
	        jTextFieldPlaca.setSize(150,34);
		}
		return jTextFieldPlaca;
	}
	
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
		
		getjPanelBuscarVeiculo().setLocation(0, 109);
		getjPanelCentroGerarOS().add(getjPanelBuscarVeiculo());
		
		getjPanelBordaInformacaoVeiculo().setLocation(0, 167);
		getjPanelCentroGerarOS().add(getjPanelBordaInformacaoVeiculo());
		
		
	}
	
	public void addComponentesJPanelBuscarVeiculo() {
		
		getjLabelNum().setLocation(10, 12);
		getjPanelBuscarVeiculo().add(getjLabelNum());
		
		getjLabelPlaca().setLocation(160, 12);
		getjPanelBuscarVeiculo().add(getjLabelPlaca());
		
		getjLabelVin().setLocation(415, 12);
		getjPanelBuscarVeiculo().add(getjLabelVin());
		
		getjTextFieldNum().setLocation(42, 12);
		getjPanelBuscarVeiculo().add(getjTextFieldNum());
		
		getjTextFieldPlaca().setLocation(242, 12);
		getjPanelBuscarVeiculo().add(getjTextFieldPlaca());
		
		getjTextFieldVin().setLocation(472, 12);
		getjPanelBuscarVeiculo().add(getjTextFieldVin());
	}
	
	public void addComponentesJPanelBordaInformacaoVeiculo() {
		getjPanelInformacaoVeiculo().setLocation(6, 4);
		getjPanelBordaInformacaoVeiculo().add(getjPanelInformacaoVeiculo());
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
