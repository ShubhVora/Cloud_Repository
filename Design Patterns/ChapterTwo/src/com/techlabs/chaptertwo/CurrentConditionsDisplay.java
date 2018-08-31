package com.techlabs.chaptertwo;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature, humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
