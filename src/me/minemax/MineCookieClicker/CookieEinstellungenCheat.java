package me.minemax.MineCookieClicker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CookieEinstellungenCheat {

	
	
	public void cheat(String cheatcode) {
		
		if (cheatcode.equals("MoreCookies")) {
			File file = new File("./MineCookieClickerDaten/" + "Cookies.txt");
			Properties pro = new Properties();
			
			try {
				pro.load(new FileInputStream(file));
				
				
				String cookies = pro.getProperty("Cookies");
				int cookiesint = Integer.valueOf(cookies);
				cookiesint = cookiesint + 1000;
				
				cookies = String.valueOf(cookiesint);
				
				pro.setProperty("Cookies", cookies);
				
				pro.store(new FileOutputStream(file), "In dieser Datei werden deine Cookies gespeichert");
				
				
				//UpdateCookies uc = new UpdateCookies();
				//uc.updateCookes(null);
				
				CheatFrame cf = new CheatFrame();
				cf.setVisible(true);
				cf.setTrue();
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}

			
			
		} else {
			CheatFrame cf = new CheatFrame();
			cf.setVisible(true);
			cf.setFalse();
			System.out.print("test " + cheatcode);
		}
		
		
	}
	
	
	
	
	
}
