package com.xius.smf.utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class XmlResourceBundleParser extends DefaultHandler {

	private final static Logger logger = LogManager.getLogger("XmlResourceBundleParser");
	private List<XmlResourceBundleData> xmlPropertyList;

	private String tmpValue;
	private XmlResourceBundleData xmlPropertyData;

	public static HashMap<String, String> arabicMap = new HashMap<String, String>();
	public static HashMap<String, String> englishMap = new HashMap<String, String>();
	public static HashMap<String, ArrayList<String>> arabicMap_ar = new HashMap<String, ArrayList<String>>();
	public static HashMap<String, ArrayList<String>> englishMap_ar = new HashMap<String, ArrayList<String>>();
	//added this property for getting the arabic content for dynamic values from db
	//this map contains all english words as keys and arabic words as values
	public static HashMap<String, String> allKeysMap = new HashMap<String, String>();

	private static String server_home = System.getProperty("jboss.server.home.dir");
	private static String PROPERTY_FILE_DIR =server_home+"/conf/smfservices/";
	
	public static String PROPERTY_FILE = "NetworkmessageMapping.xml";

	public XmlResourceBundleParser() {

		xmlPropertyList = new ArrayList<XmlResourceBundleData>();
		parseDocument();
	}
	private void parseDocument() {

		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			
			SAXParser parser = factory.newSAXParser(); 
			FileInputStream urlInputStream = new FileInputStream(PROPERTY_FILE_DIR +  PROPERTY_FILE);
			//parser.parse( getClass().getClassLoader().getResourceAsStream("XMLResourceBundle.xml"), this);
			parser.parse(urlInputStream,this);
			
		} catch (ParserConfigurationException e) {

			logger.error("XMLResource Bundle processe failed due to ParserConfigurationException: " + Utilities.getStackTrace( e ));
		} catch (SAXException e) {

			logger.error("XMLResource Bundle processe failed due to SAXException: " + Utilities.getStackTrace( e ));
		} catch (IOException e) {

			logger.error("XMLResource Bundle processe failed due to IOException: " + Utilities.getStackTrace( e ));
		} catch (Exception e) {

			logger.error("XMLResource Bundle processe failed due to Exception: " + Utilities.getStackTrace( e ));
		}
	}

	public void startElement(String s, String s1, String elementName, Attributes attributes) throws SAXException {
		// if current element is book , create new book
		// clear tmpValue on start of element
		
		if (elementName.equalsIgnoreCase("property")) {
			xmlPropertyData = new XmlResourceBundleData();
			xmlPropertyData.setId(attributes.getValue("id"));

		}

	}
	@Override
	public void endElement(String s, String s1, String element) throws SAXException {
		// if end of book element add to list
		ArrayList<String> englist = null;
		ArrayList<String> arabiclist = null;
		HashMap<String, ArrayList<String>> engmap;
		HashMap<String, ArrayList<String>> arabicmap;
		if (element.equals("property")) {
			xmlPropertyList.add( xmlPropertyData);
		}
		if(element.equalsIgnoreCase("en"+xmlPropertyData.getId())){
			xmlPropertyData.setEn( tmpValue );
			if(englishMap_ar != null && englishMap_ar.size() > 0){
				engmap = englishMap_ar;
				if(engmap.get(xmlPropertyData.getId()) != null && engmap.get(xmlPropertyData.getId()).size() > 0){
					englist = engmap.get(xmlPropertyData.getId());
					englist.add(tmpValue);	
				}else{
					englist = new ArrayList<String>();
					englist.add(tmpValue);
				}								
			}else{				
				engmap = new HashMap<String, ArrayList<String>>();
				englist = new ArrayList<String>();
				englist.add(tmpValue);
			}
			engmap.put(xmlPropertyData.getId(), englist);
			englishMap_ar = engmap;
		}

		if(element.equalsIgnoreCase("ar"+xmlPropertyData.getId())){
			xmlPropertyData.setAr( tmpValue );
			if(arabicMap_ar != null && arabicMap_ar.size() > 0){
				arabicmap = arabicMap_ar;
				if(arabicmap.get(xmlPropertyData.getId()) != null && arabicmap.get(xmlPropertyData.getId()).size() > 0){
					arabiclist = arabicmap.get(xmlPropertyData.getId());
					arabiclist.add(tmpValue);					
				}else{
					arabiclist = new ArrayList<String>();
					arabiclist.add(tmpValue);
				}								
			}else{
				arabicmap = new HashMap<String, ArrayList<String>>();
				arabiclist = new ArrayList<String>();
				arabiclist.add(tmpValue);
			}	
			arabicmap.put(xmlPropertyData.getId(), arabiclist);
			arabicMap_ar = arabicmap;
		}
	}
	@Override
	public void characters(char[] ac, int i, int j) throws SAXException {
		tmpValue = new String(ac, i, j);
	}

	public void buildXmlPropertyMap() {
		logger.info("in XMLResourcebundle");

		if( null != this.xmlPropertyList ) {

			for(XmlResourceBundleData bundleItem : this.xmlPropertyList ) {

				if( null != bundleItem ) {

					if ( Utilities.isNull( bundleItem.getId() ) ==false ) {

						arabicMap.put( bundleItem.getId(), bundleItem.ar );
						englishMap.put(bundleItem.getId(), bundleItem.en);
						allKeysMap.put(bundleItem.en,bundleItem.ar);						
					}
				} else {
					logger.info( "Property Id Not Found");
				}
			}


			if( englishMap.isEmpty() == false && englishMap.isEmpty() == false ) {

				logger.info("XMLResource Bundle processed successfully");
			} else {

				logger.error("XMLResource Bundle processe failed");
			}
		} else {

			logger.error("Unable to create Languagebased Map for XMLResourceBundle.xml");
		}
	}
}

