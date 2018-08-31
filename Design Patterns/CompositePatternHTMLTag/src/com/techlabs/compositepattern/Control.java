package com.techlabs.compositepattern;

public class Control implements IHTMLTag {

	public String tagName;

	public Control(String tagName) {
		this.tagName = tagName;
	}

	@Override
	public void generateHTML() {
		System.out.println("<" + this.tagName + ">");
		System.out.println("</" + this.tagName + ">");
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
