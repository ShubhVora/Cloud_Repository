package com.techlabs.Sum_Area_Rectangle;

public class Rectangle {
	
	private int Height, Width;
	String color;
	void setHeight(int Height)
	{
		this.Height=check(Height);
	}
	void setWidth(int Width)
	{
		this.Width=check(Width);
	}
	void setColor(String color)
	{
		this.color=color;
	}
    int getHeight()
    {
    	return this.Height;
    }
    int getWidth()
    {
    	return this.Width;
    }
	static int check(int var) {
		if (var < 1)
			return 1;
		else if (var > 100)
			return 100;
		else
			return var;
	}
	 
	 int CalculateArea()
	 {
		 return this.Height*this.Width;
	 }
	 
	 String checkColor()
	 {
		int red=0,green=1,blue=2;
		
		switch(color)
		{
	
		case "red":
			return "red";
		case "green":
			return "green";
		case "blue":
			return "blue";
		default:
			return "red";
			
		}
	}

}
