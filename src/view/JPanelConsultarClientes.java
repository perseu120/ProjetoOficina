package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import model.CoresPrograma;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.BoxLayout;
import java.awt.CardLayout;

public class JPanelConsultarClientes extends JPanel{

	// ### Início declaração de variáveis ###
	
	private JPanel jPanelBarraPesquisa; //Contem os JButtons de pesquisa e filtro
	private JPanel jPanelCentral; //JPanel utilizado para a resposividade da classe
	private JPanel jPanelListaClientes; //Contem a JTable e jPanel de dados do cliente
	private JPanel jPanelDadosClientes; //ira exibir os dados dos clientes
	
	private JScrollPane jScrollPane; //Panel ecenssial para funiconamento da jTableLista
	
	private JTable jTableListaClientes;
	
	private JButton jButtonPesquisa; //Realizar pesquisa pelo nome do cliente
	private JButton jButtonFiltro; //adicionar filtros a tabela
	private JButton jButtonEditar; //Editar dados do cliente
	private JButton jButtonSalvar; //Salvar alteração nos dados do cliente
	private JButton jButtonCancelar; //Cancela alterações;
	
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
	private Color corFundo = CoresPrograma.getCorFundo(); // cor de fundo dos jpanels
	
	private Color foreground = CoresPrograma.getForeground(); // foregroudo dos jbuttons
	private Color foregroundClic = CoresPrograma.getForegroundClic(); // foregroud de jbutton quando clicado ou ganhado foco
		
	// ### Fim  da  criação  de objetos ###
    // ------------------------------------
	
	public JPanelConsultarClientes() {
		getjPanelListaClientes();
		addComponentesJPanelListaClientes();
		addComponentesJPanelCentral();
		getjJPanelConsultarClientes();
		addComponetesJPanelConsultarClientes();
	}
	
    // ### Início da criação dos jPanels e jTables ###
	
	public JPanel getjJPanelConsultarClientes() {
		
		this.setLayout(new BorderLayout());
		
		return this;
	}

	public JPanel getjPanelBarraPesquisa() {
		
		if(jPanelBarraPesquisa == null){
	
			jPanelBarraPesquisa = new JPanel();
			jPanelBarraPesquisa.setLayout(new FlowLayout());
			jPanelBarraPesquisa.setPreferredSize(new Dimension(100,100));
			jPanelBarraPesquisa.setVisible(true);
			jPanelBarraPesquisa.setBackground(corEscura);
	
		}
		return jPanelBarraPesquisa;
	}
	public JPanel getjPanelCentral() {
		
		if(jPanelCentral == null){
	
			jPanelCentral = new JPanel();			
			jPanelCentral.setLayout(new FlowLayout());
		}
		return jPanelCentral;
	}
	public JPanel getjPanelListaClientes() {
		
		if(jPanelListaClientes == null){
	
			jPanelListaClientes = new JPanel();
			jPanelListaClientes.setLayout(null);
			jPanelListaClientes.setPreferredSize(new Dimension(400, 200));
			
		}
		return jPanelListaClientes;
	}
	public JPanel getjPanelDadosCiente() {
		
		if(jPanelDadosClientes == null){
	
			jPanelDadosClientes = new JPanel();
			jPanelDadosClientes.setBounds(273, 42, 100, 129);
				
		}
		return jPanelDadosClientes;
	}
	
	
	public JTable getjTableListaClientes() {
		if(jTableListaClientes == null) {
			
			jTableListaClientes = new JTable(dadosJTable, tituloJTable);
			jTableListaClientes.setBackground(Color.YELLOW);
			jTableListaClientes.setVisible(true);
			jTableListaClientes.getPreferredScrollableViewportSize();
			
		}
		return jTableListaClientes;
	}
	
	
	public JScrollPane getjScrollPane() {
		if(jScrollPane == null) {
			jScrollPane = new JScrollPane(getjTableListaClientes());
			jScrollPane.setBounds(12, 42, 225, 129);
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
	
		}
		return jButtonPesquisa;
	}
    
    
	public JButton getjButtonFiltro() {
		
		if(jButtonFiltro == null){
	
			jButtonFiltro = new JButton();
	
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
	// ### Início dos métodos de adição de componentes ###
	
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
