package de.bavariansdontpanic.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Scrape {
	
	private static Logger LOG = Logger;

	public void getScrapeProperty(String p) {
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("scrape.conf"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		LOG.debug(prop.getProperty("scrape.site"));
		
	}
	
	
	
	

	
}
