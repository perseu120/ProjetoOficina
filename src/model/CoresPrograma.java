package model;

import java.awt.Color;

public class CoresPrograma {

	private Color corFundo;         // cor de fundo dos jpanels
	private Color corIntermediaria; // cor de jpanel sobre a cor de fundo
	private Color corEscura;        // cor contida também na barra de menu superior
	private Color corBorda;         // cor das bordas dos componentes
	private Color foreground;       // foregroudo dos jbuttons
	private Color foregroundClic;   // foregroud de jbutton quando clicado ou ganhado foco
	private Color foregroundText;   // foregroud de jTextfilde e similares.
	
	public CoresPrograma() {
		
	}

	public Color getCorFundo() {
		
		if(corFundo == null){
	
			corFundo = new Color(79,79,79); // cor de fundo dos jpanels
	
		}
		return corFundo;
	}
	

	public Color getCorIntermediaria() {
		
		if(corIntermediaria == null){
	
			corIntermediaria = new Color(45,45,45); // cor de jpanel sobre a cor de fundo
	
		}
		return corIntermediaria;
	}
	

	public Color getCorEscura() {
		
		if(corEscura == null){
	
			corEscura = new Color(45,45,45); // cor contida também na barra de menu superior
	
		}
		return corEscura;
	}
	

	public Color getCorBorda() {
		
		if(corBorda == null){
	
			corBorda = new Color(0,0,0); // cor das bordas dos componentes
	
		}
		return corBorda;
	}
	

	public Color getForeground() {
		
		if(foreground == null){
	
			foreground = new Color(150,150,150); // foregroudo dos jbuttons
	
		}
		return foreground;
	}
	

	public Color getForegroundClic() {
		
		if(foregroundClic == null){
	
			foregroundClic = new Color(0,0,0); // foregroud de jbutton quando clicado ou ganhado foco
	
		}
		return foregroundClic;
	}
	

	public Color getForegroundText() {
		
		if(foregroundText == null){
	
			foregroundText = new Color(0,0,0); // foregroud de jTextfilde e similares.
	
		}
		return foregroundText;
	}
	
	

}
