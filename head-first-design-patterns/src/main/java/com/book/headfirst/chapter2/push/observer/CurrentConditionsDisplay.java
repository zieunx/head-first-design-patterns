package com.book.headfirst.chapter2.push.observer;

import com.book.headfirst.chapter2.push.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this); // todo: weatherData 에 구독하는 역할을 display 가 하고 있으메?
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.printf("현재 상태: 온도 %.1f, 습도 %.1f%n", temperature, humidity);
	}
}
