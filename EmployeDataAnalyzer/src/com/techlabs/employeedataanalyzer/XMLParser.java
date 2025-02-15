package com.techlabs.employeedataanalyzer;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLParser {

	DocumentBuilderFactory docFactory;
	DocumentBuilder docBuilder;
	Document doc;
	ArrayList<Element> currentElement = new ArrayList<Element>();
	int count = 0, index = -1;

	public XMLParser() throws Exception {
		docFactory = DocumentBuilderFactory.newInstance();
		docBuilder = docFactory.newDocumentBuilder();
		doc = docBuilder.newDocument();
	}

	public void generateXML(Employee parentList, Element element) {
		try {
			if (count == 0) {
				doc.appendChild(element);
				count++;
			} else {
				currentElement.get(index).appendChild(element);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void generateXMLFile(ArrayList<Employee> parentList) {

		for (Employee employee : parentList) {
			Element element = doc.createElement("Employee");
			element.setAttribute("name", employee.getName());
			generateXML(employee, element);
			if (!employee.getChildEmployeeList().isEmpty()) {
				index++;
				currentElement.add(element);
				generateXMLFile(employee.getChildEmployeeList());
				index--;
				currentElement.remove(element);
			}
		}
	}

	public void writeInXml() {
		try {

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("Employee.xml"));
			transformer.transform(source, result);
			System.out.println("File saved!");

		} catch (Exception e) {
			System.out.print(e);
		}

	}

}
