/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.org.apache.xalan.internal.xsltc.trax;

import java.util.Vector;

import javax.xml.stream.Location;
import javax.xml.stream.XMLReporter;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;


public abstract class SAX2StAXBaseWriter extends DefaultHandler
                implements
                        LexicalHandler {


        protected boolean isCDATA;

        protected StringBuffer CDATABuffer;

        protected Vector namespaces;

        protected Locator docLocator;

        protected XMLReporter reporter;

        public SAX2StAXBaseWriter() {
        }

        public SAX2StAXBaseWriter(XMLReporter reporter) {
                this.reporter = reporter;
        }

        public void setXMLReporter(XMLReporter reporter) {
                this.reporter = reporter;
        }

        public void setDocumentLocator(Locator locator) {
                this.docLocator = locator;
        }


        public Location getCurrentLocation() {
                if (docLocator != null) {
                        return new SAXLocation(docLocator);
                } else {
                        return null;
                }

        }

        public void error(SAXParseException e) throws SAXException {
                reportException("ERROR", e);
        }

        public void fatalError(SAXParseException e) throws SAXException {
                reportException("FATAL", e);
        }

        public void warning(SAXParseException e) throws SAXException {
                reportException("WARNING", e);
        }

        public void startDocument() throws SAXException {
                    namespaces = new Vector(2);
        }

        public void endDocument() throws SAXException {
                namespaces = null;
        }

        public void startElement(String uri, String localName, String qName,
                        Attributes attributes) throws SAXException {
                        namespaces = null;
        }

        public void endElement(String uri, String localName, String qName)
                        throws SAXException {
                namespaces = null;
        }

        public void startPrefixMapping(String prefix, String uri)
                        throws SAXException {

                if (prefix == null) {
                        prefix = "";
                } else if (prefix.equals("xml")) {
                        return;
                }

                if (namespaces == null) {
                    namespaces = new Vector(2);
                }
                namespaces.addElement(prefix);
                namespaces.addElement(uri);
        }


        public void endPrefixMapping(String prefix) throws SAXException {
        }

        public void startCDATA() throws SAXException {
                isCDATA = true;
                if (CDATABuffer == null) {
                        CDATABuffer = new StringBuffer();
                } else {
                        CDATABuffer.setLength(0);
                }
        }

        public void characters(char[] ch, int start, int length)
                        throws SAXException {
                if (isCDATA) {
                        CDATABuffer.append(ch, start, length);
                }
        }

        public void endCDATA() throws SAXException {
                isCDATA = false;
                CDATABuffer.setLength(0);
        }

        public void comment(char[] ch, int start, int length) throws SAXException {
        }

        public void endDTD() throws SAXException {
        }

        public void endEntity(String name) throws SAXException {
        }

        public void startDTD(String name, String publicId, String systemId)
                        throws SAXException {
        }

        public void startEntity(String name) throws SAXException {
        }

        /**
         * Used to report a {@link SAXException}to the {@link XMLReporter}
         * registered with this handler.
         * <p>
         *  用于向向此处理程序注册的{@link XMLReporter}报告{@link SAXException}。
         * 
         */
        protected void reportException(String type, SAXException e)
                        throws SAXException {

                if (reporter != null) {
                        try {
                                reporter.report(e.getMessage(), type, e, getCurrentLocation());
                        } catch (XMLStreamException e1) {
                                throw new SAXException(e1);
                        }
                }
        }

        /**
         * Parses an XML qualified name, and places the resulting prefix and local
         * name in the provided String array.
         *
         * <p>
         *  解析XML限定名称,并将生成的前缀和本地名称放在提供的String数组中。
         * 
         * 
         * @param qName The qualified name to parse.
         * @param results An array where parse results will be placed. The prefix
         *            will be placed at <code>results[0]</code>, and the local
         *            part at <code>results[1]</code>
         */
        public static final void parseQName(String qName, String[] results) {

                String prefix, local;
                int idx = qName.indexOf(':');
                if (idx >= 0) {
                        prefix = qName.substring(0, idx);
                        local = qName.substring(idx + 1);
                } else {
                        prefix = "";
                        local = qName;
                }
                results[0] = prefix;
                results[1] = local;
        }

        /**
         * {@Link Location}implementation used to expose details from a SAX
         * {@link Locator}.
         *
         * <p>
         *  {@Link Location}实施用于从SAX {@link Locator}中显示详细信息。
         * 
         * @author christian
         */
        private static final class SAXLocation implements Location {

                private int lineNumber;
                private int columnNumber;
                private String publicId;
                private String systemId;
                private SAXLocation(Locator locator) {
                        lineNumber = locator.getLineNumber();
                        columnNumber = locator.getColumnNumber();
                        publicId = locator.getPublicId();
                        systemId = locator.getSystemId();
                }

                public int getLineNumber() {
                        return lineNumber;
                }

                public int getColumnNumber() {
                        return columnNumber;
                }

                public int getCharacterOffset() {
                        return -1;
                }

                public String getPublicId() {
                        return publicId;
                }

                public String getSystemId() {
                        return systemId;
                }
        }
}
