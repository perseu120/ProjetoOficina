package controller;

import view.JFramePrincipal;

import view.JPanelPrincipal;

public class ControlMain {
	
	private static JFramePrincipal jFramePrincipal;
	private static JPanelPrincipal jPanelPrincipal;
		
	
	public static void main(String args[]) {
		
		getjFramePrincipal();//.alterarJPanel(getjPanelPrincipal());
		
		
		
		
		
		
		
		
	        //Verificar a possíbilidade de implementação das linhas de códigos abaixo
		/*
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Windows".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(JPanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	 
	        java.awt.EventQueue.invokeLater(() -> { new JPanelLogin().setVisible(true);});
	}
	*/

	}


	public static JFramePrincipal getjFramePrincipal() {
		if(jFramePrincipal == null){
			jFramePrincipal = new JFramePrincipal();
		}
		return jFramePrincipal;}


	public static JPanelPrincipal getjPanelPrincipal() {
		if(jPanelPrincipal == null){
			jPanelPrincipal = new JPanelPrincipal();
		}
		return jPanelPrincipal;}
	
	
	
	
}
