package com.techlabs.refactor;

import java.time.LocalDateTime;

public class Txt implements ILogType{

	public void display(LocalDateTime now,Exception errorMessage){
	   	 System.out.println(now +" It is in TXT\nError message:\t"+ errorMessage.getMessage());
	    }

}
