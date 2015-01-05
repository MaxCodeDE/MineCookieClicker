package me.minemax.MineCookieClicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CookieShopFrame extends JFrame implements ActionListener {

	
	public JLabel text;
	
	
	public CookieShopFrame() {
		
		super("MineCookieClicker - Shop");
		
		this.setSize(500, 500);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		text = new JLabel();
		text.setText("Kommt bald!");
		text.setBounds(10, 10, 200, 200);
		this.add(text);
		
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
