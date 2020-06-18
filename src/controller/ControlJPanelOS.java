package controller;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import view.JFramePrincipal;
import view.JPanelOS;

public class ControlJPanelOS implements MouseListener{
	// ### Inicio declara��o de vari�veis ###
	
	private JFramePrincipal jFramePrincipal;
	private JPanelOS jPanelOS;	
	
	
	
	// ### Fim dlecara��o de  vari�veis ###
    // ------------------------------------
	// ### Inicio de cria��o de objetos ###
	
	SimpleDateFormat data = new SimpleDateFormat("yyyy");
	int ano;
	// ### Fim  da  cria��o  de objetos ###   
	// ------------------------------------
	// ### In�cio do m�todo construtor ###
	 
	public ControlJPanelOS(JFramePrincipal jFramePrincipal, JPanelOS jPanelOS ) {
		this.jFramePrincipal = jFramePrincipal;
		this.jPanelOS = jPanelOS;
		ano = Integer.valueOf(data.format(new Date())); 
		listaDeAno();
		AddEvent();
			
	}	
	
	// ### Final do m�todo construtor ###
	// ----------------------------------
	
	
	private void AddEvent() { // M�todo para adi��o de enventos aos componentes
		this.getjPanelOS().getjButtonCliente().addMouseListener(this);
		this.getjPanelOS().getjButtonServico().addMouseListener(this);
		this.getjPanelOS().getjButtonVeiculo().addMouseListener(this);
	}
	
	
	// ### In�cio dos m�todos getters ###
	
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
	
	// ### Final dos m�todos getters ###
	// ---------------------------------
	// ### In�cio m�todos da classe ###
	
	private void listaDeAno() {
		for(int ano = this.ano; ano >= 1950; ano--) {
			getjPanelOS().getjComboBoxAno().addItem(ano);
		}
	}	
	
	
	// ### Final m�todos da classe ###

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == getjPanelOS().getjButtonVeiculo()) {
			getjPanelOS().alteraJPanelTela(getjPanelOS().getjPanelBuscarVeiculo(), getjPanelOS().getjPanelDadosVeiculo());
		}
		
			
		if(e.getSource() == getjPanelOS().getjButtonCliente()) {
			System.out.println("nada");
			getjPanelOS().alteraJPanelTela(getjPanelOS().getjPanelBuscarCliente(), getjPanelOS().getjPanelDadosCliente());
		}
		
		
		if(e.getSource() == getjPanelOS().getjButtonVeiculo()) {
			
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
	
	// ### Final m�todos da classe ###
}
