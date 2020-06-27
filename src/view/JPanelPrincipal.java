/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;


/**
 *
 * @author Willian
 */

public class JPanelPrincipal extends JPanel {
	

	private final String img = "/images/images_1.png"; // Salva caminho da imagem de fundo da tela	
	
	// ### Inicio declaração de variáveis ###
	
	private Color corDosBotoesEMenuLateral = new Color(5,5,5);
	private Color corDaBarraMenuEButton = new Color(45,45,45);
	private Color corDosJButtonsDosJButtons = new Color(204,204,204);
	private Color corDoJPanelUsuario = new Color(5,5,5);
	
	private Color foregroundJButton = new Color(5,5,5,0);
	
	private JButton jButtonMenuBar;
	private JButton jButtonMinimiza;
	private JButton jButtonRedimenciona;
	private JButton jButtonFecharPrograma;
	private JButton jButtonHome;
	private JButton jButtonOS;
	private JButton jButtonGerarOS;
	private JButton jButtonConsultarOS;
	private JButton jButtonOrcamento;
	private JButton jButtonVeiculos;
	private JButton jButtonClientes;
	private JButton jButtonFaturamento;
	private JButton jButtonAddUsuarios;	
	private JButton jButtonConfiguracao;	
	private JButton jButton10;
	private JButton jButton11;	
	
	private JLabel jLabelFundojPanelHome;	
	private JLabel jLabelIconeUsuario;
	private JLabel jLabelNomeUsuario;
	private JLabel jLabelLogoProjeto;
	private JLabel jLabelDescricaoTela;
	
	private JPanel jPanelCenterPrincipal;
	private JPanel jPanelHome;
	
	private JPanel jPanelUsuarioWest;
	private JPanel jPanelWestPrincipal;
	private JScrollPane jScrollPaneButtonsWest;
	private JPanel alteraJPanelCentral; // Variavel que recebe a o novo JScrollPane da parte central da classe.
	private JPanel jPanelButtons;
	private JPanel jPanelJButtonOS;
	private JPanel jPanelJButtonConfiguracao;
	private JPanel jPanelNorthCenter;		
	private JPanel jPanelWestNorth;
	private JPanel jPanelEastNorth;
	
	private JLabel jLabelNomeDaTela;
	
	// ### Fim dlecaração de variáveis ###
	
	public JPanelPrincipal() {		
		initComponents(); // inicializa os componentes da classe.
		
	}
	

	private void initComponents() {
		
		// ##Parte West do JPanelPrincipal## // Menu lateral
		this.getjButtonHome();
		this.getjButtonOS();
		this.getjButtonGerarOS();
		this.getjButtonConsultarOS();
		this.getjPanelJButtonOS();
		this.getJPanelButtonOSAddComponentes();
		this.getjButtonOrcamento();
		this.getjButtonVeiculos();
		this.getjButtonClientes();
		this.getjButtonFaturamento();
		this.getjButtonAddUsuarios();
		this.getjButtonConfiguracao();
		this.getjButton10();
		this.getjButton11();
		this.getjPanelJButtonConfiguracao();		
		this.getJPanelButtonConfiguracaoAddComponentes();
		
		this.getjPanelButtons();
		this.getjPanelButtonsAddComponentes();
		
		this.getjScrollPaneButtonsWest();
		this.getjScrollPaneButtonsWestAddComponentes();		
		
		this.getjLabelIconeUsuario();
		this.getjLabelNomeUsuario();
		
		this.getjPanelUsuarioWest();
		this.getjPanelWestAddComponentes();
		
		this.getjPanelWestPrincipal();
		this.AddComponentesJPanelWestPrincipal();
		
		// ##Parte North do JPanelPrincipal## // Barra de menu
		this.getjPanelWestNorth();
		this.addComponentesJPanelWestNorth();
		this.getjPanelEastNorth();
		this.addComponentesJPanelEastNorth();
		this.getjPanelEastNorth();
		this.getjPanelNorthCenter();
		this.AddComponentesJPanelNorthCenter();
		
		// ##Parte Center do JPanelPrincipal## // Imagem da parte central
		this.getjLabelFundojPanelHome();
		this.getjPanelHome();
		this.AddComponentesJPanelHome();
		this.getjPanelCenterPrincipal();
		this.AddComponentesJPanelCenterPrincipal();
		this.getJPanelPrincipal();
		this.AddComponentesJPanelPrincipal();
		 
	}	
	
	// ### Inicio dos gets do jPanel ###
	
	public JPanelPrincipal getJPanelPrincipal() { // Retorna os parametros de definições da própia classe
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(null);
		this.setOpaque(false);
		this.setPreferredSize(new Dimension(800,600));
		return this;
	}	
	
	public JPanel getjPanelWestPrincipal() { // Que contem os componentes do menú lateral
		if(jPanelWestPrincipal == null){
			jPanelWestPrincipal = new JPanel();
			jPanelWestPrincipal.setLayout(new BorderLayout());
			jPanelWestPrincipal.setBackground(corDoJPanelUsuario);
			jPanelWestPrincipal.setSize(85,800); // Setado como 85 para evitar conflitos com o layout BorderLayout

		}
		return jPanelWestPrincipal;
	}

	
	public JPanel getjPanelUsuarioWest() { //jPanelUsuarioWest contém os dados do usuários de login
		if(jPanelUsuarioWest == null){
			jPanelUsuarioWest = new JPanel();
			jPanelUsuarioWest.setBackground(corDoJPanelUsuario);
			jPanelUsuarioWest.setBorder(null);
			jPanelUsuarioWest.setOpaque(true);
			jPanelUsuarioWest.setPreferredSize(new Dimension(265, 200));
		}
		return jPanelUsuarioWest;
	}

	
	public JScrollPane getjScrollPaneButtonsWest() { // JScroolPane que contém o JPanel que contem os JButtons do Menu Lateral
		if(jScrollPaneButtonsWest == null){
			jScrollPaneButtonsWest = new JScrollPane();
			jScrollPaneButtonsWest.setBackground(corDoJPanelUsuario);
			jScrollPaneButtonsWest.setBorder(new LineBorder(new Color(0, 0, 0), 0));
			jScrollPaneButtonsWest.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			jScrollPaneButtonsWest.setViewportBorder(null);
			jScrollPaneButtonsWest.setAutoscrolls(true);
			jScrollPaneButtonsWest.setFocusCycleRoot(true);
			jScrollPaneButtonsWest.setOpaque(true);
			jScrollPaneButtonsWest.setPreferredSize(new Dimension(265, 1100));

		}
		return jScrollPaneButtonsWest;
	}
	
	
	public JPanel getAlteraJScrollPaneCentral() {
		return alteraJPanelCentral;
	}
	

	public JPanel getjPanelButtons() { // JPanel que contem os jButtons do menu lateral
		if(jPanelButtons == null){
			jPanelButtons = new JPanel();
			jPanelButtons.setBackground(corDosBotoesEMenuLateral);
			jPanelButtons.setBorder(null);
			jPanelButtons.setPreferredSize(new Dimension(265, 600));

		}
		return jPanelButtons;
	}
	

	public JPanel getjPanelCenterPrincipal() {
		if(jPanelCenterPrincipal == null){
			jPanelCenterPrincipal = new JPanel();
			jPanelCenterPrincipal.setLayout(new BorderLayout());
			jPanelCenterPrincipal.setSize(400,800);
		}
		return jPanelCenterPrincipal;
	}
	
	

	public JPanel getjPanelNorthCenter() {
		if(jPanelNorthCenter == null){
			jPanelNorthCenter = new JPanel();
			jPanelNorthCenter.setLayout(new BorderLayout());
			jPanelNorthCenter.setBackground(corDaBarraMenuEButton);
			jPanelNorthCenter.setPreferredSize(new Dimension(1027, 70));
		}
		return jPanelNorthCenter;
	}
	
	
	public JPanel getjPanelWestNorth() {
		if(jPanelWestNorth == null) {
			jPanelWestNorth = new JPanel();
			jPanelWestNorth.setOpaque(false);
			jPanelWestNorth.setPreferredSize(new Dimension(280, 100));
			FlowLayout fl_jPanelWestNorth = new FlowLayout(FlowLayout.LEFT, 2, 0);
			jPanelWestNorth.setLayout(fl_jPanelWestNorth);
		}
		return jPanelWestNorth;
	}
	
	
	public JPanel getjPanelEastNorth() {
		if(jPanelEastNorth == null) {
			jPanelEastNorth = new JPanel();
			FlowLayout flowLayout = (FlowLayout) jPanelEastNorth.getLayout();
			flowLayout.setVgap(3);
			flowLayout.setAlignment(FlowLayout.LEFT);
			jPanelEastNorth.setOpaque(false);
			jPanelEastNorth.setPreferredSize(new Dimension(190, 100));
		}
		return jPanelEastNorth;
	}
	
	
	public JPanel getjPanelJButtonOS() {
		if(jPanelJButtonOS == null){
			jPanelJButtonOS = new JPanel();
			jPanelJButtonOS.setBackground(new Color(0, 0, 0));
			jPanelJButtonOS.setRequestFocusEnabled(false);
			jPanelJButtonOS.setVisible(false);
		}
		return jPanelJButtonOS;
	}
	

	public JPanel getjPanelJButtonConfiguracao() {
		if(jPanelJButtonConfiguracao == null){
			jPanelJButtonConfiguracao = new JPanel();
			jPanelJButtonConfiguracao.setBackground(new Color(0, 0, 0));
			jPanelJButtonConfiguracao.setRequestFocusEnabled(false);
			jPanelJButtonConfiguracao.setVisible(false);
		}
		return jPanelJButtonConfiguracao;
	}
	
	
	public JPanel getjPanelHome() {
		if(jPanelHome == null){
			jPanelHome = new JPanel();
			jPanelHome.setBackground(SystemColor.desktop);
			jPanelHome.setLayout(new BorderLayout());
			
		}
		return jPanelHome;
	}
	
	
	
	
	
	// ### Fim  dos  gets  dos  jPanel ###
	// ------------------------------------
	// ### Inicio  dos  get  dos  label ### 
	
	
	public JLabel getjLabelFundojPanelHome() { // Imagem de fundo da parte central da classe
		if(jLabelFundojPanelHome == null){
			jLabelFundojPanelHome = new JLabel();
			jLabelFundojPanelHome.setBackground(Color.CYAN);
			jLabelFundojPanelHome.setForeground(new Color(102, 102, 102));
			jLabelFundojPanelHome.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelFundojPanelHome.setHorizontalTextPosition(SwingConstants.CENTER);
		}
		return jLabelFundojPanelHome;
	}
	
	
	public JLabel getjLabelIconeUsuario() { // JLabel Para exibir imagem(opcional) do usuario que efeutuou o login.
		if(jLabelIconeUsuario == null){
			jLabelIconeUsuario = new JLabel();
			jLabelIconeUsuario.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/user_100.png")));
			jLabelIconeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelIconeUsuario.setVisible(false);
			
		}
		return jLabelIconeUsuario;
	}
	

	public JLabel getjLabelNomeUsuario() { // JLabel Para exibir nome do usuario que efeutuou o login.
		if(jLabelNomeUsuario == null){
			jLabelNomeUsuario = new JLabel();
			jLabelNomeUsuario.setFont(new Font("Arial", 1, 24));
			jLabelNomeUsuario.setForeground(new Color(255, 255, 255));
			jLabelNomeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelNomeUsuario.setText("Usuário");
			jLabelNomeUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabelNomeUsuario.setVisible(false);

		}
		return jLabelNomeUsuario;
	}
	
	
	private JLabel getJLabelNomeDaTela() {
		if (jLabelNomeDaTela == null) {
			jLabelNomeDaTela = new JLabel("New");
			jLabelNomeDaTela.setForeground(new Color(240,240,240));
			jLabelNomeDaTela.setFont(new Font("Arial", Font.BOLD, 24));
			//lblNewLabel.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/OS_48.png")));
		}
		return jLabelNomeDaTela;
	}	


	public JLabel getjLabelLogoProjeto() {
		if(jLabelLogoProjeto == null){
			jLabelLogoProjeto = new JLabel();
			jLabelLogoProjeto.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelLogoProjeto.setPreferredSize(new Dimension(80,64));
		}
		return jLabelLogoProjeto;
	}


	public JLabel getjLabelDescricaoTela() {
		if(jLabelDescricaoTela== null){
			jLabelDescricaoTela = new JLabel();
			jLabelDescricaoTela.setFont(new Font("Tahoma", Font.BOLD, 20));
			jLabelDescricaoTela.setText("Home");
		}
		return jLabelDescricaoTela;
	}


	private void setJlabel(String string, ImageIcon icon) {
		jLabelNomeDaTela.setText(string);
		jLabelNomeDaTela.setIcon(icon);
	}
	
	
	// ### Fim  dos  gets dos  jLabel ###
	// ---------------------------------
	// ### Inicio dos gets dos jButtons ###
	
	public JButton getjButtonMenuBar() { // JButton controlador do menu lateral "jPanelWestPrincipal".
		if (jButtonMenuBar == null) {
			jButtonMenuBar = new JButton();
			jButtonMenuBar.setBackground(corDaBarraMenuEButton);
			jButtonMenuBar.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/menu_64.png")));
			jButtonMenuBar.setBorder(null);
			jButtonMenuBar.setBorderPainted(false);
			jButtonMenuBar.setContentAreaFilled(false);
			jButtonMenuBar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonMenuBar.setOpaque(true);
			
		}
		return jButtonMenuBar;
	}

	
	public JButton getjButtonHome() { 
		if (jButtonHome == null) {
			jButtonHome = new JButton();
			jButtonHome.setBackground(corDosBotoesEMenuLateral);
			jButtonHome.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonHome.setForeground(foregroundJButton);
			jButtonHome.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/home_48_blue.png"))); 
			jButtonHome.setText(" Iniciar");
			jButtonHome.setBorder(null);
			jButtonHome.setBorderPainted(false);
			jButtonHome.setContentAreaFilled(false);
			jButtonHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonHome.setHideActionText(true);
			jButtonHome.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonHome.setOpaque(true);
		}
		return jButtonHome;
	}
		
	
	public JButton getjButtonOS() {
		if (jButtonOS == null) {
			jButtonOS = new JButton();
			jButtonOS.setBackground(corDosBotoesEMenuLateral);
			jButtonOS.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonOS.setForeground(foregroundJButton);
			jButtonOS.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/OS_48_blue.png"))); 
			jButtonOS.setText(" O.S");
			jButtonOS.setBorder(null);
			jButtonOS.setBorderPainted(false);
			jButtonOS.setContentAreaFilled(false);
			jButtonOS.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonOS.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonOS.setOpaque(true);
		}
		return jButtonOS;
	}
	
	
	public JButton getjButtonOrcamento() {
		if (jButtonOrcamento == null) {
			jButtonOrcamento = new JButton();
			jButtonOrcamento.setBackground(corDosBotoesEMenuLateral);
			jButtonOrcamento.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonOrcamento.setForeground(foregroundJButton);
			jButtonOrcamento.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/car_orcam_48_blue.png"))); 
			jButtonOrcamento.setText(" Orçamento");
			jButtonOrcamento.setBorder(null);
			jButtonOrcamento.setBorderPainted(false);
			jButtonOrcamento.setContentAreaFilled(false);
			jButtonOrcamento.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonOrcamento.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonOrcamento.setOpaque(true);
		}
		return jButtonOrcamento;
	}
	
	
	public JButton getjButtonVeiculos() {
		if (jButtonVeiculos == null) {
			jButtonVeiculos = new JButton();
			jButtonVeiculos.setBackground(corDosBotoesEMenuLateral);
			jButtonVeiculos.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonVeiculos.setForeground(foregroundJButton);
			jButtonVeiculos.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/car_48_blue.png"))); 
			jButtonVeiculos.setText(" Veículos");
			jButtonVeiculos.setBorder(null);
			jButtonVeiculos.setBorderPainted(false);
			jButtonVeiculos.setContentAreaFilled(false);
			jButtonVeiculos.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonVeiculos.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonVeiculos.setOpaque(true);
		}
		return jButtonVeiculos;
	}
	

	public JButton getjButtonClientes() {
		if (jButtonClientes == null) {
			jButtonClientes = new JButton();
			jButtonClientes.setBackground(corDosBotoesEMenuLateral);
			jButtonClientes.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonClientes.setForeground(foregroundJButton);
			jButtonClientes.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/users_48_blue.png"))); 
			jButtonClientes.setText(" Clientes");
			jButtonClientes.setBorder(null);
			jButtonClientes.setBorderPainted(false);
			jButtonClientes.setContentAreaFilled(false);
			jButtonClientes.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonClientes.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonClientes.setOpaque(true);
		}
		return jButtonClientes;
	}

	
	public JButton getjButtonFaturamento() {
		if (jButtonFaturamento == null) {
			jButtonFaturamento = new JButton();
			jButtonFaturamento.setBackground(corDosBotoesEMenuLateral);
			jButtonFaturamento.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonFaturamento.setForeground(foregroundJButton);
			jButtonFaturamento.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/estimate-48_blue.png"))); 
			jButtonFaturamento.setText(" Faturamento");
			jButtonFaturamento.setBorder(null);
			jButtonFaturamento.setBorderPainted(false);
			jButtonFaturamento.setContentAreaFilled(false);
			jButtonFaturamento.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonFaturamento.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonFaturamento.setOpaque(true);
			
		}
		return jButtonFaturamento;
	}

	
	public JButton getjButtonAddUsuarios() {
		if (jButtonAddUsuarios == null) {
			jButtonAddUsuarios = new JButton();
			jButtonAddUsuarios.setBackground(corDosBotoesEMenuLateral);
			jButtonAddUsuarios.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonAddUsuarios.setForeground(foregroundJButton);
			jButtonAddUsuarios.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/use_conf_48_blue.png"))); 
			jButtonAddUsuarios.setText(" Usu\u00E1rio");
			jButtonAddUsuarios.setBorder(null);
			jButtonAddUsuarios.setBorderPainted(false);
			jButtonAddUsuarios.setContentAreaFilled(false);
			jButtonAddUsuarios.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonAddUsuarios.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonAddUsuarios.setOpaque(true);
			
		}
		return jButtonAddUsuarios;
	}
	
			
	public JButton getjButtonConfiguracao() {
		if (jButtonConfiguracao == null) {
			jButtonConfiguracao = new JButton();
			jButtonConfiguracao.setBackground(corDosBotoesEMenuLateral);
			jButtonConfiguracao.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			jButtonConfiguracao.setForeground(foregroundJButton);
			jButtonConfiguracao.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/conf_48_blue.png")));
			jButtonConfiguracao.setText(" Configurações");
			jButtonConfiguracao.setBorder(null);
			jButtonConfiguracao.setBorderPainted(false);
			jButtonConfiguracao.setContentAreaFilled(false);
			jButtonConfiguracao.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonConfiguracao.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonConfiguracao.setOpaque(true);
			
		}
		return jButtonConfiguracao;
	}
	
		
	public JButton getjButtonGerarOS() {
		if(jButtonGerarOS == null){
			jButtonGerarOS = new JButton();
			jButtonGerarOS.setBackground(corDosJButtonsDosJButtons);
			jButtonGerarOS.setFont(new Font("Trebuchet MS", 1, 18)); 
			jButtonGerarOS.setText(" Gerar O.S.");
			jButtonGerarOS.setBorder(null);
			jButtonGerarOS.setBorderPainted(false);
			jButtonGerarOS.setContentAreaFilled(false);
			jButtonGerarOS.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonGerarOS.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonGerarOS.setOpaque(true);
		}
		return jButtonGerarOS;
	}



	public JButton getjButtonConsultarOS() {
		if(jButtonConsultarOS == null) {
			jButtonConsultarOS = new JButton();
			jButtonConsultarOS.setBackground(corDosJButtonsDosJButtons);
			jButtonConsultarOS.setFont(new Font("Trebuchet MS", 1, 18)); 
			jButtonConsultarOS.setText(" Consultar O.S.");
			jButtonConsultarOS.setBorder(null);
			jButtonConsultarOS.setBorderPainted(false);
			jButtonConsultarOS.setContentAreaFilled(false);
			jButtonConsultarOS.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonConsultarOS.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonConsultarOS.setOpaque(true);
		}
		return jButtonConsultarOS;
	}



	public JButton getjButton10() {
		if (jButton10 == null) {
			jButton10 = new JButton();
			jButton10.setBackground(foregroundJButton);
			jButton10.setFont(new Font("Trebuchet MS", 1, 18)); 
			jButton10.setText(" Cliente");
			jButton10.setBorder(null);
			jButton10.setBorderPainted(false);
			jButton10.setContentAreaFilled(false);
			jButton10.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButton10.setHorizontalAlignment(SwingConstants.LEFT);
			jButton10.setOpaque(true);
		}
		return jButton10;
	}


	public JButton getjButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setBackground(foregroundJButton);
			jButton11.setFont(new Font("Trebuchet MS", 1, 18)); 
			jButton11.setText(" Cliente");
			jButton11.setBorder(null);
			jButton11.setBorderPainted(false);
			jButton11.setContentAreaFilled(false);
			jButton11.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButton11.setHorizontalAlignment(SwingConstants.LEFT);
			jButton11.setOpaque(true);
		}
		return jButton11;
	}	

	public JButton getjButtonMinimiza() {
		if(jButtonMinimiza == null){
			jButtonMinimiza = new JButton();
			jButtonMinimiza.setBackground(corDaBarraMenuEButton);
			jButtonMinimiza.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/min_50.png")));
			jButtonMinimiza.setBorder(null);
			jButtonMinimiza.setBorderPainted(false);
			jButtonMinimiza.setContentAreaFilled(false);
			jButtonMinimiza.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonMinimiza.setOpaque(true);
		}
		return jButtonMinimiza;
	}


	public JButton getjButtonRedimenciona() {
		if(jButtonRedimenciona == null){
			jButtonRedimenciona = new JButton();
			jButtonRedimenciona.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/rest_tamanho.png")));
			jButtonRedimenciona.setBackground(corDaBarraMenuEButton);
			jButtonRedimenciona.setBorder(null);
			jButtonRedimenciona.setBorderPainted(false);
			jButtonRedimenciona.setContentAreaFilled(false);
			jButtonRedimenciona.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonRedimenciona.setOpaque(true);
		}
		return jButtonRedimenciona;
	}


	public JButton getjButtonFecharPrograma() {
		if(jButtonFecharPrograma == null){
			jButtonFecharPrograma = new JButton();
			jButtonFecharPrograma.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/x_50.png")));
			jButtonFecharPrograma.setBackground(corDaBarraMenuEButton);
			jButtonFecharPrograma.setBorder(null);
			jButtonFecharPrograma.setBorderPainted(false);
			jButtonFecharPrograma.setContentAreaFilled(false);
			jButtonFecharPrograma.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonFecharPrograma.setOpaque(true);
		}
		return jButtonFecharPrograma;
	}
	
	// ### Final      dos      gets     dos     botoes ###
    // ---------------------------------------------------
	// ### Inicio dos métodos de adição de componentes ###
	
	public void AddComponentesJPanelPrincipal() {
		
		this.add(getjPanelWestPrincipal());		
		getjPanelWestPrincipal().setLocation(0, 0);
		
		this.add(getjPanelCenterPrincipal());
		getjPanelCenterPrincipal().setLocation(83,0);
	}
	
	
	public void AddComponentesJPanelHome() {
		
		getjPanelHome().add(this.getjLabelFundojPanelHome(), BorderLayout.CENTER);
		
	}
	
	
	public void AddComponentesJPanelCenterPrincipal() {
		getjPanelCenterPrincipal().add(BorderLayout.NORTH,getjPanelNorthCenter());
		getjPanelCenterPrincipal().add(BorderLayout.CENTER, getjPanelHome());
	}
	
		
	public void AddComponentesJPanelWestPrincipal() {
		getjPanelWestPrincipal().add(BorderLayout.NORTH, getjPanelUsuarioWest());
		getjPanelWestPrincipal().add(BorderLayout.CENTER, getjScrollPaneButtonsWest());
	}
		
	
	public void getjPanelWestAddComponentes() {
		GroupLayout jPanelWest_Layout = new GroupLayout(this.getjPanelUsuarioWest());
		this.getjPanelUsuarioWest().setLayout(jPanelWest_Layout);
		jPanelWest_Layout.setHorizontalGroup(jPanelWest_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.getjLabelNomeUsuario(), GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(jPanelWest_Layout
						.createSequentialGroup().addContainerGap(82, Short.MAX_VALUE).addComponent(this.getjLabelIconeUsuario(),
								GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(83, Short.MAX_VALUE)));
		jPanelWest_Layout.setVerticalGroup(jPanelWest_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanelWest_Layout.createSequentialGroup().addContainerGap(31, Short.MAX_VALUE)
						.addComponent(this.getjLabelIconeUsuario(), GroupLayout.PREFERRED_SIZE, 96,
								GroupLayout.PREFERRED_SIZE)
						.addGap(5, 5, 5)
						.addComponent(this.getjLabelNomeUsuario(), GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
						.addGap(12, 12, 12)));
	}
	
	
	public void getjScrollPaneButtonsWestAddComponentes() {
		this.getjScrollPaneButtonsWest().setViewportView(this.getjPanelButtons());
	}
	
	
	public void getjPanelButtonsAddComponentes() {
		GroupLayout jPanelButtons_Layout = new GroupLayout(this.getjPanelButtons());
		jPanelButtons_Layout.setHorizontalGroup(
			jPanelButtons_Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanelButtons_Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanelButtons_Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(getjButtonFaturamento(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(getjButtonOrcamento(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(getjButtonVeiculos(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(getjButtonClientes(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(getjButtonAddUsuarios(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(getjButtonConfiguracao(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(getjPanelJButtonConfiguracao(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanelButtons_Layout.createParallelGroup(Alignment.TRAILING)
							.addComponent(getjPanelJButtonOS(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
							.addComponent(getjButtonOS(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
							.addComponent(getjButtonHome(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		jPanelButtons_Layout.setVerticalGroup(
			jPanelButtons_Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanelButtons_Layout.createSequentialGroup()
					.addGap(6)
					.addComponent(getjButtonHome(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getjButtonOS(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getjPanelJButtonOS(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getjButtonOrcamento(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getjButtonVeiculos(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getjButtonClientes(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getjButtonAddUsuarios(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getjButtonFaturamento(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getjButtonConfiguracao(), GroupLayout.DEFAULT_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(getjPanelJButtonConfiguracao(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		this.getjPanelButtons().setLayout(jPanelButtons_Layout);

	}
	
	
	public void addComponentesJPanelWestNorth() {
		getjPanelWestNorth().add(getjButtonMenuBar());
		getjPanelWestNorth().add(getjLabelLogoProjeto());
		getjPanelWestNorth().add(getjLabelDescricaoTela());
	}
	
	
	public void addComponentesJPanelEastNorth() {
		getjPanelEastNorth().add(getjButtonMinimiza());
		getjPanelEastNorth().add(getjButtonRedimenciona());
		getjPanelEastNorth().add(getjButtonFecharPrograma());
	}
	
				
	public void AddComponentesJPanelNorthCenter() {
		getjPanelNorthCenter().add(BorderLayout.WEST,getjPanelWestNorth());
		getjPanelNorthCenter().add(BorderLayout.EAST, getjPanelEastNorth());
	}
	
	
	public void getJPanelButtonOSAddComponentes() {
		GroupLayout JPanelButtonOS_Layout = new GroupLayout(this.getjPanelJButtonOS());
		this.getjPanelJButtonOS().setLayout(JPanelButtonOS_Layout);
		JPanelButtonOS_Layout.setHorizontalGroup(
				JPanelButtonOS_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(JPanelButtonOS_Layout.createSequentialGroup().addGap(1, 1, 1)
								.addGroup(JPanelButtonOS_Layout
										.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.getjButtonGerarOS(), GroupLayout.PREFERRED_SIZE, 219,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(this.getjButtonConsultarOS(), GroupLayout.PREFERRED_SIZE, 219,
												GroupLayout.PREFERRED_SIZE))
								.addGap(1, 1, 1)));
		
		
		JPanelButtonOS_Layout.setVerticalGroup(
				JPanelButtonOS_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(JPanelButtonOS_Layout.createSequentialGroup().addGap(1, 1, 1)
								.addComponent(this.getjButtonGerarOS(), GroupLayout.PREFERRED_SIZE, 42,
										GroupLayout.PREFERRED_SIZE)
								.addGap(1, 1, 1).addComponent(this.getjButtonConsultarOS(), GroupLayout.PREFERRED_SIZE, 42,
										GroupLayout.PREFERRED_SIZE)
								.addGap(1, 1, 1)));
	}
	
	
	public void getJPanelButtonConfiguracaoAddComponentes() {
		GroupLayout JPanelButtonConfiguracao_Layout = new GroupLayout(this.getjPanelJButtonConfiguracao());
		this.getjPanelJButtonConfiguracao().setLayout(JPanelButtonConfiguracao_Layout);
		JPanelButtonConfiguracao_Layout.setHorizontalGroup(
				JPanelButtonConfiguracao_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(JPanelButtonConfiguracao_Layout.createSequentialGroup().addGap(1, 1, 1)
								.addGroup(JPanelButtonConfiguracao_Layout
										.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.getjButton10(), GroupLayout.PREFERRED_SIZE, 219,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(this.getjButton11(), GroupLayout.PREFERRED_SIZE, 219,
												GroupLayout.PREFERRED_SIZE))
								.addGap(1, 1, 1)));
		
		
		JPanelButtonConfiguracao_Layout.setVerticalGroup(
				JPanelButtonConfiguracao_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(JPanelButtonConfiguracao_Layout.createSequentialGroup().addGap(1, 1, 1)
								.addComponent(this.getjButton10(), GroupLayout.PREFERRED_SIZE, 42,
										GroupLayout.PREFERRED_SIZE)
								.addGap(1, 1, 1).addComponent(this.getjButton11(), GroupLayout.PREFERRED_SIZE, 42,
										GroupLayout.PREFERRED_SIZE)
								.addGap(1, 1, 1)));
	}		
	
	// ### Final dos métodos de adição de componentes ###
	// --------------------------------------------------
	// ### Inicio    de     métodos     da     classe ###
	
	public void alteraJPanelCentral(JPanel jPanel) { // Se passar um jPanel como parâmetro
		
		alteraJPanelCentral(jPanel,null);
		
	}
	
	
	public void alteraJPanelCentral(JScrollPane jScrollPane, String string, ImageIcon icon) { // Se passar um jScrollPanel	
		
		alteraJPanelCentral(null,jScrollPane);
		this.setJlabel(string, icon);
		
	}
	
	
	public void alteraJPanelCentral(JPanel jPanel, JScrollPane jScrollPane) { // Método que faz os tratamentos nessessários
		//		para trocar a tela do centro da classe
		System.out.println("Mudou tela");
		if(alteraJPanelCentral == null) { 	// Se estiver na tela incial e for trocar para outra tela
			this.getjPanelCenterPrincipal().remove(getjPanelHome());
		}else {									// Se estiver em uma tela qualquer e for outra tela
			this.getjPanelCenterPrincipal().remove(alteraJPanelCentral);
		}
		
		if(jPanel == null) { // Se for passado um jScrollPane como parametro o método adiciona o mesmo na parte central da classe
			
		
		}else { 			// Se for passado um jPanel como parâmetro, o método adiciona o mesmo na parte central da classe
			
			this.getjPanelCenterPrincipal().add(BorderLayout.CENTER, jPanel);
			alteraJPanelCentral = jPanel; // Seta variável como nulo, para "informar" ao método "alteraJPanelCentral" para 
					//na proxima troca de tela retiara o jPanel Central
		}
		
		this.getjPanelCenterPrincipal().repaint();
		this.getjPanelCenterPrincipal().validate();
	}	
	
	// ### Final de métodos da classe ###
	
	public Color getCorDosBotoesEMenuLateral() {
		return corDosBotoesEMenuLateral;
	}
	
	public Color getCorDaBarraMenuEButton() {
		return corDaBarraMenuEButton;
	}

}


