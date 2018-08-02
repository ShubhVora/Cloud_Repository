package com.techlabs.refactor;

import java.time.LocalDateTime;

public class Win implements ILogType {
	
	 public void display(LocalDateTime now, Exception errorMessage){
    	 System.out.println(now+" It is in WIN\nError message:\t"+ errorMessage.getMessage());
     }

}
