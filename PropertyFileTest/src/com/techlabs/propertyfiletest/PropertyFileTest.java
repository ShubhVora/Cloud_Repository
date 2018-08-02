package com.techlabs.propertyfiletest;

import java.util.*;  
import java.io.*;

public class PropertyFileTest {
	 
	public static void main(String[] args) throws Exception{  
	 
		  FileReader reader=new FileReader("UserDetail.properties");  
		  Properties property =new Properties();  
		  property.load(reader);  
	      
	    System.out.println(property.getProperty("user"));  
	    System.out.println(property.getProperty("password"));
	    
	}  
	} 


