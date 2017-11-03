package com.tiany.designpatterns.weatherdata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiany on 2017/11/2.
 */
public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observers.indexOf(observer) < 0){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.indexOf(observer) >= 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
