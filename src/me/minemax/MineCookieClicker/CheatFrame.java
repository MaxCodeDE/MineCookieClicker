package me.minemax.MineCookieClicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CheatFrame extends JFrame implements ActionListener {

	
	public JLabel schliessen;
	public Icon icon1;
	
	public JLabel text;
	
	public CheatFrame() {
		
		super("Cheat");
		
		this.setSize(200, 200);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		text = new JLabel();
		text.setBounds(10, 10, 200, 100);
		this.add(text);
		
		
		icon1 = new ImageIcon("./MineCookieClickerDaten/CookieSchliessen.png");
		schliessen = new JLabel(icon1);
		schliessen.setBounds(8, 100, 177, 44);
		this.add(schliessen);
		
		schliessen.addMouseListener(new MouseAdapter() { 
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
	}
	
	
	
	public void setTrue() {	
		text.setText("Cheatcode war richtig!");		
	}
	
	
	public void setFalse() {
		text.setText("Cheatcode ist falsch!");
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
