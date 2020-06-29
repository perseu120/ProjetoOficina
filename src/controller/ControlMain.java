package controller;

import javax.swing.UIManager;

import view.*;
;

public class ControlMain {
	
	private static ControlJPanelLogin controlJPanelLogin;
	
	private static JFramePrincipal jFramePrincipal;
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
		 getControlJPanelLogin();
	}
	
	

	public static ControlJPanelLogin getControlJPanelLogin() {
		if(controlJPanelLogin == null){
			controlJPanelLogin = new ControlJPanelLogin(getjFramePrincipal(), getjPanelLogin());
		}
		return controlJPanelLogin;
	}


	public static JFramePrincipal getjFramePrincipal() {
		if(jFramePrincipal == null){
			jFramePrincipal = new JFramePrincipal();
		}
		return jFramePrincipal;
	}
	

	public static JPanelLogin getjPanelLogin() {
		if(jPanelLogin == null){
			jPanelLogin = new JPanelLogin();
		}
		return jPanelLogin;
	}
	
	
}
