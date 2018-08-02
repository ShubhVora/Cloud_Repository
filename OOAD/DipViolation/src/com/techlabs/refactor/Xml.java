package com.techlabs.refactor;

import java.time.LocalDateTime;

public class Xml implements ILogType {
	public void display(LocalDateTime now,Exception errorMessage){
	   	 System.out.println(now +" It is in XML\nError message:\t"+ errorMessage.getMessage());
	    }

}
