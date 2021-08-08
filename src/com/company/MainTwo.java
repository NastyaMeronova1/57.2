package com.company;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class MainTwo {

    public static void main(String[] args) {

        System.out.println("----------------------Parsing trough SAX ------------------------------------");
        SAXParserFactory factorySAX = SAXParserFactory.newInstance();
        SAXParser saxParser = null;
        try {
            saxParser = factorySAX.newSAXParser();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        DefaultHandler handler = new DefaultHandler() {
            boolean bgeopluginRequest = false, bgeopluginStatus = false, bgeopluginDelay = false,
                    bgeopluginCity = false, bgeopluginRegion = false, bgeopluginRegionCode = false,
                    bgeopluginRegionName = false, bgeopluginAreaCode = false,
                    bgeopluginDmaCode = false, bgeopluginCountryCode = false, bgeopluginCountryName = false,
                    bgeopluginInEU = false, bgeopluginEuVATrate = false, bgeopluginContinentCode = false,
                    bgeopluginContinentName = false, bgeopluginLatitude = false, bgeopluginLongitude = false,
                    bgeopluginLocationAccuracyRadius = false, bgeopluginTimezone = false, bgeopluginCurrencyCode = false,
                    bgeopluginCurrencySymbol = false,
                    bgeopluginCurrencySymbol_UTF8 = false, bgeopluginCurrencyConverter = false;


            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                if (qName.equalsIgnoreCase("geopluginRequest")) {
                    bgeopluginRequest = true;
                }
                if (qName.equalsIgnoreCase("geopluginStatus")) {
                    bgeopluginStatus = true;
                }
                if (qName.equalsIgnoreCase("geopluginDelay")) {
                    bgeopluginDelay = true;
                }
                if (qName.equalsIgnoreCase("geopluginCity")) {
                    bgeopluginCity = true;
                }
                if (qName.equalsIgnoreCase("geopluginRegion")) {
                    bgeopluginRegion = true;
                }
                if (qName.equalsIgnoreCase("geopluginRegionCode")) {
                    bgeopluginRegionCode = true;
                }
                if (qName.equalsIgnoreCase("geopluginRegionName")) {
                    bgeopluginRegionName = true;
                }
                if (qName.equalsIgnoreCase("geopluginAreaCode")) {
                    bgeopluginAreaCode = true;
                }
                if (qName.equalsIgnoreCase("geopluginDmaCode")) {
                    bgeopluginDmaCode = true;
                }
                if (qName.equalsIgnoreCase("geopluginCountryCode")) {
                    bgeopluginCountryCode = true;
                }
                if (qName.equalsIgnoreCase("bgeopluginCountryCode")) {
                    bgeopluginCountryCode = true;
                }
                if (qName.equalsIgnoreCase("geopluginCountryName")) {
                    bgeopluginCountryName = true;
                }
                if (qName.equalsIgnoreCase("geopluginInEU")) {
                    bgeopluginInEU = true;
                }
                if (qName.equalsIgnoreCase("bgeopluginCountryCode")) {
                    bgeopluginCountryCode = true;
                }
                if (qName.equalsIgnoreCase("geopluginEuVATrate")) {
                    bgeopluginEuVATrate = true;
                }
                if (qName.equalsIgnoreCase("geopluginContinentCode")) {
                    bgeopluginContinentCode = true;
                }
                if (qName.equalsIgnoreCase("geopluginContinentName")) {
                    bgeopluginContinentName = true;
                }
                if (qName.equalsIgnoreCase("geopluginLatitude")) {
                    bgeopluginLatitude = true;
                }
                if (qName.equalsIgnoreCase("geopluginLongitude")) {
                    bgeopluginLongitude = true;
                }
                if (qName.equalsIgnoreCase("geopluginLocationAccuracyRadius")) {
                    bgeopluginLocationAccuracyRadius = true;
                }
                if (qName.equalsIgnoreCase("geopluginTimezone")) {
                    bgeopluginTimezone = true;
                }
                if (qName.equalsIgnoreCase("geopluginCurrencyCode")) {
                    bgeopluginCurrencyCode = true;
                }
                if (qName.equalsIgnoreCase("geopluginCurrencySymbol")) {
                    bgeopluginCurrencySymbol = true;
                }
                if (qName.equalsIgnoreCase("geopluginCurrencySymbol_UTF8")) {
                    bgeopluginCurrencySymbol_UTF8 = true;
                }
                if (qName.equalsIgnoreCase("geopluginCurrencyConverter")) {
                    bgeopluginCurrencyConverter = true;
                }

            }

            public void endElement(String uri, String localName, String qName) throws SAXException {

            }

            public void characters(char ch[], int start, int lenght) throws SAXException {
                if (bgeopluginRequest) {
                    System.out.println("geopluginRequest : " + new String(ch, start, lenght));
                    bgeopluginRequest = false;
                }
                if (bgeopluginStatus) {
                    System.out.println("geopluginStatus : " + new String(ch, start, lenght));
                    bgeopluginStatus = false;
                }
                if (bgeopluginDelay) {
                    System.out.println("geopluginDelay : " + new String(ch, start, lenght));
                    bgeopluginDelay = false;
                }
                if (bgeopluginCity) {
                    System.out.println("geopluginCity : " + new String(ch, start, lenght));
                    bgeopluginCity = false;
                }
                if (bgeopluginRegion) {
                    System.out.println("geopluginRegion : " + new String(ch, start, lenght));
                    bgeopluginRegion = false;
                }
                if (bgeopluginRegionCode) {
                    System.out.println("geopluginRegionCode : " + new String(ch, start, lenght));
                    bgeopluginRegionCode = false;
                }
                if (bgeopluginRegionName) {
                    System.out.println("geopluginRegionName : " + new String(ch, start, lenght));
                    bgeopluginRegionName = false;
                }
                if (bgeopluginAreaCode) {
                    System.out.println("geopluginAreaCode : " + new String(ch, start, lenght));
                    bgeopluginAreaCode = false;
                }
                if (bgeopluginDmaCode) {
                    System.out.println("geopluginDmaCode : " + new String(ch, start, lenght));
                    bgeopluginDmaCode = false;
                }
                if (bgeopluginCountryCode) {
                    System.out.println("geopluginCountryCode : " + new String(ch, start, lenght));
                    bgeopluginCountryCode = false;
                }
                if (bgeopluginCountryName) {
                    System.out.println("geopluginCountryName : " + new String(ch, start, lenght));
                    bgeopluginCountryName = false;
                }
                if (bgeopluginInEU) {
                    System.out.println("geopluginInEU : " + new String(ch, start, lenght));
                    bgeopluginInEU = false;
                }
                if (bgeopluginEuVATrate) {
                    System.out.println("geopluginEuVATrate : " + new String(ch, start, lenght));
                    bgeopluginEuVATrate = false;
                }
                if (bgeopluginContinentCode) {
                    System.out.println("geopluginContinentCode : " + new String(ch, start, lenght));
                    bgeopluginContinentCode = false;
                }
                if (bgeopluginContinentName) {
                    System.out.println("geopluginContinentName : " + new String(ch, start, lenght));
                    bgeopluginContinentName = false;
                }
                if (bgeopluginLatitude) {
                    System.out.println("geopluginLatitude : " + new String(ch, start, lenght));
                    bgeopluginLatitude = false;
                }
                if (bgeopluginLongitude) {
                    System.out.println("geopluginLongitude : " + new String(ch, start, lenght));
                    bgeopluginLongitude = false;
                }
                if (bgeopluginLocationAccuracyRadius) {
                    System.out.println("geopluginLocationAccuracyRadius : " + new String(ch, start, lenght));
                    bgeopluginLocationAccuracyRadius = false;
                }
                if (bgeopluginTimezone) {
                    System.out.println("geopluginTimezone : " + new String(ch, start, lenght));
                    bgeopluginTimezone = false;
                }
                if (bgeopluginCurrencyCode) {
                    System.out.println("geopluginCurrencyCode : " + new String(ch, start, lenght));
                    bgeopluginCurrencyCode = false;
                }
                if (bgeopluginCurrencySymbol) {
                    System.out.println("geopluginCurrencySymbol : " + new String(ch, start, lenght));
                    bgeopluginCurrencySymbol = false;
                }
                if (bgeopluginCurrencySymbol_UTF8) {
                    System.out.println("geopluginCurrencySymbol_UTF8 : " + new String(ch, start, lenght));
                    bgeopluginCurrencySymbol_UTF8 = false;
                }
                if (bgeopluginCurrencyConverter) {
                    System.out.println("geopluginCurrencyConverter : " + new String(ch, start, lenght));
                    bgeopluginCurrencyConverter = false;
                }


            }
        };
        try {
            saxParser.parse("index.xml", handler);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

}





