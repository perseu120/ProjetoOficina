package controller;

import javax.swing.UIManager;

import view.*;
;

public class ControlMain {
	
	private static ControlJPanelPrincipal controlJPanelPricipal;
	
	private static JFramePrincipal jFramePrincipal;
	private static JPanelPrincipal jPanelPrincipal;
	private static JPanelLogin jPanelLogin;
		
	
	public static void main(String args[]) {
		
		try {
	      	for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	        	if ("Windows".equals(info.getName())) { // Define designer dos componentes ("Windows","Windows Classic","Nimbus","Metal","CDE/Motif")
	            	UIManager.setLookAndFeel(info.getClassName());
	                break;
	            }
	        }
	     } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	           
	     }
	      
		 getjFramePrincipal().alterarJPanel(getjPanelLogin());
		 getControlJPanelPricipal();
	}
	
	

	public static ControlJPanelPrincipal getControlJPanelPricipal() {
		if(controlJPanelPricipal == null){
			controlJPanelPricipal = new ControlJPanelPrincipal(getjFramePrincipal(),getjPanelPrincipal());
		}
		return controlJPanelPricipal;}


	public static JFramePrincipal getjFramePrincipal() {
		if(jFramePrincipal == null){
			jFramePrincipal = new JFramePrincipal();
		}
		return jFramePrincipal;
	}
	

	public static JPanelPrincipal getjPanelPrincipal() {
		if(jPanelPrincipal == null){
			jPanelPrincipal = new JPanelPrincipal();
		}
		return jPanelPrincipal;
	}



	public static JPanelLogin getjPanelLogin() {
		if(jPanelLogin == null){
			jPanelLogin = new JPanelLogin();
		}
		return jPanelLogin;}
	
	
}
