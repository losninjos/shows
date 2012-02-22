package de.bavariansdontpanic.shows.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import de.bavariansdontpanic.shows.util.ShowsConst;

public class Scrape {
	
	public static void getScrapeProperty(String p) {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(ShowsConst.SCRAPE_DIRECTORY + "scrape.conf"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//LOG.debug(prop.getProperty("scrape.site"));
		
	}
	
	public static void main (String[] args) {
		getScrapeProperty("test");
	}
	
	
	
	

	
}
