package com.techlabs.chaptertwo;


import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature, humidity, pressure;

	public WeatherData() {
	}

	public void measurementsChanged() {
		setChanged();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {

		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return this.temperature;
	}

	public float getHumidity() {
		return this.humidity;
	}

	public float getPressure() {
		return this.pressure;
	}

}
