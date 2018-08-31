package com.techlabs.dipviolation;

import java.time.LocalDateTime;

public class Txt {
	
	public void display(String now,Exception errorMessage){
   	 System.out.println(now +" It is in TXT\nError message:\t"+ errorMessage.getMessage());
    }

}
