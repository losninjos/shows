package de.bavariansdontpanic.shows.main;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.bavariansdontpanic.shows.service.RageTV;
//import de.bavariansdontpanic.shows.service.Scrape;
import de.bavariansdontpanic.shows.util.ConfEnum;
import de.bavariansdontpanic.shows.util.ShowsConst;

public class Shows {


    private static final Logger logger = LoggerFactory.getLogger(Shows.class); 
    
    public static void main(String[] args) {
        
        RageTV ragetv = new RageTV();
        
        PropertyConfigurator.configure(ShowsConst.CONF_DIRECTORY + "/" + ConfEnum.LOG4J.getConfFile());
        
        //readXML(Scrape.getScrapeProperty("scrape.site"));
        ragetv.readXML("/Users/nsvir4k/Downloads/ragetv.xml");

    }

}
