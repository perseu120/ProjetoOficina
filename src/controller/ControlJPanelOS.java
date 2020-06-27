package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.CoresPrograma;
import view.JFramePrincipal;
import view.JPanelOS;
import view.JPanelPrincipal;

public class ControlJPanelOS implements MouseListener{
	// ### Inicio declaração de variáveis ###
	
	private JFramePrincipal jFramePrincipal;
	private JPanelOS jPanelOS;	
	private JPanelPrincipal jPanelPrincipal;
	
	private JButton jButtonAnterior; // Guarda o ultimo jbutton de seleção, clidado
	
	
	
	// ### Fim dlecaração de  variáveis ###
    // ------------------------------------
	// ### Inicio de criação de objetos ###
	
	CoresPrograma coresProgram = new CoresPrograma();
	
	private Color corEscura = coresProgram.getCorEscura(); // cor contida também na barra de menu superior
	private Color corFundo = coresProgram.getCorFundo(); // cor de fundo dos jpanels
	private Color foregroundClic = coresProgram.getForegroundClic(); // foregroud de jbutton quando clicado ou ganhado foco
	private Color foregroundText = coresProgram.getForegroundText(); // foregroud de jTextfilde e similares.
	
	SimpleDateFormat data = new SimpleDateFormat("yyyy");
	int ano;
	// ### Fim  da  criação  de objetos ###   
	// ------------------------------------
	// ### Início do método construtor ###
	 
	public ControlJPanelOS(JFramePrincipal jFramePrincipal, JPanelOS jPanelOS , JPanelPrincipal jPanelPrincipal) {
		this.jPanelPrincipal = jPanelPrincipal;
		this.jFramePrincipal = jFramePrincipal;
		this.jPanelOS = jPanelOS;
		
		this.jButtonAnterior = getjPanelOS().getjButtonVeiculo(); // seta botão selecionado por padrão;
		
		ano = Integer.valueOf(data.format(new Date())); 
		listaDeAno();
		
		AddEvent();
			
	}	
	
	// ### Final do método construtor ###
	// ----------------------------------
	
	
	private void AddEvent() { // Método para adição de enventos aos componentes
		this.getjPanelOS().getjButtonCliente().addMouseListener(this);
		this.getjPanelOS().getjButtonServico().addMouseListener(this);
		this.getjPanelOS().getjButtonVeiculo().addMouseListener(this);
	}
	
	
	// ### Início dos métodos getters ###
	
public JFramePrincipal getjFramePrincipal() {
		
		if(jFramePrincipal == null){
	
			jFramePrincipal = new JFramePrincipal();
	
		}
		return jFramePrincipal;
	}
	

	public JPanelOS getjPanelOS() {
		
		if(jPanelOS == null){
	
			jPanelOS = new JPanelOS();
	
		}
		return jPanelOS;
	}
	
	
	public JPanelPrincipal getjJPanelPrincipal() {
		if(jPanelPrincipal == null) {
		}
		return jPanelPrincipal;
	}
	
	// ### Final dos métodos getters ###
	// ---------------------------------
	// ### Início métodos da classe ###
	
	private void selecaoJButton(JButton jButton) { // Muda a aparencia dos jButton: veiculo, cliente e servico
		
		jButtonAnterior.setBackground(corEscura);
		jButtonAnterior.setForeground(foregroundText);
		jButton.setBackground(corFundo);
		jButton.setForeground(foregroundClic);
		
		jButtonAnterior = jButton;
	}
	
	private void listaDeAno() {
		for(int ano = this.ano; ano >= 1950; ano--) {
			getjPanelOS().getjComboBoxAno().addItem(ano);
		}
	}	
	
	
	// ### Final métodos da classe ###

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == getjPanelOS().getjButtonVeiculo()) {

			selecaoJButton(getjPanelOS().getjButtonVeiculo());
			getjPanelOS().alteraJPanelTela(getjPanelOS().getjPanelBuscarVeiculo(), getjPanelOS().getjPanelDadosVeiculo());

		}
		
			
		if(e.getSource() == getjPanelOS().getjButtonCliente()) {

			selecaoJButton(getjPanelOS().getjButtonCliente());
			getjPanelOS().alteraJPanelTela(getjPanelOS().getjPanelBuscarCliente(), getjPanelOS().getjPanelDadosCliente());
		}
		
		
		if(e.getSource() == getjPanelOS().getjButtonServico()) {

			selecaoJButton(getjPanelOS().getjButtonServico());
			
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// ### Final métodos da classe ###
}
