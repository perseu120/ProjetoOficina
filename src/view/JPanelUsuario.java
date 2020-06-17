package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Insets;

public class JPanelUsuario extends JPanel {
	
	// ### Inicio declaração de variáveis ###
	private JPanel jPanelFundo; //painel que fica no fundo como base para adiciona os outros paineis
	private JPanel jPanelCentro; // painel que fica no centro para exibição de usuarios
	private JPanel jPanelBotoes; // painel que vai fica os butoes e icones
	
	private JButton jButtonAdicionar;
	private JButton jButtonEditar;
	private JButton jButtonRemover;
	
	

	// ### fim declaração de variáveis ###
	
	public JPanelUsuario() {
		initComponentes();
		
		
	}
	
	private void initComponentes(){
		this.setLayout( new BorderLayout(0,0));
		this.setSize(800,600);
		this.add(getjPanelFundo());
	}

	
	// ### Inicio gets dos paineis ###
	
	public JPanel getjPanelFundo() {// painel que fica no fundo para poder posiciona o painel no centro e o painel dos icones abaixo do paienl do centro
		
		if(jPanelFundo == null){
			jPanelFundo = new JPanel();
			
			GridBagLayout layout = new GridBagLayout();
			GridBagConstraints configuracoesDoGrid = new GridBagConstraints();	
			configuracoesDoGrid.gridx = 0;
			configuracoesDoGrid.gridy = 0;
			configuracoesDoGrid.ipadx = 300;
			configuracoesDoGrid.ipady = 300;
			
			jPanelFundo.setLayout(layout);
			jPanelFundo.add(getjPanelCentro(), configuracoesDoGrid);
			jPanelFundo.setBackground(Color.GRAY);
			GridBagConstraints configuracoesDoGrid2 = new GridBagConstraints();	
			
			configuracoesDoGrid2.gridx= 0;
			configuracoesDoGrid2.gridy = 1;
			configuracoesDoGrid2.ipadx = 33;
			configuracoesDoGrid2.ipady = 20;
			configuracoesDoGrid2.anchor = GridBagConstraints.WEST;
			jPanelFundo.add( getjPanelBotoes(), configuracoesDoGrid2 );
			
		}
		
		return jPanelFundo;
	}

	public JPanel getjPanelCentro() {//painel que fica no centro da tela onde vai ser exibido os usuarios
		
		if(jPanelCentro == null){
			
			jPanelCentro = new JPanel();
			jPanelCentro.setLayout(new GridLayout(1,2));
			jPanelCentro.setSize(300, 200);
			jPanelCentro.add(new JButton("Usuario cadastrado"));
			jPanelCentro.add(new JButton("detalhes do usuario"));
			
		}
		return jPanelCentro;
	}

	public JPanel getjPanelBotoes() {
		
		if(jPanelBotoes == null){
	
			jPanelBotoes = new JPanel();
			jPanelBotoes.setLayout(new GridBagLayout());
	
			
			GridBagConstraints configuracoesDoGridbotao1 = new GridBagConstraints();
			configuracoesDoGridbotao1.gridx= 0;
			configuracoesDoGridbotao1.gridy = 0;
			configuracoesDoGridbotao1.insets = new Insets(5, 0, 0, 10);
			
			GridBagConstraints configuracoesDoGridbotao2 = new GridBagConstraints();
			configuracoesDoGridbotao2.gridx= 2;
			configuracoesDoGridbotao2.gridy = 0;		
			configuracoesDoGridbotao2.insets = new Insets(5, 0, 0, 10);

			
			GridBagConstraints configuracoesDoGridbotao3 = new GridBagConstraints();
			configuracoesDoGridbotao3.gridx= 1;
			configuracoesDoGridbotao3.gridy = 0;	
			configuracoesDoGridbotao3.insets = new Insets(5, 0, 0, 10);
			
			
			jPanelBotoes.add(getjButtonAdicionar(), configuracoesDoGridbotao1);
			jPanelBotoes.add(getjButtonEditar(), configuracoesDoGridbotao3);
			jPanelBotoes.add(getjButtonRemover(), configuracoesDoGridbotao2);
			
	
		}
		return jPanelBotoes;
	}

	public JButton getjButtonAdicionar() {
	
	// ### fim gets dos paineis ###
	
	// ### Inicio gets dos botões ###
	
		
		if(jButtonAdicionar == null){
	
			jButtonAdicionar = new JButton();
			jButtonAdicionar.setIcon(new ImageIcon( getClass().getResource("/icons/add_user_48.png")));
	
		}
		return jButtonAdicionar;
	}

	public JButton getjButtonEditar() {
		
		if(jButtonEditar == null){
	
			jButtonEditar = new JButton();
			jButtonEditar.setIcon(new ImageIcon(getClass().getResource("/icons/edit_user_48.png")));
	
		}
		return jButtonEditar;
	}

	public JButton getjButtonRemover() {
		
		if(jButtonRemover == null){
	
			jButtonRemover = new JButton();
			jButtonRemover.setIcon(new ImageIcon(getClass().getResource("/icons/delet_user_48.png")));
	
		}
		return jButtonRemover;
	}
	
	
	// ### Inicio gets dos botões ###
	
	
	
}
