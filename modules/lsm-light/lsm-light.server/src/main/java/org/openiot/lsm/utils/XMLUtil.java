package org.openiot.lsm.utils;
/**
 * Copyright (c) 2011-2014, OpenIoT
 *
 * This library is free software; you can redistribute it and/or
 * modify it either under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation
 * (the "LGPL"). If you do not alter this
 * notice, a recipient may use your version of this file under the LGPL.
 *
 * You should have received a copy of the LGPL along with this library
 * in the file COPYING-LGPL-2.1; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY
 * OF ANY KIND, either express or implied. See the LGPL  for
 * the specific language governing rights and limitations.
 *
 * Contact: OpenIoT mailto: info@openiot.eu
 */
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class XMLUtil {
	public static final String userview_sign_VIEW = "view";
	public static final String userview_sign_CENTER = "center";
	public static final String userview_sign_LAT = "lat";
	public static final String userview_sign_LNG = "lng";
	public static final String userview_sign_ZOOM = "zoom";
	public static final String userview_sign_FILTER = "filter";
	public static final String userview_sign_TYPE = "type";
	public static final String userview_sign_REGION = "region";
	public static final String userview_sign_SEARCH = "search";
	public static final String userview_sign_CITY = "city";
	
	
	public static final String sensorsource_sign_ROOT = "sensorsource";
	public static final String sensorsource_sign_SOURCEURL = "url";
	//public static final String sensorsource_sign_SOURCETYPE = "sourcetype";	
	public static final String sensorsource_sign_TAGMAP = "tagmap";
	public static final String sensorsource_sign_MAP = "map";
	public static final String sensorsource_sign_VALUETAG = "valueTag";
	public static final String sensorsource_sign_PROPERTY = "property";
	public static final String sensorsource_sign_UNIT = "unit";
	
	public static final String sensorsource_sign_SENSOR = "sensormeta";
	public static final String sensorsource_sign_PLACE = "placemeta";
	public static final String sensorsource_sign_ONTOPRO = "ontologyProperty";
	
	public static Document createDocument(){
		Document document = DocumentHelper.createDocument();
		
		return document;
	}
	
	public static Element addRootToDocument(Document document, String rootName, Map<String,String> attributes){
		Element root = document.addElement(rootName);
		
		if(attributes != null){
			for(String name : attributes.keySet()){
				String value = attributes.get(name);
				root.addAttribute(name, value);
			}
		}
		return root;
	}
	
	public static Element addElementToElement(Element father, String elementName, Map<String,String> attributes, String text){
		Element element = father.addElement(elementName);		
		if(attributes != null){
			for(String name : attributes.keySet()){
				String value = attributes.get(name);
				element.addAttribute(name, value);
			}
		}
		
		if(text != null){
			element.setText(text);
		}
		
		return element;
	}

}
