package com.tiany.designpatterns.weatherdata;

/**
 * Created by tiany on 2017/11/2.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(90, 80, 70);
    }
}
