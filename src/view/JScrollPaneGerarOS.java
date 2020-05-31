package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class JScrollPaneGerarOS extends JPanel {
	
	Color azulMarinho = new Color(100, 132, 147);

	private JScrollPane jScrollPaneOS;
	private JPanel jPanelGerarOS;
	private JPanel jPanelCentroGerarOS;
	private JPanel jPanelBuscarVeiculo;
	private JPanel jPanelBordaInformacaoVeiculo;
	private JPanel jPanelInformacaoVeiculo;
	private JButton jButtonVeiculo;
	private JButton jButtonCliente;
	private JButton jButtonServico;
	 
     
    private JLabel jLabel1;
    private JLabel jLabel8;
    private JLabel jLabel10;
    private JTextField jTextField1;     
    private JTextField jTextField2;     
    private JTextField jTextField4;
    

	public JScrollPaneGerarOS() {
    	 
     }


	public JScrollPane getjScrollPaneOS() {
		if(jScrollPaneOS == null){
			jScrollPaneOS = new JScrollPane();
		}
		return jScrollPaneOS;
	}


	public JPanel getjPanelGerarOS() {
		if(jPanelGerarOS == null){
			jPanelGerarOS = new JPanelLogin();
		}
		return jPanelGerarOS;
	}


	public JPanel getjPanelCentroGerarOS() {
		if(jPanelCentroGerarOS == null){
			jPanelCentroGerarOS = new JPanelLogin();
	        jPanelCentroGerarOS.setLayout(null);
			jPanelCentroGerarOS.setBackground(azulMarinho);
	        jPanelCentroGerarOS.setBorder(null);
	        jPanelCentroGerarOS.setPreferredSize(new java.awt.Dimension(850, 1000));
		}
		return jPanelCentroGerarOS;
	}


	public JPanel getjPanelBuscarVeiculo() {
		if(jPanelBuscarVeiculo == null){
			jPanelBuscarVeiculo = new JPanelLogin();
		}
		return jPanelBuscarVeiculo;
	}


	public JPanel getjPanelBordaInformacaoVeiculo() {
		if(jPanelBordaInformacaoVeiculo == null){
			jPanelBordaInformacaoVeiculo = new JPanelLogin();
		}
		return jPanelBordaInformacaoVeiculo;
	}


	public JPanel getjPanelInformacaoVeiculo() {
		if(jPanelInformacaoVeiculo == null){
			jPanelInformacaoVeiculo = new JPanelLogin();
		}
		return jPanelInformacaoVeiculo;
	}


	public JButton getjButtonVeiculo() {
		if(jButtonVeiculo == null){
			jButtonVeiculo = new JButton();
		}
		return jButtonVeiculo;
	}


	public JButton getjButtonCliente() {
		if(jButtonCliente == null){
			jButtonCliente = new JButton();
		}
		return jButtonCliente;
	}


	public JButton getjButtonServico() {
		if(jButtonServico == null){
			jButtonServico = new JButton();
		}
		return jButtonServico;
	}


	public JLabel getjLabel1() {
		if(jLabel1 == null){
			jLabel1 = new JLabel();
		}
		return jLabel1;
	}


	public JLabel getjLabel8() {
		if(jLabel8 == null){
			jLabel8 = new JLabel();
		}
		return jLabel8;
	}


	public JLabel getjLabel10() {
		if(jLabel10 == null){
			jLabel10 = new JLabel();
		}
		return jLabel10;
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
	
	
     
}
