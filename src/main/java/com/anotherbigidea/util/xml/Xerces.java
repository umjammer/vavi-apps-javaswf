package com.anotherbigidea.util.xml;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * Utilities for using the Apache Xerces XML Parser
 */
public class Xerces {

    static SAXParser parser;

    static {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void parse(DefaultHandler handler, InputStream in) throws SAXException, IOException {
        InputSource source = new InputSource(in);
        parser.parse(source, handler);
        in.close();
    }
}
