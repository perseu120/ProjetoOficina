package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.CoresPrograma;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class JPanelConsultarClientes extends JPanel{

	// ### Início declaração de variáveis ###
	
	private JPanel jPanelBarraPesquisa; //Contem os JButtons de pesquisa e filtro
	private JPanel jPanelCentral;       //JPanel utilizado para a resposividade da classe
	private JPanel jPanelListaClientes; //Contem a JTable e jPanel de dados do cliente
	private JPanel jPanelDadosClientes; //ira exibir os dados dos clientes
	
	private JScrollPane jScrollPane; //Panel ecenssial para funiconamento da jTableLista
	
	private JTable jTableListaClientes;
	
	private JButton jButtonPesquisa; //Realizar pesquisa pelo nome do cliente
	private JButton jButtonFiltro;   //adicionar filtros a tabela
	private JButton jButtonEditar;   //Editar dados do cliente
	private JButton jButtonSalvar;   //Salvar alteração nos dados do cliente
	private JButton jButtonCancelar; //Cancela alterações;
	
	private JTextField jTextFieldPesquisa;
	private JTextField jTextFieldFiltro;
	
	private JLabel jLabelLista;
	private JLabel jLabelDados;
    private JLabel jLabelNomeCliente;
	private JLabel jLabelCPF;
    private JLabel jLabelEmail;
    private JLabel jLabelTelefone;
    private JLabel jLabelCidade;
    private JLabel jLabelBairro;
    private JLabel jLabelRua;
    private JLabel jlabelNumeroRua;

	private String[] tituloJTable = {"   Nº   ", "  Nome  ", "  CPF  "}; // titulo das colunas da jTableLista
	
	private Object[][] dadosJTable = {
			
			{"001", "Josimar", "54865232425"},	
			{"002", "Paulo Uilian", "58413654225"},
			{"003", "Gustavo", "45321569825"} 
			
	}; // Dados inicial da jTableLista
	    
	    
	    
	// ### Fim dlecaração de  variáveis ###
	// ------------------------------------
	// ### Inicio de criação de objetos ###
    
    CoresPrograma CoresPrograma = new CoresPrograma();
    
    private Color corEscura = CoresPrograma.getCorEscura(); // cor contida também na barra de menu superior
	private Color corFundo = CoresPrograma.getCorFundo();   // cor de fundo dos jpanels
	
	private Color foreground = CoresPrograma.getForeground();         // foregroudo dos jbuttons
	private Color foregroundClic = CoresPrograma.getForegroundClic(); // foregroud de jbutton quando clicado ou ganhado foco
	
	private Font fontJButton = new Font("Arial",1,20);      // Fonte dos jButons da classe
	private Font fontJTextField = new Font("Arial", 1, 24); // Fonte dos jTextField da classe
    private Font fontJLabel = new Font("Arial", 1, 20);     // Font dos jLabel da classe
    
    private ImageIcon iConFilterBlue = new ImageIcon(getClass().getResource("/icons/filter_48.png"));
    private ImageIcon iConSearchUserBlue = new ImageIcon(getClass().getResource("/icons/search_user_48.png"));
		
	// ### Fim  da  criação  de objetos ###
    // ------------------------------------
	
	public JPanelConsultarClientes() {
		
		addComponentesJpanelBarraPesquisa();
		getjPanelListaClientes();
		addComponentesJPanelListaClientes();
		addComponentesJPanelCentral();
		getjJPanelConsultarClientes();
		addComponetesJPanelConsultarClientes();
	}
	
    // ### Início da criação dos jPanels e jTables ###
	
	public JPanel getjJPanelConsultarClientes() {
		
		this.setLayout(new BorderLayout());
		this.setBackground(corFundo);
		this.setPreferredSize(new Dimension(650, 450));
		
		return this;
	}

	
	public JPanel getjPanelBarraPesquisa() {
		
		if(jPanelBarraPesquisa == null){
	
			jPanelBarraPesquisa = new JPanel();
			FlowLayout fl_jPanelBarraPesquisa = new FlowLayout();
			fl_jPanelBarraPesquisa.setVgap(10);
			fl_jPanelBarraPesquisa.setHgap(20);
			fl_jPanelBarraPesquisa.setAlignment(FlowLayout.LEFT);
			jPanelBarraPesquisa.setLayout(fl_jPanelBarraPesquisa);
			jPanelBarraPesquisa.setPreferredSize(new Dimension(100, 70));
			jPanelBarraPesquisa.setBackground(corEscura);
			jPanelBarraPesquisa.setVisible(true);
	
		}
		return jPanelBarraPesquisa;
	}
	
	
	public JPanel getjPanelCentral() {
		
		if(jPanelCentral == null){
	
			jPanelCentral = new JPanel();			
			FlowLayout fl_jPanelCentral = new FlowLayout();
			fl_jPanelCentral.setVgap(0);
			fl_jPanelCentral.setHgap(0);
			jPanelCentral.setLayout(fl_jPanelCentral);
			jPanelCentral.setOpaque(false);
		}
		return jPanelCentral;
	}
	
	
	public JPanel getjPanelListaClientes() {
		
		if(jPanelListaClientes == null){
	
			jPanelListaClientes = new JPanel();
			jPanelListaClientes.setLayout(null);
			jPanelListaClientes.setPreferredSize(new Dimension(650, 300));
			jPanelListaClientes.setOpaque(false);
			
		}
		return jPanelListaClientes;
	}
	
	
	public JPanel getjPanelDadosCiente() {
		
		if(jPanelDadosClientes == null){
	
			jPanelDadosClientes = new JPanel();
			jPanelDadosClientes.setBounds(400, 35, 227, 250);
			jPanelDadosClientes.setBackground(corEscura);
				
		}
		return jPanelDadosClientes;
	}
	
	
	public JTable getjTableListaClientes() {
		if(jTableListaClientes == null) {
			
			jTableListaClientes = new JTable(dadosJTable, tituloJTable);
			jTableListaClientes.setFont(new Font("Arial", Font.PLAIN, 18));
			jTableListaClientes.setBackground(Color.LIGHT_GRAY);
			jTableListaClientes.setVisible(true);
			jTableListaClientes.getPreferredScrollableViewportSize();
			
		}
		return jTableListaClientes;
	}
	
	
	public JScrollPane getjScrollPane() {
		if(jScrollPane == null) {
			jScrollPane = new JScrollPane(getjTableListaClientes());
			jScrollPane.setFont(new Font("Arial", Font.BOLD, 18));
			jScrollPane.setBackground(corFundo);
			jScrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
			jScrollPane.setBounds(20, 35, 360, 250);
			jScrollPane.setVisible(true);
		}
		
		return jScrollPane;
	}
	
    // ### Final da criação dos jPanels e jTalbles ###
    // ------------------------------------
	// ### Inicio dos gets dos jButtons ###
    
    public JButton getjButtonPesquisa() {
		
		if(jButtonPesquisa == null){
	
			jButtonPesquisa = new JButton();
			jButtonPesquisa.setBackground(corEscura);
	        jButtonPesquisa.setFont(fontJButton);
	        jButtonPesquisa.setForeground(foreground);
	        jButtonPesquisa.setContentAreaFilled(false);
	        jButtonPesquisa.setPreferredSize(new Dimension(100,58));
	        jButtonPesquisa.setIcon(iConSearchUserBlue);
	        jButtonPesquisa.setOpaque(true);
	        jButtonPesquisa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
	
		}
		return jButtonPesquisa;
	}
    
    
	public JButton getjButtonFiltro() {
		
		if(jButtonFiltro == null){
	
			jButtonFiltro = new JButton();
			jButtonFiltro.setBackground(corEscura);
	        jButtonFiltro.setFont(fontJButton);
	        jButtonFiltro.setForeground(foreground);
	        jButtonFiltro.setContentAreaFilled(false);
	        jButtonFiltro.setPreferredSize(new Dimension(100,58));
	        jButtonFiltro.setIcon(iConFilterBlue);
	        jButtonFiltro.setOpaque(true);
	        jButtonFiltro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
		}
		return jButtonFiltro;
	}
	
	
	public JButton getjButtonEditar() {
		
		if(jButtonEditar == null){
	
			jButtonEditar = new JButton();
	
		}
		return jButtonEditar;
	}
	
	
	public JButton getjButtonSalvar() {
		
		if(jButtonSalvar == null){
	
			jButtonSalvar = new JButton();
			
		}
		return jButtonSalvar;
	}
	
	
	public JButton getjButtonCancelar() {
		
		if(jButtonCancelar == null){
	
			jButtonCancelar = new JButton();
	
		}
		return jButtonCancelar;
	}
	
	// ### Final dos gets dos botoes ###
	// ---------------------------------
    // ### Início dos gets dos jLabels ###
    
	public JLabel getjLabelLista() {
		
		if(jLabelLista == null){
	
			jLabelLista = new JLabel();
	
		}
		return jLabelLista;
	}
	
	
	public JLabel getjLabelDados() {
		
		if(jLabelDados == null){
	
			jLabelDados = new JLabel();
	
		}
		return jLabelDados;
	}
	
	
	public JLabel getjLabelNomeCliente() {
		
		if(jLabelNomeCliente == null){
	
			jLabelNomeCliente = new JLabel();
	
		}
		return jLabelNomeCliente;
	}
	
	
	public JLabel getjLabelCPF() {
		
		if(jLabelCPF == null){
	
			jLabelCPF = new JLabel();
	
		}
		return jLabelCPF;
	}
	
	
	public JLabel getjLabelEmail() {
		
		if(jLabelEmail == null){
	
			jLabelEmail = new JLabel();
	
		}
		return jLabelEmail;
	}
	public JLabel getjLabelTelefone() {
		
		if(jLabelTelefone == null){
	
			jLabelTelefone = new JLabel();
	
		}
		return jLabelTelefone;
	}
	
	
	public JLabel getjLabelCidade() {
		
		if(jLabelCidade == null){
	
			jLabelCidade = new JLabel();
	
		}
		return jLabelCidade;
	}
	
	
	public JLabel getjLabelBairro() {
		
		if(jLabelBairro == null){
	
			jLabelBairro = new JLabel();
	
		}
		return jLabelBairro;
	}
	
	
	public JLabel getjLabelRua() {
		
		if(jLabelRua == null){
	
			jLabelRua = new JLabel();
	
		}
		return jLabelRua;
	}
	
	
	public JLabel getJlabelNumeroRua() {
		
		if(jlabelNumeroRua == null){
	
			jlabelNumeroRua = new JLabel();
	
		}
		return jlabelNumeroRua;
	}
    // ### Final     dos     gets     dos      jLabels ###
    // ---------------------------------------------------
	// ### Início    dos    gets    dos    jTextFields ###
	
	public JTextField getjTextFieldPesquisa() {
		
		if(jTextFieldPesquisa == null){
	
			jTextFieldPesquisa = new JTextField();
			jTextFieldPesquisa.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
			jTextFieldPesquisa.setBackground(corFundo);
	        jTextFieldPesquisa.setFont(fontJTextField);
	        jTextFieldPesquisa.setHorizontalAlignment(SwingConstants.LEFT);
	        jTextFieldPesquisa.setPreferredSize(new Dimension(180, 31));
	        jTextFieldPesquisa.setOpaque(false);
	        jTextFieldPesquisa.setVisible(false);
		}
		return jTextFieldPesquisa;
	}

	
	public JTextField getjTextFieldFiltro() {
		
		if(jTextFieldFiltro == null){
	
			jTextFieldFiltro = new JTextField();
			jTextFieldFiltro.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
			jTextFieldFiltro.setBackground(corFundo);
	        jTextFieldFiltro.setFont(fontJTextField);
	        jTextFieldFiltro.setHorizontalAlignment(SwingConstants.LEFT);
	        jTextFieldFiltro.setPreferredSize(new Dimension(180, 31));
	        jTextFieldFiltro.setOpaque(false);
	        jTextFieldFiltro.setVisible(false);
	
		}
		return jTextFieldFiltro;
	}

	
	
	// ### Final     dos    gets    dos    jTextFields ###
	// ---------------------------------------------------
	// ### Início dos métodos de adição de componentes ###
	
	private void addComponentesJpanelBarraPesquisa() {
		getjPanelBarraPesquisa().add(getjButtonPesquisa());
		getjPanelBarraPesquisa().add(getjTextFieldPesquisa());
		getjPanelBarraPesquisa().add(getjButtonFiltro());
		getjPanelBarraPesquisa().add(getjTextFieldFiltro());
	}
	
	
	private void addComponetesJPanelConsultarClientes() {
		
		this.add(BorderLayout.NORTH,getjPanelBarraPesquisa());
		this.add(BorderLayout.CENTER, getjPanelCentral());
		
	}
	
	
	private void addComponentesJPanelCentral() {
		
		getjPanelCentral().add(getjPanelListaClientes());
	}
	
	private void addComponentesJPanelListaClientes() {
		
		getjPanelListaClientes().add(BorderLayout.WEST, getjScrollPane());
		getjPanelListaClientes().add(BorderLayout.EAST, getjPanelDadosCiente());
	} 
	
	// ### Final dos métodos de adição de componentes ###

}
