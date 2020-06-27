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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import model.CoresPrograma;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class JPanelConsultarClientes extends JPanel{

	// ### In�cio declara��o de vari�veis ###
	
	private JPanel jPanelBarraPesquisa; //Contem os JButtons de pesquisa e filtro
	private JPanel jPanelCentral; //JPanel utilizado para a resposividade da classe
	private JPanel jPanelListaClientes; //Contem a JTable e jPanel de dados do cliente
	private JPanel jPanelDadosCiente; //ira exibir os dados dos clientes
	
	private JTable jTableListaClientes;
	
	private JButton jButtonPesquisa; //Realizar pesquisa pelo nome do cliente
	private JButton jButtonFiltro; //adicionar filtros a tabela
	private JButton jButtonEditar; //Editar dados do cliente
	private JButton jButtonSalvar; //Salvar altera��o nos dados do cliente
	private JButton jButtonCancelar; //Cancela altera��es;
	
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

	
	    
	    
	    
	// ### Fim dlecara��o de  vari�veis ###
	// ------------------------------------
	// ### Inicio de cria��o de objetos ###
    
    CoresPrograma CoresPrograma = new CoresPrograma();
    
    private Color corEscura = CoresPrograma.getCorEscura(); // cor contida tamb�m na barra de menu superior
	private Color corFundo = CoresPrograma.getCorFundo(); // cor de fundo dos jpanels
	
	private Color foreground = CoresPrograma.getForeground(); // foregroudo dos jbuttons
	private Color foregroundClic = CoresPrograma.getForegroundClic(); // foregroud de jbutton quando clicado ou ganhado foco
		
	// ### Fim  da  cria��o  de objetos ###
    // ------------------------------------
	
	public JPanelConsultarClientes() {

		addComponentesJPanelListaClientes();
		addComponentesJPanelCentral();
		getjJPanelConsultarClientes();
		addComponetesJPanelConsultarClientes();
	}
	
    // ### In�cio da cria��o dos jPanels e jTables ###
	
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
			jPanelBarraPesquisa.setLayout(new FlowLayout());
			jPanelBarraPesquisa.setVisible(true);
			jPanelBarraPesquisa.setBackground(corFundo);
		}
		return jPanelCentral;
	}
	public JPanel getjPanelListaClientes() {
		
		if(jPanelListaClientes == null){
	
			jPanelListaClientes = new JPanel();
			jPanelListaClientes.setBounds(100, 5, 250, 162);
			jPanelBarraPesquisa.setLayout(null);
			jPanelBarraPesquisa.setPreferredSize(new Dimension(400,550));
			jPanelBarraPesquisa.setSize(400,400);
			jPanelBarraPesquisa.setVisible(true);
			jPanelBarraPesquisa.setBackground(corEscura);
		}
		return jPanelListaClientes;
	}
	public JPanel getjPanelDadosCiente() {
		
		if(jPanelDadosCiente == null){
	
			jPanelDadosCiente = new JPanel();
			jPanelDadosCiente.setBounds(235, 32, 10, 10);
			jPanelBarraPesquisa.setLayout(null);
			jPanelBarraPesquisa.setPreferredSize(new Dimension(100,200));
			jPanelBarraPesquisa.setVisible(true);
			jPanelBarraPesquisa.setBackground(corFundo);
	
		}
		return jPanelDadosCiente;
	}
	
	
	public JTable getjTableListaClientes() {
		if(jTableListaClientes == null) {
			
			jTableListaClientes = new JTable();
			jTableListaClientes.setForeground(Color.MAGENTA);
			jTableListaClientes.setBackground(Color.YELLOW);
			jTableListaClientes.setBounds(12, 32, 225, 96);
			jTableListaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			jTableListaClientes.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
				},
				new String[] {
					"   N\u00BA   ", "   Nome   ", "   CPF   "
				}
			));
		}
		return jTableListaClientes;
	}
	
    // ### Final da cria��o dos jPanels e jTalbles ###
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
    // ### In�cio dos gets dos jLabels ###
    
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
	// ### In�cio dos m�todos de adi��o de componentes ###
	
	private void addComponetesJPanelConsultarClientes() {
		
		this.add(BorderLayout.NORTH,getjPanelBarraPesquisa());
		this.add(BorderLayout.CENTER, getjPanelCentral());
		
	}
	
	
	private void addComponentesJPanelCentral() {
		getjPanelCentral().setLayout(null);
		getjPanelCentral().add(getjPanelListaClientes());
	}
	
	private void addComponentesJPanelListaClientes() {
		getjPanelListaClientes().setLayout(null);
		
		getjPanelListaClientes().add(getjTableListaClientes());
		getjPanelListaClientes().add(getjPanelDadosCiente());
	}
	// ### Final dos m�todos de adi��o de componentes ###

}
