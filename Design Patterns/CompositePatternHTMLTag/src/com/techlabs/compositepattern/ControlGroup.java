package com.techlabs.compositepattern;

import java.util.ArrayList;

public class ControlGroup implements IHTMLTag {

	private String tagName;
	private ArrayList<IHTMLTag> htmlTags = new ArrayList<IHTMLTag>();

	public ControlGroup(String tagName) {
		this.tagName = tagName;
	}

	@Override
	public void generateHTML() {
		System.out.println("<" + tagName + ">");
		for (IHTMLTag control : htmlTags) {
			control.generateHTML();
		}
		System.out.println("</" + tagName + ">");
	}

	public void add(IHTMLTag control) {
		htmlTags.add(control);
	}

	public String getTagName() {
		return tagName;
	}

	public ArrayList<IHTMLTag> getList() {
		return this.htmlTags;
	}
}
