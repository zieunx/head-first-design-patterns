package com.book.headfirst.chapter2.pull.observer;

import com.book.headfirst.chapter2.pull.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemperature;
	private float minTemperature;
	private float temperatureSum;
	private float count;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this); // todo: weatherData 에 구독하는 역할을 display 가 하고 있으메?
	}

	@Override
	public void update() {
		temperatureSum += weatherData.getTemperature();
		count++;
		this.maxTemperature = Math.max(this.maxTemperature, weatherData.getTemperature());
		this.minTemperature = Math.min(this.minTemperature, weatherData.getTemperature());
		display();
	}

	@Override
	public void display() {
		System.out.printf("평균/최고/최저 온도 = %.1f/%.1f/%.1f%n", (temperatureSum / count), minTemperature, minTemperature);
	}
}
