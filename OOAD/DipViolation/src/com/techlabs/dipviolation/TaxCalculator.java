package com.techlabs.dipviolation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaxCalculator {
	LogType typeAdd;
	
	
	public TaxCalculator(LogType typeAdd){
		this.typeAdd=typeAdd;
	}
	
	public int Calculate(int amount, int rate){
	   try{
		int r = amount/rate;
		return r;
	   }catch(Exception errorMessage)
	   {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now(); 
			if(typeAdd==LogType.XML)
			{
				Xml object = new Xml();
				object.display(now,errorMessage);
			}else if(typeAdd==LogType.WIN)
			{
				Win object = new Win();
				object.display(now,errorMessage);
			}if(typeAdd==LogType.TXT)
			{
				Txt object = new Txt();
				object.display(now,errorMessage);
			}
	   }
	   return 0;
	}

}
