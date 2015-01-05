package me.minemax.MineCookieClicker;

import javax.swing.JLabel;

public class UpdateCookies {
	

	
	
	
	
	public void updateCookes(JLabel cookies) {
		
		System.out.println("test");
		CookiesInteger ci = new CookiesInteger();
		int cookiesint = ci.getCookies();
		//CookieMainFrame cmf = new CookieMainFrame();
		//cmf.getCookieLabel().setText("Du hast " + cookiesint + " Cookies!");
		//cmf.cookies.setText("Du hast " + cookiesint + " Cookies!");
		
		cookies.setText("Du hast " + cookiesint + " Cookies!");
		
		
		
		
		
		
	}
	
	
	
}
