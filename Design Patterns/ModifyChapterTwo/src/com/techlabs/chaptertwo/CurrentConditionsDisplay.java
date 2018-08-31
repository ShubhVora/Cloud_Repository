package com.techlabs.chaptertwo;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Observable observable;
	private float temperature, humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		super();
		this.observable = observable;
		observable.addObserver(this);;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
		}
	}

}
