package com.techlabs.biomass;

public class Biomass {
	private double weight;
	private double height;
	
	void setparameter(double weight, double height)
	{
		this.height=height;
		this.weight=weight;
	}
	
	public String caculateBMI()
	{
		double BMI= weight/(height*height);
		return "Calcuated BMI=\t"+BMI+"\n"+checkStatus(BMI);
	}

    String checkStatus(double BMI)
	{
    	if( 0<=BMI|| BMI<19)
		 return "underweight";
    	else if(9<=BMI|| BMI<25)
		 return "normal";
    	else
		 return "overweight";
    	
	}
    public void eat(int meal)
    {
    	if(meal>=4)
    	this.weight+=1;
    }
    public void workout(int work)
    {
    	if(work>=45)
    		this.weight-=1;
    	
    }
    public double getWeight()
    {
    	return this.weight;
    }
}
