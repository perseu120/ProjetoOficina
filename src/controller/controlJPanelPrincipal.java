package controller;

public class controlJPanelPrincipal {

	public controlJPanelPrincipal() {
		
	}
	
	// Métodos criados no projeto antes do padrão MVC>>>>>>>>>
	/*
	private void inicializeAplication() {
		telaConf.fullScree(this);
	}

	private void open(JPanel panel, int wdt_close, int wdt_open, int hgt) {
		panel.setSize(wdt_close, hgt);
		Thread thread;
		thread = new Thread() {

			@Override
			public void run() {
				try {
					for (int i = wdt_close; i <= wdt_open; i++) {
						Thread.sleep(1);
						panel.setSize(i, hgt);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		};
		thread.start();
	}

	private void close(JPanel panel, int wdt_close, int wdt_open, int hgt) {
		panel.setSize(wdt_open, hgt);
		Thread thread;
		thread = new Thread() {

			@Override
			public void run() {
				try {
					for (int i = wdt_open; i >= wdt_close; i--) {
						Thread.sleep(1);
						panel.setSize(i, hgt);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		};
		thread.start();

	}


	private void btnClick(int num) {
		this.num = num;
		if (num != 1)
			this.setColor(51, 51, 51);
		int c = 103;
		int c1 = 103;
		int c2 = 103;
		switch (num) {
		case 1:
			this.JButtonMenuBar.setBackground(new Color(109, 65, 0));
			break;
		case 2:
			this.JButtonHome.setBackground(new Color(c, c1, c2));
			break;
		case 3:
			this.JButtonOS.setBackground(new Color(c, c1, c2));
			break;
		case 4:
			this.JButtonOrcamento.setBackground(new Color(c, c1, c2));
			break;
		case 5:
			this.JButtonVeiculos.setBackground(new Color(c, c1, c2));
			break;
		case 6:
			this.JButtonClientes.setBackground(new Color(c, c1, c2));
			break;
		case 7:
			this.JButtonAddUsuarios.setBackground(new Color(c, c1, c2));
			break;
		case 8:
			this.JButtonFaturamento.setBackground(new Color(c, c1, c2));
			break;

		case 9:
			this.JButtonConfiguracao.setBackground(new Color(c, c1, c2));
			break;
		}
	}

	private void setColor(int c, int c1, int c2) {
		this.JButtonHome.setBackground(new Color(c, c1, c2));
		this.JButtonOS.setBackground(new Color(c, c1, c2));
		this.JButtonOrcamento.setBackground(new Color(c, c1, c2));
		this.JButtonVeiculos.setBackground(new Color(c, c1, c2));
		this.JButtonClientes.setBackground(new Color(c, c1, c2));
		this.JButtonAddUsuarios.setBackground(new Color(c, c1, c2));
		this.JButtonFaturamento.setBackground(new Color(c, c1, c2));
		this.JButtonConfiguracao.setBackground(new Color(c, c1, c2));
	}

	private void mouseExited(JButton btn, int numEx) {
	
		if (num != numEx) {
			btn.setBackground(new Color(sc, sc1, sc2));
		}
	}
	*/
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
}
