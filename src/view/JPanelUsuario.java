package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Insets;

public class JPanelUsuario extends JPanel {
	
	// ### Inicio declara��o de vari�veis ###
	private JPanel jPanelFundo; //painel que fica no fundo como base para adiciona os outros paineis
	private JPanel jPanelCentro; // painel que fica no centro para exibi��o de usuarios
	private JPanel jPanelBotoes; // painel que vai fica os butoes e icones
	
	// ### fim declara��o de vari�veis ###
	
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
			configuracoesDoGrid2.ipadx = 300;
			configuracoesDoGrid2.ipady = 30;
			configuracoesDoGrid2.fill = GridBagConstraints.BOTH;
			jPanelFundo.add(getjPanelBotoes(), configuracoesDoGrid2);
			
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
			jPanelBotoes.setBackground(Color.RED);
			
	
		}
		return jPanelBotoes;
	}
	
	
	
	
	// ### fim gets dos paineis ###
}
