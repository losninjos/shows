package de.bavariansdontpanic.shows.service;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RageTV {
    
    private static final Logger logger = LoggerFactory.getLogger(RageTV.class);  
    
    public void readXML(String fileName) {
        
        Document document;
        DocumentBuilder documentBuilder;
        DocumentBuilderFactory documentBuilderFactory;
        NodeList nodeList;
        File xmlInputFile;
        
        try {
            xmlInputFile = new File(fileName);
            documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(xmlInputFile);
            nodeList = document.getElementsByTagName("*");
            
            document.getDocumentElement().normalize();
            
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    if (element.getTagName().equalsIgnoreCase("DAY")) {
                        logger.info(element.getAttribute("attr"));
                    }
                    
                    
                }
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
