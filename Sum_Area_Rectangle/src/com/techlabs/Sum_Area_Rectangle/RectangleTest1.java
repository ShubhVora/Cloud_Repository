package com.techlabs.Sum_Area_Rectangle;

import java.util.*;

public class RectangleTest1 {

	public static void main(String Args[]) {
		 int height, width, sum=0;
		 Scanner sc = new Scanner(System.in);
		 
		 Rectangle rectangleArray[]= new Rectangle[3];

		 for(int i=0; i<rectangleArray.length;i++)
		 {
			 rectangleArray[i]= new Rectangle();
	         System.out.println("Enter Height Of an Rectangle"+i);
			 height = sc.nextInt();
			 System.out.println("Enter Width Of an Rectangle"+i);
			 width = sc.nextInt();
			 rectangleArray[i].setHeight(height);
			 rectangleArray[i].setWidth(width);
			 System.out.println("Area Of Rectangle:\t"+ i+rectangleArray[i].CalculateArea());
			 sum+= rectangleArray[i].CalculateArea();	 
		 }
		 
		 System.out.println("Sum Of"+rectangleArray.length+" Rectangle:\t"+ sum);
		sc.close();
		
		
	}

}
