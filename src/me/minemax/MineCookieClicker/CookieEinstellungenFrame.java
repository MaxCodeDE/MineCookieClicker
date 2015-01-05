package me.minemax.MineCookieClicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CookieEinstellungenFrame extends JFrame implements ActionListener {

	//Logo
	public Icon einstellungen;
	public JLabel icon2;
	
	//Schliessen button
	public JLabel schliessen;
	public Icon icon1;
	
	//Cheat Feld
	public JTextField cheatfield;
	public JButton cheat;
	
	public CookieEinstellungenFrame() {
		
		super("MineCookieClicker - Einstellungen");
		
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		einstellungen = new ImageIcon("./MineCookieClickerDaten/CookieEinstellungen.png");
		icon2 = new JLabel(einstellungen);
		icon2.setBounds(150, 10, 177, 44);
		this.add(icon2);
		
	
		icon1 = new ImageIcon("./MineCookieClickerDaten/CookieSchliessen.png");
		schliessen = new JLabel(icon1);
		schliessen.setBounds(330, 400, 177, 44);
		this.add(schliessen);

		schliessen.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			close();
		}			
		});
		
		
		cheatfield = new JTextField();
		cheatfield.setBounds(30, 100, 200, 50);
		this.add(cheatfield);
		
		cheat = new JButton("Cheatcode verwenden");
		cheat.addActionListener(this);
		cheat.setBounds(250, 100, 200, 50);
		this.add(cheat);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public void close() {		
		this.dispose();
	}










	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == cheat) {
			String cheatcode = cheatfield.getText();
			CookieEinstellungenCheat cec = new CookieEinstellungenCheat();
			cec.cheat(cheatcode);
			cheatfield.setText("");
		}
		
		
		
	}
	
}
