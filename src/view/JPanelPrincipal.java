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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.OverlayLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


/**
 *
 * @author Willian
 */

public class JPanelPrincipal extends JPanel {
	

	private final String img = "/images/images_1.png";

	// Declaração de variáveis
	private JButton JButtonAddUsuarios;
	private JButton JButtonVeiculos;
	private JButton JButtonClientes;
	private JButton JButtonConfiguracao;
	private JButton JButtonFaturamento;
	private JButton JButtonHome;
	private JButton JButtonMenuBar;
	private JButton JButtonOS;
	private JButton JButtonOrcamento;
	private JButton jButton10;
	private JButton jButton11;
	private JLabel JLabelFundoJPanelHome;
	private JLabel JLabelIconeUsuario;
	private JLabel JLabelNomeUsuario;
	private JPanel JPanelCenter;
	private JPanel JPanelNorth;
	private JPanel JPanelHome;
	private JPanel JPanelWestMenuLateral;
	private JPanel JPanelJButtonConfiguracao;
	private JPanel JPanelButtons;
	private JPanel JPanelHomeInicial;
	private JPanel JPanelWest;
	private javax.swing.JScrollPane JScrollWest;
	// Fim da declaração de variáveis
	
	public JPanelPrincipal() {
		
		initComponents(); // inicializa os componentes da JFrame.	
	}



	private void initComponents() { // Inicialização dos componetes visuais da classe.
		
		// ##Parte West do JPanelPrincipal##
		this.getJButtonHome();
		this.getJButtonOS();
		this.getJButtonOrcamento();
		this.getJButtonVeiculos();
		this.getJButtonClientes();
		this.getJButtonFaturamento();
		this.getJButtonAddUsuarios();
		this.getJButtonConfiguracao();
		this.getJPanelJButtonConfiguracao();		
		this.getJPanelButtonConfiguracaoAddComponentes();
		
		this.getJPanelButtons();
		this.getJPanelButtonsAddComponentes();
		
		this.getJScrollWest();
		this.getJScrollWestAddComponentes();		
		
		this.getJLabelIconeUsuario();
		this.getJLabelNomeUsuario();
		
		this.getJPanelWest();
		this.getJPanelWestAddComponentes();
		
		this.getJPanelWestMenuLateral();
		this.getJPanelWestMenuLateralAddComponentes();//*/
		
		// ##Parte North do JPanelPrincipal##
		this.getJButtonMenuBar();
		this.getJPanelNorth();
		this.getJPanelNorthtAddComponentes();
		
		// ##Parte Center do JPanelPrincipal##
		this.getJLabelFundoJPanelHome();
		this.getJPanelHome();
		this.getJPanelHomeInicial();
		this.getJPanelHomeInicialAddComponentes();
		this.getJPanelCenter();
		this.getJPanelCenterAddComponentes();
		this.getJPanelPrincipal();
		this.getJPanelPrincipalAddComponentes();
		 
	}	
	
	
	public JPanelPrincipal getJPanelPrincipal() {		
		setBackground(new Color(255, 255, 255));
		setFocusCycleRoot(false);
		setFocusable(false);;
		setPreferredSize(new Dimension(800,600));
		return this;
	}

	
	public JLabel getJLabelIconeUsuario() { // JLabel Para exibir imagem(opcional) do usuario que efeutuou o login.
		if(JLabelIconeUsuario == null){
			JLabelIconeUsuario = new JLabel();
			JLabelIconeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
			JLabelIconeUsuario.setIcon(new ImageIcon(getClass().getResource("/icons/user_100.png")));
		}
		return JLabelIconeUsuario;
	}
	

	public JLabel getJLabelNomeUsuario() { // JLabel Para exibir nome do usuario que efeutuou o login.
		if(JLabelNomeUsuario == null){
			JLabelNomeUsuario = new JLabel();
			JLabelNomeUsuario.setFont(new Font("Arial", 1, 24));
			JLabelNomeUsuario.setForeground(new Color(255, 255, 255));
			JLabelNomeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
			JLabelNomeUsuario.setText("Usuário");
			JLabelNomeUsuario.setHorizontalTextPosition(SwingConstants.CENTER);

		}
		return JLabelNomeUsuario;
	}
	

	public JButton getJButtonMenuBar() { // JButton controlador do menu lateral "JPanelWestMenuLateral".
		if (JButtonMenuBar == null) {
			JButtonMenuBar = new JButton();
			JButtonMenuBar.setBackground(new Color(219, 131, 0));
			JButtonMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu_64.png")));
			JButtonMenuBar.setBorder(null);
			JButtonMenuBar.setBorderPainted(false);
			JButtonMenuBar.setContentAreaFilled(false);
			JButtonMenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			JButtonMenuBar.setDisabledIcon(null);
			JButtonMenuBar.setDisabledSelectedIcon(null);
			JButtonMenuBar.setOpaque(true);
			
		}
		return JButtonMenuBar;
	}

	
	public JButton getJButtonHome() { 
		if (JButtonHome == null) {
			JButtonHome = new JButton();
			JButtonHome.setBackground(new Color(103, 103, 103));
			JButtonHome.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
			JButtonHome.setForeground(new Color(204, 204, 204));
			JButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_48.png"))); 
			JButtonHome.setText(" Iniciar");
			JButtonHome.setBorder(null);
			JButtonHome.setBorderPainted(false);
			JButtonHome.setContentAreaFilled(false);
			JButtonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			JButtonHome.setHideActionText(true);
			JButtonHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			JButtonHome.setOpaque(true);
		}
		return JButtonHome;
	}
		
	
	public JButton getJButtonOS() {
		if (JButtonOS == null) {
			JButtonOS = new JButton();
			JButtonOS.setBackground(new Color(51, 51, 51));
			JButtonOS.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
			JButtonOS.setForeground(new Color(204, 204, 204));
			JButtonOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OS_48.png"))); 
			JButtonOS.setText(" O.S");
			JButtonOS.setBorder(null);
			JButtonOS.setBorderPainted(false);
			JButtonOS.setContentAreaFilled(false);
			JButtonOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			JButtonOS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			JButtonOS.setOpaque(true);
		}
		return JButtonOS;
	}
	
	
	public JButton getJButtonOrcamento() {
		if (JButtonOrcamento == null) {
			JButtonOrcamento = new JButton();
			JButtonOrcamento.setBackground(new Color(51, 51, 51));
			JButtonOrcamento.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
			JButtonOrcamento.setForeground(new Color(204, 204, 204));
			JButtonOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/orca_car_48.png"))); 
			JButtonOrcamento.setText(" OrÃ§amento");
			JButtonOrcamento.setBorder(null);
			JButtonOrcamento.setBorderPainted(false);
			JButtonOrcamento.setContentAreaFilled(false);
			JButtonOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			JButtonOrcamento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			JButtonOrcamento.setOpaque(true);
		}
		return JButtonOrcamento;
	}
	
	
	public JButton getJButtonVeiculos() {
		if (JButtonVeiculos == null) {
			JButtonVeiculos = new JButton();
			JButtonVeiculos.setBackground(new Color(51, 51, 51));
			JButtonVeiculos.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
			JButtonVeiculos.setForeground(new Color(204, 204, 204));
			JButtonVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/car_48_1.png"))); 
			JButtonVeiculos.setText(" Ve\u00EDculos");
			JButtonVeiculos.setBorder(null);
			JButtonVeiculos.setBorderPainted(false);
			JButtonVeiculos.setContentAreaFilled(false);
			JButtonVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			JButtonVeiculos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		}
		return JButtonVeiculos;
	}
	

	public JButton getJButtonClientes() {
		if (JButtonClientes == null) {
			JButtonClientes = new JButton();
			JButtonClientes.setBackground(new Color(51, 51, 51));
			JButtonClientes.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
			JButtonClientes.setForeground(new Color(204, 204, 204));
			JButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/users_48.png"))); 
			JButtonClientes.setText(" Clientes");
			JButtonClientes.setBorder(null);
			JButtonClientes.setBorderPainted(false);
			JButtonClientes.setContentAreaFilled(false);
			JButtonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			JButtonClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			JButtonClientes.setOpaque(true);
		}
		return JButtonClientes;
	}

	
	public JButton getJButtonFaturamento() {
		if (JButtonFaturamento == null) {
			JButtonFaturamento = new JButton();
			JButtonFaturamento.setBackground(new Color(51, 51, 51));
			JButtonFaturamento.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
			JButtonFaturamento.setForeground(new Color(204, 204, 204));
			JButtonFaturamento.setIcon(new ImageIcon(getClass().getResource("/icons/estimate-48.png"))); 
			JButtonFaturamento.setText(" Faturamento");
			JButtonFaturamento.setBorder(null);
			JButtonFaturamento.setBorderPainted(false);
			JButtonFaturamento.setContentAreaFilled(false);
			JButtonFaturamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			JButtonFaturamento.setHorizontalAlignment(SwingConstants.LEFT);
			JButtonFaturamento.setOpaque(true);
			
		}
		return JButtonFaturamento;
	}

	
	public JButton getJButtonAddUsuarios() {
		if (JButtonAddUsuarios == null) {
			JButtonAddUsuarios = new JButton();
			JButtonAddUsuarios.setBackground(new Color(51, 51, 51));
			JButtonAddUsuarios.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
			JButtonAddUsuarios.setForeground(new Color(204, 204, 204));
			JButtonAddUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/use_conf_48.png"))); 
			JButtonAddUsuarios.setText(" UsuÃ¡rio");
			JButtonAddUsuarios.setBorder(null);
			JButtonAddUsuarios.setBorderPainted(false);
			JButtonAddUsuarios.setContentAreaFilled(false);
			JButtonAddUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			JButtonAddUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			JButtonAddUsuarios.setOpaque(true);
			
		}
		return JButtonAddUsuarios;
	}
	
			
	public JButton getJButtonConfiguracao() {
		if (JButtonConfiguracao == null) {
			JButtonConfiguracao = new JButton();
			JButtonConfiguracao.setBackground(new Color(51, 51, 51));
			JButtonConfiguracao.setFont(new Font("Trebuchet MS", 1, 18));
			JButtonConfiguracao.setForeground(new Color(204, 204, 204));
			JButtonConfiguracao.setIcon(new ImageIcon(getClass().getResource("/icons/conf_48.png")));
			JButtonConfiguracao.setText(" Configurações");
			JButtonConfiguracao.setBorder(null);
			JButtonConfiguracao.setBorderPainted(false);
			JButtonConfiguracao.setContentAreaFilled(false);
			JButtonConfiguracao.setCursor(new Cursor(Cursor.HAND_CURSOR));
			JButtonConfiguracao.setHorizontalAlignment(SwingConstants.LEFT);
			JButtonConfiguracao.setOpaque(true);
			
		}
		return JButtonConfiguracao;
	}

	
	public JButton getjButton10() {
		if (jButton10 == null) {
			jButton10 = new JButton();
			jButton10.setBackground(new Color(204, 204, 204));
			jButton10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
			jButton10.setText(" Cliente");
			jButton10.setBorder(null);
			jButton10.setBorderPainted(false);
			jButton10.setContentAreaFilled(false);
			jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			jButton10.setOpaque(true);
		}
		return jButton10;
	}


	public JButton getjButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setBackground(new Color(204, 204, 204));
			jButton11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
			jButton11.setText(" Cliente");
			jButton11.setBorder(null);
			jButton11.setBorderPainted(false);
			jButton11.setContentAreaFilled(false);
			jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			jButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
			jButton11.setOpaque(true);
		}
		return jButton11;
	}

	
	public JPanel getJPanelWestMenuLateral() {
		if(JPanelWestMenuLateral == null){
			JPanelWestMenuLateral = new JPanel();
			JPanelWestMenuLateral.setBackground(new Color(51, 51, 51));
			JPanelWestMenuLateral.setPreferredSize(new Dimension(265, 800));

		}
		return JPanelWestMenuLateral;
	}

	
	public JPanel getJPanelWest() { //JPanelWest contém os dados do usuários de login
		if(JPanelWest == null){
			JPanelWest = new JPanel();
			JPanelWest.setBackground(new Color(0, 51, 51));
			JPanelWest.setBorder(null);
			JPanelWest.setOpaque(false);
			JPanelWest.setPreferredSize(new Dimension(265, 200));
		}
		return JPanelWest;
	}

	
	public JScrollPane getJScrollWest() {
		if(JScrollWest == null){
			JScrollWest = new JScrollPane();
			JScrollWest.setBackground(new Color(51, 51, 51));
			JScrollWest.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
			JScrollWest.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			JScrollWest.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			JScrollWest.setViewportBorder(null);
			JScrollWest.setAutoscrolls(true);
			JScrollWest.setCursor(new Cursor(Cursor.HAND_CURSOR));
			JScrollWest.setFocusCycleRoot(true);
			JScrollWest.setOpaque(true);
			JScrollWest.setPreferredSize(new Dimension(265, 1100));

		}
		return JScrollWest;
	}
	

	public JPanel getJPanelButtons() {
		if(JPanelButtons == null){
			JPanelButtons = new JPanel();
			JPanelButtons.setBackground(new Color(51, 51, 51));
			JPanelButtons.setBorder(null);
			JPanelButtons.setPreferredSize(new Dimension(265, 825));

		}
		return JPanelButtons;
	}
	
	
	public void getJPanelPrincipalAddComponentes() {
		this.add(this.getJPanelWestMenuLateral(), BorderLayout.WEST);
		this.add(JPanelNorth, BorderLayout.NORTH);
		this.add(JPanelCenter, BorderLayout.CENTER);
	}
	
	
	public void getJPanelHomeInicialAddComponentes() {
		JPanelHomeInicial.add(this.getJLabelFundoJPanelHome(), BorderLayout.CENTER);
	}
	
	
	public void getJPanelCenterAddComponentes() {
		JPanelCenter.add(this.getJPanelHomeInicial());
		JPanelCenter.add(this.getJPanelHome());
	}
	
	
	public void getJPanelWestMenuLateralAddComponentes() {
		GroupLayout JPanelWestMenuLateral_Layout = new GroupLayout(this.getJPanelWestMenuLateral());
		this.getJPanelWestMenuLateral().setLayout(JPanelWestMenuLateral_Layout);
		JPanelWestMenuLateral_Layout.setHorizontalGroup(
				JPanelWestMenuLateral_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(this.getJPanelWest(), GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.getJScrollWest(), GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));
		JPanelWestMenuLateral_Layout.setVerticalGroup(
				JPanelWestMenuLateral_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(JPanelWestMenuLateral_Layout.createSequentialGroup()
								.addComponent(this.getJPanelWest(), GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.getJScrollWest(), GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE)));
	}
		
	
	public void getJPanelWestAddComponentes() {
		GroupLayout JPanelWest_Layout = new GroupLayout(this.getJPanelWest());
		this.getJPanelWest().setLayout(JPanelWest_Layout);
		JPanelWest_Layout.setHorizontalGroup(JPanelWest_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.getJLabelNomeUsuario(), GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(JPanelWest_Layout
						.createSequentialGroup().addContainerGap(82, Short.MAX_VALUE).addComponent(this.getJLabelIconeUsuario(),
								GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(83, Short.MAX_VALUE)));
		JPanelWest_Layout.setVerticalGroup(JPanelWest_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(JPanelWest_Layout.createSequentialGroup().addContainerGap(31, Short.MAX_VALUE)
						.addComponent(this.getJLabelIconeUsuario(), GroupLayout.PREFERRED_SIZE, 96,
								GroupLayout.PREFERRED_SIZE)
						.addGap(5, 5, 5)
						.addComponent(this.getJLabelNomeUsuario(), GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
						.addGap(12, 12, 12)));
	}
	
	
	public void getJScrollWestAddComponentes() {
		JScrollWest.setViewportView(this.getJPanelButtons());
	}
	
	
	public void getJPanelButtonsAddComponentes() { 
		GroupLayout JPanelButtons_Layout = new GroupLayout(this.getJPanelButtons());
		JPanelButtons_Layout.setHorizontalGroup(JPanelButtons_Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(JPanelButtons_Layout.createSequentialGroup().addContainerGap()
						.addGroup(JPanelButtons_Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(JPanelButtons_Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(this.getJButtonOS(), GroupLayout.PREFERRED_SIZE, 219,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(this.getJButtonHome(), GroupLayout.PREFERRED_SIZE, 219,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(this.getJButtonFaturamento(), GroupLayout.PREFERRED_SIZE, 219,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.getJButtonOrcamento(), GroupLayout.PREFERRED_SIZE, 219,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.getJButtonVeiculos(), GroupLayout.PREFERRED_SIZE, 219,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.getJButtonClientes(), GroupLayout.PREFERRED_SIZE, 219,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.getJButtonAddUsuarios(), GroupLayout.PREFERRED_SIZE, 219,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.getJButtonConfiguracao(), GroupLayout.PREFERRED_SIZE, 219,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.getJPanelJButtonConfiguracao(), GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(32, Short.MAX_VALUE)));
		JPanelButtons_Layout.setVerticalGroup(JPanelButtons_Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(JPanelButtons_Layout.createSequentialGroup().addGap(6)
						.addComponent(this.getJButtonHome(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(this.getJButtonOS(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(this.getJButtonOrcamento(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(this.getJButtonVeiculos(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(this.getJButtonClientes(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addGap(7)
						.addComponent(this.getJButtonAddUsuarios(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addGap(13)
						.addComponent(this.getJButtonFaturamento(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(this.getJButtonConfiguracao(), GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE).addGap(168)
						.addComponent(this.getJPanelJButtonConfiguracao(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		this.getJPanelButtons().setLayout(JPanelButtons_Layout);

	}

	
				
	public void getJPanelNorthtAddComponentes() {
		GroupLayout JPanelNorth_Layout = new GroupLayout(this.getJPanelNorth());
		this.getJPanelNorth().setLayout(JPanelNorth_Layout);
		JPanelNorth_Layout
				.setHorizontalGroup(JPanelNorth_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(JPanelNorth_Layout.createSequentialGroup()
								.addComponent(this.getJButtonMenuBar(), GroupLayout.PREFERRED_SIZE, 65,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(1142, Short.MAX_VALUE)));
		JPanelNorth_Layout.setVerticalGroup(JPanelNorth_Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(JPanelNorth_Layout.createSequentialGroup().addComponent(this.getJButtonMenuBar(),
						GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

	}
	
	
	public void getJPanelButtonConfiguracaoAddComponentes() {
		GroupLayout JPanelButtonConfiguracao_Layout = new GroupLayout(this.getJPanelJButtonConfiguracao());
		this.getJPanelJButtonConfiguracao().setLayout(JPanelButtonConfiguracao_Layout);
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
	
	
	public JLabel getJLabelFundoJPanelHome() {
		if(JLabelFundoJPanelHome == null){
			JLabelFundoJPanelHome = new JLabel();
			JLabelFundoJPanelHome.setBackground(new Color(255, 255, 255));
			JLabelFundoJPanelHome.setForeground(new Color(102, 102, 102));
			JLabelFundoJPanelHome.setHorizontalAlignment(SwingConstants.CENTER);
			JLabelFundoJPanelHome.setIcon(new ImageIcon(getClass().getResource("/images/images_1.png")));
			JLabelFundoJPanelHome.setHorizontalTextPosition(SwingConstants.CENTER);
			JLabelFundoJPanelHome.setOpaque(true);
		}
		return JLabelFundoJPanelHome;
	}
	
	

	public JPanel getJPanelCenter() {
		if(JPanelCenter == null){
			JPanelCenter = new JPanel();
			JPanelCenter.setBackground(new Color(255, 255, 255));
			JPanelCenter.setLayout(new OverlayLayout(JPanelCenter));
		}
		return JPanelCenter;
	}
	
	

	public JPanel getJPanelNorth() {
		if(JPanelNorth == null){
			JPanelNorth = new JPanel();
			JPanelNorth.setBackground(new Color(219, 131, 0));
			JPanelNorth.setPreferredSize(new Dimension(1027, 60));
		}
		return JPanelNorth;
	}
	
	

	public JPanel getJPanelHome() {
		if(JPanelHome == null){
			JPanelHome = new JPanel();
			JPanelHome.setLayout(new BorderLayout());
			
		}
		return JPanelHome;
	}
	
	

	public JPanel getJPanelJButtonConfiguracao() {
		if(JPanelJButtonConfiguracao == null){
			JPanelJButtonConfiguracao = new JPanel();
			JPanelJButtonConfiguracao.setBackground(new Color(0, 0, 0));
			JPanelJButtonConfiguracao.setRequestFocusEnabled(false);
			JPanelJButtonConfiguracao.setVisible(false);
		}
		return JPanelJButtonConfiguracao;
	}
	
	

	public JPanel getJPanelHomeInicial() {
		if(JPanelHomeInicial == null){
			JPanelHomeInicial = new JPanel();
			JPanelHomeInicial.setLayout(new BorderLayout());		
			
		}
		return JPanelHomeInicial;
	}
	
		
	
}


