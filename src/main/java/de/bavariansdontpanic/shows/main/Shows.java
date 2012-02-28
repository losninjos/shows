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
            Elements tableBody = doc.getElementsByTag("tbody");
            
            int i = 0;
            for (Element day : tableBody) {
                day.getElementsByTag("tr");
                i++;
                if ( i == 1) {
                    //Found tableBody with content
                    Elements tableRows = day.getElementsByTag("tr");
                    int j = 0;
                    logger.info(String.valueOf(tableRows.size()));
                    for (Element tableRow :tableRows) {
                        if (j == 2) {
                            logger.info(tableRow.toString());
                            Elements days = tableRow.getElementsByClass("day");
                        }
                        j++;
                    }
                }
                
                //logger.info(String.valueOf(tableBody.size()));
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
