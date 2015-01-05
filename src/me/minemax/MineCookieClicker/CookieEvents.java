package me.minemax.MineCookieClicker;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CookieEvents {
	
	
	
	public void addActions(JLabel shop, JLabel einstellungen, final JLabel cookie, final JLabel cookies, JLabel schlieﬂen) {
		
		
		shop.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			CookieShopFrame csf = new CookieShopFrame();
			csf.setVisible(true);
		}
		});
		
		einstellungen.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			CookieEinstellungenFrame cef = new CookieEinstellungenFrame();
			cef.setVisible(true);
		}
		});
		
		schlieﬂen.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			System.exit(0);
		}
		});
		
		cookie.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			Icon cookie2 = new ImageIcon("./MineCookieClickerDaten/CookieKlein.png");
			cookie.setIcon(cookie2);
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
				Icon cookienormal = new ImageIcon("./MineCookieClickerDaten/Cookie.png");
				cookie.setIcon(cookienormal);
				
				
				
				File file = new File("./MineCookieClickerDaten/" + "Cookies.txt");
				Properties pro = new Properties();
				
				try {
					pro.load(new FileInputStream(file));
					
					if (pro.getProperty("Cookies") == null) {
						pro.setProperty("Cookies", "0");
					}
					
					
					String cookiesstring = pro.getProperty("Cookies");
					int cookiesint = Integer.parseInt(cookiesstring);
					cookiesint++;
					String cookiesfertig = String.valueOf(cookiesint);
					
					pro.setProperty("Cookies", cookiesfertig);
					
					FileOutputStream out = new FileOutputStream(file);
					
					pro.store(out, "In dieser Datei werden deine Cookies gespeichert");
					out.close();
					
					
					UpdateCookies uc = new UpdateCookies();
					uc.updateCookes(cookies);
					
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				}
				}, 30);
		}
		});
	}
	
	
	
	
}
