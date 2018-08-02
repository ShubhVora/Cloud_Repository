package com.techlabs.dipviolation;

import java.time.LocalDateTime;

public class Win {
     public void display(LocalDateTime now, Exception errorMessage){
    	 System.out.println(now+" It is in WIN\nError message:\t"+ errorMessage.getMessage());
     }
}
