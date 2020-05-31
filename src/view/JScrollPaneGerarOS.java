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
	
	private Color azulMarinho = new Color(100, 132, 147);
	private Color cinzaEscuro = new Color(51,51,51);
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
	 
     
    private JLabel jLabelVin;
    private JLabel jLabelNum;
    private JLabel jLabelPlaca;
    private JTextField jTextField1;     
    private JTextField jTextField2;     
    private JTextField jTextField4;
    

	public JScrollPaneGerarOS() {
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
		}
		return jPanelBordaInformacaoVeiculo;
	}


	public JPanel getjPanelInformacaoVeiculo() {
		if(jPanelInformacaoVeiculo == null){
			jPanelInformacaoVeiculo = new JPanel();
			jPanelInformacaoVeiculo.setBackground(Color.WHITE); 
	        jPanelInformacaoVeiculo.setPreferredSize(new Dimension(838, 830));
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


	public JTextField getjTextField1() {
		if(jTextField1 == null){
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}


	public JTextField getjTextField2() {
		if(jTextField2 == null){
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}


	public JTextField getjTextField4() {
		if(jTextField4 == null){
			jTextField4 = new JTextField();
		}
		return jTextField4;
	}
	
	
	public void addComponentesJScrollPaneGerarOS() {
		this.setViewportView(getjPanelGerarOS());
	}
	
	
	public void addComponentesJPanelGerarOS() {		
		getjPanelGerarOS().add(getjPanelCentroGerarOS());
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
	}
	
	public void addComponentesJPanelBuscarVeiculo() {
		
		getjLabelNum().setLocation(10, 12);
		getjPanelBuscarVeiculo().add(getjLabelNum());
		
		getjLabelPlaca().setLocation(160, 12);
		getjPanelBuscarVeiculo().add(getjLabelPlaca());
		
		getjLabelVin().setLocation(415, 12);
		getjPanelBuscarVeiculo().add(getjLabelVin());
	}
}
