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
	
	private Color azulMarinho = new Color(100, 132, 147); //salvando as cores
	private Color cinzaEscuro = new Color(51,51,51);
	private Color cinzaClaro = new Color(235,235,235);
	private Color foregroudJButton = new Color(204,204,204);
	
	private Font fontJButton = new Font("Arial",1,24);
	
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


	public JScrollPaneGerarOS getjScrollPaneOS() {
		this.setBorder(null);
		//this.setPreferredSize(new Dimension(870,600));
		return this;
	}


	public JPanel getjPanelGerarOS() {
		if(jPanelGerarOS == null){
			jPanelGerarOS = new JPanel();
			jPanelGerarOS.setBackground(azulMarinho);
			jPanelGerarOS.setBorder(null);
			jPanelGerarOS.setPreferredSize(new Dimension(1000,1000));
		}
		return jPanelGerarOS;
	}


	public JPanel getjPanelCentroGerarOS() {
		if(jPanelCentroGerarOS == null){
			jPanelCentroGerarOS = new JPanel();
	        jPanelCentroGerarOS.setLayout(null);
			jPanelCentroGerarOS.setBackground(azulMarinho);
	        jPanelCentroGerarOS.setBorder(null);
	        jPanelCentroGerarOS.setPreferredSize(new Dimension(850, 950));
		}
		return jPanelCentroGerarOS;
	}


	public JPanel getjPanelBuscarVeiculo() {
		if(jPanelBuscarVeiculo == null){
			jPanelBuscarVeiculo = new JPanel();
			jPanelBuscarVeiculo.setBackground(cinzaEscuro);
	        jPanelBuscarVeiculo.setLayout(null);
	        jPanelBuscarVeiculo.setSize(850,58);
		}
		return jPanelBuscarVeiculo;
	}


	public JPanel getjPanelBordaInformacaoVeiculo() {
		if(jPanelBordaInformacaoVeiculo == null){
			jPanelBordaInformacaoVeiculo = new JPanel();
	        jPanelBordaInformacaoVeiculo.setLayout(null);
			jPanelBordaInformacaoVeiculo.setBackground(cinzaEscuro);
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


	public JButton getjButtonVeiculo() {
		if(jButtonVeiculo == null){
			jButtonVeiculo = new JButton();
			jButtonVeiculo.setBackground(cinzaEscuro);
	        jButtonVeiculo.setFont(new Font("Arial", 1, 24));
	        jButtonVeiculo.setForeground(new Color(204, 204, 204));
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
			jButtonCliente.setBackground(cinzaEscuro);
	        jButtonCliente.setFont(fontJButton);
	        jButtonCliente.setForeground(foregroudJButton);
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
			jButtonServico.setBackground(cinzaEscuro);
	        jButtonServico.setFont(fontJButton);
	        jButtonServico.setForeground(foregroudJButton);
	        jButtonServico.setIcon(new ImageIcon(getClass().getResource(iconServico)));
	        jButtonServico.setText(" Serviço");
	        jButtonServico.setContentAreaFilled(false);
	        jButtonServico.setOpaque(true);
	        jButtonServico.setSize(190,58);
	        jButtonServico.setVerticalAlignment(javax.swing.SwingConstants.TOP);
		}
		return jButtonServico;
	}


	public JLabel getjLabelVin() {
		if(jLabelVin == null){
			jLabelVin = new JLabel();
			jLabelVin.setFont(fontJButton);
	        jLabelVin.setForeground(foregroudJButton);
	        jLabelVin.setText("Vin :");
	        jLabelVin.setSize(80,29);
		}
		return jLabelVin;
	}


	public JLabel getjLabelNum() {
		if(jLabelNum == null){
			jLabelNum = new JLabel();
			jLabelNum.setFont(fontJButton);
	        jLabelNum.setForeground(foregroudJButton);
	        jLabelNum.setText("Nº");
	        jLabelNum.setSize(26,29);
		}
		return jLabelNum;
	}


	public JLabel getjLabelPlaca() {
		if(jLabelPlaca == null){
			jLabelPlaca = new JLabel();
			jLabelPlaca.setFont(fontJButton);
	        jLabelPlaca.setForeground(foregroudJButton);
	        jLabelPlaca.setText("Placa :");
	        jLabelPlaca.setSize(80,29);
		}
		return jLabelPlaca;
	}


	public JTextField getjTextFieldVin() {
		if(jTextFieldVin == null){
			jTextFieldVin = new JTextField();
			jTextFieldVin.setBackground(cinzaClaro);
	        jTextFieldVin.setFont(new java.awt.Font("Arial", 1, 24));
	        jTextFieldVin.setHorizontalAlignment(JTextField.RIGHT);
	        jTextFieldVin.setSize(250,34);
		}
		return jTextFieldVin;
	}


	public JTextField getjTextFieldNum() {
		if(jTextFieldNum == null){
			jTextFieldNum = new JTextField();
			jTextFieldNum.setBackground(cinzaClaro);
	        jTextFieldNum.setFont(new java.awt.Font("Arial", 1, 24));
	        jTextFieldNum.setHorizontalAlignment(JTextField.RIGHT);
	        jTextFieldNum.setSize(100,34);
		}
		return jTextFieldNum;
	}


	public JTextField getjTextFieldPlaca() {
		if(jTextFieldPlaca == null){
			jTextFieldPlaca = new JTextField();
			jTextFieldPlaca.setBackground(cinzaClaro);
	        jTextFieldPlaca.setFont(new java.awt.Font("Arial", 1, 24));
	        jTextFieldPlaca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
	        jTextFieldPlaca.setSize(150,34);
		}
		return jTextFieldPlaca;
	}
	
	
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
	
	// ### Métodos da classe ###
	
	public JLabel getJLabelTitulo() {
		if( jLabelTitulo == null) {
			jLabelTitulo = new JLabel();
			jLabelTitulo.setText("Gerar ordem de serviço");
			jLabelTitulo.setIcon(new ImageIcon(getClass().getResource(iconGerarOS)));
		}
		return jLabelTitulo;
	}
}
