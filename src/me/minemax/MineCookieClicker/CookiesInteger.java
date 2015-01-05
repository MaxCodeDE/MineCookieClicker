package me.minemax.MineCookieClicker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CookiesInteger {

	public int cookiesint;
	
	public int getCookies() {
		
		
		File file = new File("./MineCookieClickerDaten/" + "Cookies.txt");
		Properties pro = new Properties();
		
		try {
			pro.load(new FileInputStream(file));
		
			if (pro.getProperty("Cookies") == null) {
				pro.setProperty("Cookies", "0");
			}
			
			
			
			String cookies = pro.getProperty("Cookies");
			cookiesint = Integer.parseInt(cookies);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("test4 " + cookiesint);
		return cookiesint;
		
		
	}
	
	
}
