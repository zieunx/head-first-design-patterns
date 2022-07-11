package com.book.headfirst.chapter2.subject.pull;

import org.junit.jupiter.api.Test;

import com.book.headfirst.chapter2.push.observer.CurrentConditionsDisplay;
import com.book.headfirst.chapter2.push.observer.ForecastDisplay;
import com.book.headfirst.chapter2.push.observer.HeatIndexDisplay;
import com.book.headfirst.chapter2.push.observer.StatisticsDisplay;
import com.book.headfirst.chapter2.push.subject.WeatherData;

class WeatherDataTest {
	@Test
	void 가상_스테이션_테스트() {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}