package de.bavariansdontpanic.shows.util;

public enum ConfEnum {

    SCRAPE      ("scrape.conf"),
    DATABASE    ("db.conf"),
    LOG4J       ("log4j.properties");
    
    private final String confFile;
    
    ConfEnum(String confFile) {
        this.confFile = confFile;
    }
    
    public String getConfFile() {
        return confFile;
    }
}
