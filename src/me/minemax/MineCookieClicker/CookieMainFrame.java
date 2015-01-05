package me.minemax.MineCookieClicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CookieMainFrame extends JFrame implements ActionListener {
	
	//Shop Button
	public Icon icon1;
	public JLabel shop;
	
	//Einstellungen Button
	public Icon icon2;
	public JLabel einstellungen;
	
	//Click Button
	public Icon cookieicon;
	public JLabel cookie;
	
	//Schlieﬂen button
	public Icon icon3;
	public JLabel schlieﬂen;
	
	//Label Cookies
	public JLabel cookies;
	

	public CookieMainFrame() {
		
		super("MineCookieClicker - Code by MaxCode");
		
		this.setSize(400, 600);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cookieicon = new ImageIcon("./MineCookieClickerDaten/Cookie.png");
		cookie = new JLabel(cookieicon);
		cookie.setBounds(50, 180, 300, 300);
		this.add(cookie);
		
		icon2 = new ImageIcon("./MineCookieClickerDaten/CookieEinstellungen.png");
		einstellungen = new JLabel(icon2);
		einstellungen.setBounds(230, 20, 177, 44);
		this.add(einstellungen);
	
		icon1 = new ImageIcon("./MineCookieClickerDaten/CookieShop.png");
		shop = new JLabel(icon1);
		shop.setBounds(5, 20, 117, 44);
		this.add(shop);
		
		CookiesInteger ci = new CookiesInteger();
		int cookiesint = ci.getCookies();
		
		cookies = new JLabel();
		cookies.setText("Du hast " + cookiesint + " Cookies!");
		cookies.setBounds(130, 70, 200, 100);
		this.add(cookies);
		
		icon3 = new ImageIcon("./MineCookieClickerDaten/CookieSchliessen.png");
		schlieﬂen = new JLabel(icon3);
		schlieﬂen.setBounds(250, 500, 117, 44);
		this.add(schlieﬂen);
		
		CookieEvents cs = new CookieEvents();
		cs.addActions(shop, einstellungen, cookie, cookies, schlieﬂen);
		
	}
	
	
	public JLabel getCookieLabel() {
		return cookies;
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		
	}

}
