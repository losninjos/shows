package de.bavariansdontpanic.shows.main;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.bavariansdontpanic.shows.util.ConfEnum;
import de.bavariansdontpanic.shows.util.ShowsConst;

public class Shows {
    
    private static final Logger logger = LoggerFactory.getLogger(Shows.class);  

    
    public static void main(String[] args) {
        
        PropertyConfigurator.configure(ShowsConst.CONF_DIRECTORY + "/" + ConfEnum.LOG4J.getConfFile());
        
        try {
            //Document doc = Jsoup.connect(Scrape.getScrapeProperty("scrape.site")).get();
            File input = new File("/Users/nsvir4k/Downloads/source.html");
            Document doc = Jsoup.parse(input, "UTF-8");
            Elements content = doc.getElementsByClass("day");
            Document doc2 = Jsoup.parse(content.toString());
            Elements day = doc2.getElementsByAttribute("id");
            
            //logger.info(doc.toString());
            logger.info(doc2.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
