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
import javax.swing.LayoutStyle;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;


/**
 *
 * @author Willian
 */

public class JPanelPrincipal extends JPanel {
	

	private final String img = "/images/images_1.png"; // Salva caminho da imagem de fundo da tela	
	
	// ### Inicio declaração de variáveis ###
	private JButton jButtonMenuBar;
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
	
	private JPanel jPanelCenter;
	private JPanel jPanelHomeInicial;
	
	private JPanel jPanelWest;
	private JPanel jPanelWestMenuLateral;
	private JScrollPane jScrollWest;
	private JScrollPane alteraJScrollPaneCentral; // Variavel que recebe a o novo JScrollPane da parte central da classe.
	private JPanel jPanelButtons;
	private JPanel jPanelJButtonOS;
	private JPanel jPanelJButtonConfiguracao;
	
	private JPanel jPanelNorth;		
	private JPanel jPanelDescricaoTela;
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
		this.getjPanelButtonsAddComponentes(4,4,4);
		
		this.getjScrollWest();
		this.getjScrollWestAddComponentes();		
		
		this.getjLabelIconeUsuario();
		this.getjLabelNomeUsuario();
		
		this.getjPanelWest();
		this.getjPanelWestAddComponentes();
		
		this.getjPanelWestMenuLateral();
		this.getjPanelWestMenuLateralAddComponentes();//
		
		// ##Parte North do JPanelPrincipal## // Barra de menu
		this.getjButtonMenuBar();
		this.getjPanelNorth();
		this.getjPanelNorthtAddComponentes();
		
		// ##Parte Center do JPanelPrincipal## // Imagem da parte central
		this.getjLabelFundojPanelHome();
		this.getjPanelHomeInicial();
		this.getjPanelHomeInicialAddComponentes();
		this.getjPanelCenter();
		this.getjPanelCenterAddComponentes();
		this.getJPanelPrincipal();
		this.getJPanelPrincipalAddComponentes();
		 
	}	
	
	// ### Inicio dos gets do jPanel ###
	
	public JPanelPrincipal getJPanelPrincipal() { // Retorna os parametros de definições da própia classe
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(new BorderLayout());
		this.setOpaque(false);
		this.setPreferredSize(new Dimension(800,600));
		return this;
	}	
	
	public JPanel getjPanelWestMenuLateral() { // Que contem os componentes do menú lateral
		if(jPanelWestMenuLateral == null){
			jPanelWestMenuLateral = new JPanel();
			jPanelWestMenuLateral.setBackground(new Color(51, 51, 51));
			jPanelWestMenuLateral.setPreferredSize(new Dimension(0, 800)); // Setado como zero para evitar conflitos com o layout BorderLayout

		}
		return jPanelWestMenuLateral;
	}

	
	public JPanel getjPanelWest() { //jPanelWest contém os dados do usuários de login
		if(jPanelWest == null){
			jPanelWest = new JPanel();
			jPanelWest.setBackground(new Color(0, 51, 51));
			jPanelWest.setBorder(null);
			jPanelWest.setOpaque(false);
			jPanelWest.setPreferredSize(new Dimension(265, 200));
		}
		return jPanelWest;
	}

	
	public JScrollPane getjScrollWest() { // JScroolPane que contém o JPanel que contem os JButtons do Menu Lateral
		if(jScrollWest == null){
			jScrollWest = new JScrollPane();
			jScrollWest.setBackground(new Color(51, 51, 51));
			jScrollWest.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
			jScrollWest.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			jScrollWest.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			jScrollWest.setViewportBorder(null);
			jScrollWest.setAutoscrolls(true);
			jScrollWest.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jScrollWest.setFocusCycleRoot(true);
			jScrollWest.setOpaque(true);
			jScrollWest.setPreferredSize(new Dimension(265, 1100));

		}
		return jScrollWest;
	}
	
	
	public JScrollPane getAlteraJScrollPaneCentral() {
		return alteraJScrollPaneCentral;
	}
	

	public JPanel getjPanelButtons() { // JPanel que contem os jButtons do menu lateral
		if(jPanelButtons == null){
			jPanelButtons = new JPanel();
			jPanelButtons.setBackground(new Color(51, 51, 51));
			jPanelButtons.setBorder(null);
			jPanelButtons.setPreferredSize(new Dimension(265, 825));

		}
		return jPanelButtons;
	}
		
	
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
	
	

	public JPanel getjPanelCenter() {
		if(jPanelCenter == null){
			jPanelCenter = new JPanel();
			jPanelCenter.setLayout(new BorderLayout());
		}
		return jPanelCenter;
	}
	
	

	public JPanel getjPanelNorth() {
		if(jPanelNorth == null){
			jPanelNorth = new JPanel();
			jPanelNorth.setBackground(Color.BLACK);
			jPanelNorth.setPreferredSize(new Dimension(1027, 60));
		}
		return jPanelNorth;
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
	
	
	public JPanel getjPanelHomeInicial() {
		if(jPanelHomeInicial == null){
			jPanelHomeInicial = new JPanel();
			jPanelHomeInicial.setBackground(SystemColor.desktop);
			jPanelHomeInicial.setLayout(new BorderLayout());
			
		}
		return jPanelHomeInicial;
	}
	
	
	private JPanel getjPanelDescricaoTela() {
		if (jPanelDescricaoTela == null) {
			jPanelDescricaoTela = new JPanel();
			jPanelDescricaoTela.setBorder(BorderFactory
						.createMatteBorder(3, 0, 0, 0, new Color(100,132,147)));
			jPanelDescricaoTela.setBackground(new Color(51,51,51));
			jPanelDescricaoTela.setPreferredSize(new Dimension(500,58));
			jPanelDescricaoTela.setVisible(false);
			jPanelDescricaoTela.add(getJLabelNomeDaTela());
		}
		return jPanelDescricaoTela;
	}
	
	
	// ### Fim  dos  gets  dos  paineis ###
	// ------------------------------------
	// ### Inicio  dos  get  dos  label ### 
	
	public JLabel getjLabelIconeUsuario() { // JLabel Para exibir imagem(opcional) do usuario que efeutuou o login.
		if(jLabelIconeUsuario == null){
			jLabelIconeUsuario = new JLabel();
			jLabelIconeUsuario.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/user_100.png")));
			jLabelIconeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
			
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
	
	
	private void setJlabel(String string, ImageIcon icon) {
		jLabelNomeDaTela.setText(string);
		jLabelNomeDaTela.setIcon(icon);
	}
	
	
	// ### Fim  dos  gets dos  jLabel ###
	// ---------------------------------
	// ### Inicio dos gets dos jButtons ###
	
	public JButton getjButtonMenuBar() { // JButton controlador do menu lateral "jPanelWestMenuLateral".
		if (jButtonMenuBar == null) {
			jButtonMenuBar = new JButton();
			jButtonMenuBar.setBackground(Color.BLACK);
			jButtonMenuBar.setIcon(new ImageIcon(JPanelPrincipal.class.getResource("/icons/menu_64 _blue.png")));
			jButtonMenuBar.setBorder(null);
			jButtonMenuBar.setBorderPainted(false);
			jButtonMenuBar.setContentAreaFilled(false);
			jButtonMenuBar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			jButtonMenuBar.setDisabledIcon(null);
			jButtonMenuBar.setDisabledSelectedIcon(null);
			jButtonMenuBar.setOpaque(true);
			
		}
		return jButtonMenuBar;
	}

	
	public JButton getjButtonHome() { 
		if (jButtonHome == null) {
			jButtonHome = new JButton();
			jButtonHome.setBackground(new Color(103, 103, 103));
			jButtonHome.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonHome.setForeground(new Color(204, 204, 204));
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
			jButtonOS.setBackground(new Color(51, 51, 51));
			jButtonOS.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonOS.setForeground(new Color(204, 204, 204));
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
			jButtonOrcamento.setBackground(new Color(51, 51, 51));
			jButtonOrcamento.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonOrcamento.setForeground(new Color(204, 204, 204));
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
			jButtonVeiculos.setBackground(new Color(51, 51, 51));
			jButtonVeiculos.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonVeiculos.setForeground(new Color(204, 204, 204));
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
			jButtonClientes.setBackground(new Color(51, 51, 51));
			jButtonClientes.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonClientes.setForeground(new Color(204, 204, 204));
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
			jButtonFaturamento.setBackground(new Color(51, 51, 51));
			jButtonFaturamento.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonFaturamento.setForeground(new Color(204, 204, 204));
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
			jButtonAddUsuarios.setBackground(new Color(51, 51, 51));
			jButtonAddUsuarios.setFont(new Font("Trebuchet MS", Font.BOLD, 20)); 
			jButtonAddUsuarios.setForeground(new Color(204, 204, 204));
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
			jButtonConfiguracao.setBackground(new Color(51, 51, 51));
			jButtonConfiguracao.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			jButtonConfiguracao.setForeground(new Color(204, 204, 204));
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
			jButtonGerarOS.setBackground(new Color(204, 204, 204));
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
			jButtonConsultarOS.setBackground(new Color(204, 204, 204));
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
			jButton10.setBackground(new Color(204, 204, 204));
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
			jButton11.setBackground(new Color(204, 204, 204));
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
	
	// ### Final      dos      gets     dos     botoes ###
    // ---------------------------------------------------
	// ### Inicio dos métodos de adição de componentes ###
	
	public void getJPanelPrincipalAddComponentes() {
		this.add(this.getjPanelWestMenuLateral(), BorderLayout.WEST);
		this.add(jPanelNorth, BorderLayout.NORTH);
		this.add(jPanelCenter, BorderLayout.CENTER);
	}
	
	
	public void getjPanelHomeInicialAddComponentes() {
		getjPanelHomeInicial().add(this.getjLabelFundojPanelHome(), BorderLayout.CENTER);
		
	}
	
	
	public void getjPanelCenterAddComponentes() {
		getjPanelCenter().add(this.getjPanelHomeInicial());
		getjPanelCenter().add(this.getjPanelDescricaoTela(), BorderLayout.NORTH);
	}
	
		
	public void getjPanelWestMenuLateralAddComponentes() {
		GroupLayout jPanelWestMenuLateral_Layout = new GroupLayout(this.getjPanelWestMenuLateral());
		this.getjPanelWestMenuLateral().setLayout(jPanelWestMenuLateral_Layout);
		jPanelWestMenuLateral_Layout.setHorizontalGroup(
				jPanelWestMenuLateral_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(this.getjPanelWest(), GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.getjScrollWest(), GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));
		jPanelWestMenuLateral_Layout.setVerticalGroup(
				jPanelWestMenuLateral_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanelWestMenuLateral_Layout.createSequentialGroup()
								.addComponent(this.getjPanelWest(), GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.getjScrollWest(), GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE)));
	}
		
	
	public void getjPanelWestAddComponentes() {
		GroupLayout jPanelWest_Layout = new GroupLayout(this.getjPanelWest());
		this.getjPanelWest().setLayout(jPanelWest_Layout);
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
	
	
	public void getjScrollWestAddComponentes() {
		this.getjScrollWest().setViewportView(this.getjPanelButtons());
	}
	
	
	public void getjPanelButtonsAddComponentes(int a, int b, int c) {
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

	
				
	public void getjPanelNorthtAddComponentes() {
		GroupLayout jPanelNorth_Layout = new GroupLayout(this.getjPanelNorth());
		this.getjPanelNorth().setLayout(jPanelNorth_Layout);
		jPanelNorth_Layout
				.setHorizontalGroup(jPanelNorth_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanelNorth_Layout.createSequentialGroup()
								.addComponent(this.getjButtonMenuBar(), GroupLayout.PREFERRED_SIZE, 65,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(1142, Short.MAX_VALUE)));
		jPanelNorth_Layout.setVerticalGroup(jPanelNorth_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanelNorth_Layout.createSequentialGroup().addComponent(this.getjButtonMenuBar(),
						GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

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
	
	public void alteraJScrollPaneCentral(JPanel jPanel) { // Se passar um jPanel como parâmetro
		
		alteraJScrollPaneCentral(jPanel,null);
		
	}
	
	
	public void alteraJScrollPaneCentral(JScrollPane jScrollPane, String string, ImageIcon icon) { // Se passar um jScrollPanel	
		
		alteraJScrollPaneCentral(null,jScrollPane);
		this.setJlabel(string, icon);
		
	}
	
	
	public void alteraJScrollPaneCentral(JPanel jPanel, JScrollPane jScrollPane) { // Método que faz os tratamentos nessessários
		//		para trocar a tela do centro da classe
		
		if(alteraJScrollPaneCentral == null) { 	// Se estiver na tela incial e for trocar para outra tela
			this.getjPanelCenter().remove(getjPanelHomeInicial());
		}else {									// Se estiver em uma tela qualquer e for outra tela
			this.getjPanelCenter().remove(alteraJScrollPaneCentral);
		}
		
		if(jPanel == null) { // Se for passado um jScrollPane como parametro o método adiciona o mesmo na parte central da classe
			
			this.getjPanelCenter().add(BorderLayout.CENTER, jScrollPane);
			alteraJScrollPaneCentral = jScrollPane; // E essa variável recebe a nova tela
			this.getjPanelDescricaoTela().setVisible(true);
		
		}else { 			// Se for passado um jPanel como parâmetro, o método adiciona o mesmo na parte central da classe
			
			this.getjPanelCenter().add(BorderLayout.CENTER, jPanel);
			alteraJScrollPaneCentral = null; // Seta variável como nulo, para "informar" ao método "alteraJScrollPaneCentral" para 
					//na proxima troca de tela retiara o jPanel Central
			this.getjPanelDescricaoTela().setVisible(false);
		}
		
		this.getjPanelCenter().repaint();
		this.getjPanelCenter().validate();
	}	
	
	// ### Final de métodos da classe ###
	
	
	
}


