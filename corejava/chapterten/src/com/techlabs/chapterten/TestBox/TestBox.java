package com.techlabs.chapterten.TestBox;

public class TestBox {
	Integer i;
	int j;
	
	public static void main(String args[]){
		TestBox t=new TestBox();
		t.go();
	}
	
	public void go(){
		j=i; // Error because Objest's bydefault value is null
		System.out.println(i);
		System.out.println(j);
	}

}
