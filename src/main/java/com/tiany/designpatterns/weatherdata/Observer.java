package com.tiany.designpatterns.weatherdata;

/**
 * Created by tiany on 2017/11/2.
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

}
