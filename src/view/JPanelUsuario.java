package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
			GridBagConstraints configuracoesDoGrid = new GridBagConstraints();	//criando o containes para seta os componentes no gridbeg
			configuracoesDoGrid.gridx = 0;//seta onde da tabela o componente vai fica posição x
			configuracoesDoGrid.gridy = 0;//seta onde da tabela o componente vai fica posição y
			configuracoesDoGrid.ipadx = 300;//comprimento da primeira grande do gridbag em pixel X
			configuracoesDoGrid.ipady = 300;//comprimento da primeira grade do gridbag em pixel Y
			
			jPanelFundo.setLayout(layout);
			jPanelFundo.add(getjPanelCentro(), configuracoesDoGrid);// adicionando o painel na primeira linha da grade
			jPanelFundo.setBackground(Color.GRAY);
			
			GridBagConstraints configuracoesDoGrid2 = new GridBagConstraints();	//criando o segundo containe
			configuracoesDoGrid2.gridx= 0; //seta onde da tabela o componente vai fica posição x
			configuracoesDoGrid2.gridy = 1;//seta onde da tavela o componente vai fica posição y
			configuracoesDoGrid2.anchor = GridBagConstraints.WEST; //posição de onde os componentes vao fica ancorado
			jPanelFundo.add( getjPanelBotoes(), configuracoesDoGrid2 );
			
		}
		
		return jPanelFundo;
	}

	public JPanel getjPanelCentro() {//painel que fica no centro da tela onde vai ser exibido os usuarios
		
		if(jPanelCentro == null){
			
			jPanelCentro = new JPanel();
			jPanelCentro.setSize(300, 200);
			jPanelCentro.setLayout(new GridLayout(1,2));
			jPanelCentro.add(new JButton("Usuario cadastrado"));
			jPanelCentro.add(new JButton("detalhes do usuario"));
			
		}
		return jPanelCentro;
	}

	public JPanel getjPanelBotoes() {
		
		if(jPanelBotoes == null){
	
			jPanelBotoes = new JPanel();
			FlowLayout layoutFlow = new FlowLayout();
			layoutFlow.setHgap(8);
			layoutFlow.setVgap(5);
			
			jPanelBotoes.setLayout(layoutFlow);
			
			
			jPanelBotoes.add(getjButtonAdicionar());
			jPanelBotoes.add(getjButtonEditar());
			jPanelBotoes.add(getjButtonRemover());
			
	
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
