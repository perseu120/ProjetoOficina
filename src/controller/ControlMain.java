package controller;

import javax.swing.UIManager;

import view.JFramePrincipal;
import view.JPanelPrincipal;

public class ControlMain {
	
	private static ControlJPanelPrincipal controlJPanelPricipal;
	
	private static JFramePrincipal jFramePrincipal;
	private static JPanelPrincipal jPanelPrincipal;
		
	
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
	      
		 getjFramePrincipal().alterarJPanel(getjPanelPrincipal());
<<<<<<< HEAD
		 getControlJPanelPricipal();
	}
	
	
	
	

	public static ControlJPanelPrincipal getControlJPanelPricipal() {
		if(controlJPanelPricipal == null){
			controlJPanelPricipal = new ControlJPanelPrincipal(getjFramePrincipal(),getjPanelPrincipal());
		}
		return controlJPanelPricipal;}




=======
	}
	
>>>>>>> 1f342a547b3d888df5d51ea7e66553e7d69b9ee7

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
}
