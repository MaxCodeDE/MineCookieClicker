package me.minemax.MineCookieClicker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class FileChecker {

	
	private ArrayList<String> bilder = new ArrayList<String>();
	
	
	
	public void checkFiles() {
		
		
		File ordner = new File("./MineCookieClickerDaten/");
		ordner.mkdir();
		
		
		
		File file1 = new File("./MineCookieClickerDaten/" + "Cookies.txt");
		if (!file1.exists()) {
			
			try {
				if (file1.createNewFile()) {
					System.out.println("Datei erstellt!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

		
		bilder.add("Cookie.png");
		bilder.add("CookieKlein.png");
		bilder.add("CookieEinstellungen.png");
		bilder.add("CookieShop.png");
		bilder.add("CookieSchliessen.png");
		
		
		
		for (String bild : bilder) {
		
		System.out.println("Bilder werden erstllt!" + bild);
		
		File file2 = new File("./MineCookieClickerDaten/" + bild);
		if (!file2.exists()) {

		try {
			
			URL link = new URL("http://server.max-bremer.info:8083/MineCookieClicker/" + bild);
			URLConnection url = link.openConnection();
			InputStream is = url.getInputStream();
			
			FileOutputStream os = new FileOutputStream("./MineCookieClickerDaten/" + bild);
			byte[] buffer = new byte[1024];
			
			int lenght = 0;;
			
			while ((lenght = is.read(buffer)) != -1) {
			os.write(buffer, 0, lenght);
			}
			
			System.out.println(bild + " wird erstellt!");
			
			os.close();
			is.close();
			
			
		} catch(IOException e) {
			
		}
			
		}
		
		
		}
		
		
	}
	
	
}
