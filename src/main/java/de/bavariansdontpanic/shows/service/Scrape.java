package de.bavariansdontpanic.shows.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.bavariansdontpanic.shows.util.ConfEnum;
import de.bavariansdontpanic.shows.util.ShowsConst;

public class Scrape {
    
    private static final Logger logger = LoggerFactory.getLogger(Scrape.class);  
	
    public static String getScrapeProperty(String property) {
				
        Properties prop = new Properties();
		
	try {
	       prop.load(new FileInputStream(ShowsConst.CONF_DIRECTORY + "/" + ConfEnum.SCRAPE.getConfFile()));
	} catch (IOException e) {
	       e.printStackTrace();
	}
	
	logger.info("returning value " + prop.getProperty(property) + " for property " + property + ".");
		
	return prop.getProperty(property);
		
    }
	
	

	
}
