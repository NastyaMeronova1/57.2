package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        GeopluginCredit geopluginCredit = new GeopluginCredit("http://www.maxmind.com");
        GeoPlugin geoPlugin = new GeoPlugin("46.251.198.241", 200, "2ms", geopluginCredit, "Kant", "Chuyskaya Oblast", "C", "Chuyskaya Oblast'", 77, 8, "KG", "Kyrgyzstan", 0, "AS", "Asia", "Asia", 2.2, 22.0, 1, "Asia/Bishkek", "KGS", "&#1083;&#1074;", "LV", 1);
        ObjectMapper mapper = new XmlMapper();
        String xml = mapper.writeValueAsString(geoPlugin);
        GeoPlugin pluginFromXml = mapper.readValue(xml, GeoPlugin.class);
        //  System.out.println("Mapping to XML and shuffling the places--------------------------------------------------");
        System.out.println("Mapping to XML --------------------------------------------------");
        System.out.println(xml);
        System.out.println("");
        System.out.println("Mapping from XML to class-----------------------------------------");
        System.out.println(pluginFromXml);
        String filePath = "index.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dbuilder;

        try {
            dbuilder = dfactory.newDocumentBuilder();
            Document doc = dbuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            System.out.println("Parsing xml trough DOM -----------------------------");
            NodeList nodeList = doc.getElementsByTagName("GeoPlugin");
            List<GeoPlugin> geoPluginList = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                geoPluginList.add(getGeoPlugin(nodeList.item(i)));
            }
            for (GeoPlugin plugin : geoPluginList) {
                System.out.println(plugin);

            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }

    private static GeoPlugin getGeoPlugin(Node node) {
        GeoPlugin geoPlugin = new GeoPlugin();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            geoPlugin.setGeopluginRequest(getTagValue("geopluginRequest", element));
            geoPlugin.setGeopluginStatus(Integer.parseInt(getTagValue("geopluginStatus", element)));
            geoPlugin.setGeopluginDelay(getTagValue("geopluginDelay", element));
            geoPlugin.setGeopluginCredits(geoPlugin.getGeopluginCredits());
            geoPlugin.setGeopluginCity(getTagValue("geopluginCity", element));
            geoPlugin.setGeopluginRegion(getTagValue("geopluginRegion", element));
            geoPlugin.setGeopluginRegionCode(getTagValue("geopluginRegionCode", element));
            geoPlugin.setGeopluginRegionName(getTagValue("geopluginRegionName", element));
            geoPlugin.setGeopluginAreaCode(Integer.parseInt(getTagValue("geopluginAreaCode", element)));
            geoPlugin.setGeopluginDmaCode(Integer.parseInt(getTagValue("geopluginDmaCode", element)));
            geoPlugin.setGeopluginCountryCode(getTagValue("geopluginCountryCode", element));
            geoPlugin.setGeopluginCountryName(getTagValue("geopluginCountryName", element));
            geoPlugin.setGeopluginInEU(Integer.parseInt(getTagValue("geopluginInEU", element)));
            geoPlugin.setGeopluginEuVATrate(getTagValue("geopluginEuVATrate", element));
            geoPlugin.setGeopluginContinentCode(getTagValue("geopluginContinentCode", element));
            geoPlugin.setGeopluginContinentName(getTagValue("geopluginContinentName", element));
            geoPlugin.setGeopluginLatitude(Double.parseDouble(getTagValue("geopluginLatitude", element)));
            geoPlugin.setGeopluginLongitude(Double.parseDouble(getTagValue("geopluginLongitude", element)));
            geoPlugin.setGeopluginLocationAccuracyRadius(Integer.parseInt(getTagValue("geopluginLocationAccuracyRadius", element)));
            geoPlugin.setGeopluginTimezone(getTagValue("geopluginTimezone", element));
            geoPlugin.setGeopluginCurrencyCode(getTagValue("geopluginCurrencyCode", element));
            geoPlugin.setGeopluginCurrencySymbol(getTagValue("geopluginCurrencySymbol", element));
            geoPlugin.setGeopluginCurrencySymbol_UTF8(getTagValue("geopluginCurrencySymbol_UTF8", element));
            geoPlugin.setGeopluginCurrencyConverter(Double.parseDouble(getTagValue("geopluginCurrencyConverter", element)));
        }
        return geoPlugin;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }


}

