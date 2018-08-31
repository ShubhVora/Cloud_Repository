package com.techlabs.compositepattern.test;

import com.techlabs.compositepattern.Control;
import com.techlabs.compositepattern.ControlGroup;

public class CompositePatternTest {
	public static void main(String args[]) {
		ControlGroup html = new ControlGroup("Html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div1 = new ControlGroup("div");
		Control p = new Control("p");
		Control textbox = new Control("textbox");
		ControlGroup div2 = new ControlGroup("div");
		
		html.add(body);
		body.add(div1);
		div1.add(p);
		Control a = new Control("a");

		body.add(div2);
		div2.add(a);
		div2.add(textbox);

		html.generateHTML();
	}

}
