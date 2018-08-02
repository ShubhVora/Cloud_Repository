package com.techlabs.hashCodeObject;

public class HashCodeObjectTest {
	public static void main(String args[])
	 {
		 HashCodeObject obj1 = new HashCodeObject(5,4);
		 //HashCodeObject obj2 = new HashCodeObject(5,4);
		 HashCodeObject obj2=obj1;
		 
		 
		 if(obj1.hashCode()==obj2.hashCode()){
	
			 if(obj1.equals(obj2))
			 {
				 System.out.println("Objects are Equal");
			 }
			 else
			 {
				 System.out.println("Objects are not Equal");
			 }
		 }
		 else
		 {
			 System.out.println("Hash Codes are not Equal");
		 }
	 }

}
