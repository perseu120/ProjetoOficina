package controller;

import javax.swing.JButton;
import javax.swing.UIManager;

import view.JFramePrincipal;
import view.test;
import view.JPanelPrincipal;

public class ControlMain {
	
	private static JFramePrincipal jFramePrincipal;
	private static JPanelPrincipal jPanelPrincipal;
	static test test;
		
	
	public static void main(String args[]) {
		
		
		//Verificar a possíbilidade de implementação das linhas de códigos abaixo		
	    /*
	     *try {
	      	for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	        	if ("Windows".equals(info.getName())) {
	            	UIManager.setLookAndFeel(info.getClassName());
	                break;
	            }
	        }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	           
	      }
	      *
	      */
		getjFramePrincipal().alterarJPanel(getjPanelPrincipal());
	}
	
	


	public static JFramePrincipal getjFramePrincipal() {
		if(jFramePrincipal == null){
			jFramePrincipal = new JFramePrincipal();
		}
		return jFramePrincipal;}
	
	public static test getTest() {
		if(test == null){
			test = new test();
		}
		return test;}


	public static JPanelPrincipal getjPanelPrincipal() {
		if(jPanelPrincipal == null){
			jPanelPrincipal = new JPanelPrincipal();
		}
		return jPanelPrincipal;}
	
	
	
	
}
